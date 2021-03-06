from app import app, db
from flask import render_template, flash, redirect, url_for, request
from app.forms import LoginForm, PlaceForm, NewService, AssignForm
from flask_login import current_user, login_user, logout_user, login_required
from app.models import User, Hotel, Service, Pro, Assign
from werkzeug.urls import url_parse


@app.route('/', methods=['GET', 'POST'])
@app.route('/index', methods=['GET', 'POST'])
@login_required
def index():
    if current_user.statut is True:
        h = Hotel.query.filter_by(owner_id=current_user.id).all()
    else:
        h = Hotel.query.filter_by(resp_id=current_user.id).all()
    return render_template('index.html', title='Home', hotels=h)


@app.route('/login', methods=['GET', 'POST'])
def login():
    if current_user.is_authenticated:
        return redirect(url_for('index'))
    form = LoginForm()
    if form.validate_on_submit():
        user = User.query.filter_by(username=form.username.data).first()
        if user is None or not user.check_password(form.password.data):
            flash('Invalid username or password')
            return redirect(url_for('login'))
        login_user(user, remember=form.remember_me.data)
        next_page = request.args.get('next')
        if not next_page or url_parse(next_page).netloc != '':
            next_page = url_for('index')
        return redirect(next_page)
    return render_template('login.html', title='Sign In', form=form)


@app.route('/logout')
def logout():
    logout_user()
    return redirect(url_for('index'))


@app.route('/hotel/<id>', methods=['GET', 'POST'])
@login_required
def specification(id):
    h = Hotel.query.filter_by(id=id).first()
    form = PlaceForm()
    if form.validate_on_submit():
        if form.jour.data > 12 or form.number.data > h.numb_place:
            flash('Nombre de places ou numéro du jour trop élevé')
        else:
            for pl in h.places:
                if pl.id == form.jour.data:
                    pl.nbr_pl = form.number.data
                    db.session.commit()
                    return redirect(f'/hotel/{id}')
    forms = NewService()
    if forms.validate_on_submit():
        service = Service.query.filter_by(name=forms.name.data).first()
        if service:
            flash('Service déjà présent')
        else:
            s = Service(name=forms.name.data, descr=forms.descr.data,
                        hotel_id=id)
            db.session.add(s)
            db.session.commit()
    return render_template('hotel.html', hotel=h, form=form, forms=forms)


@app.route('/assign', methods=['GET', 'POST'])
@login_required
def assign():
    p = Pro.query.order_by(Pro.name).all()
    a = Assign.query.all()
    return render_template('assign.html', pros=p, assigns=a)


@app.route('/assign/<nom>', methods=['GET', 'POST'])
@login_required
def assignement(nom):
    form = AssignForm()
    r = ''
    h = []
    assigns = Assign.query.all()
    for a in assigns:
        if a.pro_name == nom:
            r = 'Réservation déjà effectué'
            return render_template('assignement.html', hotels=h, message=r,
                                   form=form)

    h = Hotel.query.all()

    def validation_hotel(hotel):
        hotels = Hotel.query.all()
        for h in hotels:
            if hotel == h.name:
                return True
        return False

    if form.validate_on_submit():
        if validation_hotel(form.hotel.data):
            a = Assign(pro_name=nom, hotel_name=form.hotel.data,
                       date_deb=form.date_deb.data,
                       date_fin=form.date_fin.data)
            db.session.add(a)
            h_modif = Hotel.query.filter_by(name=form.hotel.data).first()
            for h in h_modif.places:
                if h.date >= form.date_deb.data and h.date <= form.date_fin.data:
                    h.nbr_pl -= 1
                    if h.nbr_pl < 0:
                        h.nbr_pl = 0
                        flash('Plus de places dans cet hébergement')
            db.session.commit()
            return redirect('/assign')
        else:
            flash('Nom hotel incorrect')

    return render_template('assignement.html', hotels=h, message=r, form=form)
