from app import db
from werkzeug.security import generate_password_hash, check_password_hash
from flask_login import UserMixin
from app import login


class User(UserMixin, db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(64), index=True, unique=True)
    statut = db.Column(db.Boolean, default=True)
    password_hash = db.Column(db.String(128))

    def set_password(self, password):
        self.password_hash = generate_password_hash(password)

    def check_password(self, password):
        return check_password_hash(self.password_hash, password)


@login.user_loader
def load_user(id):
    return User.query.get(int(id))


def __repr__(self):
    return '<User {}>'.format(self.username)


class Hotel(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(64), index=True, unique=True)
    type = db.Column(db.String(64))
    numb_place = db.Column(db.Integer)
    resp_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    owner_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    resp = db.relationship('User', uselist=False, foreign_keys='Hotel.resp_id')
    owner = db.relationship('User', uselist=False,
                            foreign_keys='Hotel.owner_id')
    services = db.relationship('Service', backref='hotel')
    places = db.relationship('Place', backref='hotel')

    def __repr__(self):
        return '<Hotel {}>'.format(self.name)


class Service(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(64), index=True, unique=True)
    descr = db.Column(db.String(300))
    hotel_id = db.Column(db.Integer, db.ForeignKey('hotel.id'))

    def __repr__(self):
        return '<Service {}>'.format(self.name)


class Place(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    nbr_pl = db.Column(db.Integer)
    date = db.Column(db.Date, index=True)
    hotel_id = db.Column(db.Integer, db.ForeignKey('hotel.id'))

    def __repr__(self):
        return f'<Place {self.nbr_pl}><Date {self.date}>'

    @staticmethod
    def change_pl(nbr_pl, date, hotel):
        for pl in hotel.places:
            if pl.date == date:
                pl.nbr_pl = nbr_pl
        db.session.commit()


class Pro(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    statut = db.Column(db.String(10), default='jury')
    name = db.Column(db.String(64), index=True, unique=True)
    surname = db.Column(db.String(64))
    # si fait partie d'une équipe de film
    film_id = db.Column(db.Integer, db.ForeignKey('film.id'))
    eqfilm = db.relationship('Film', foreign_keys='Pro.film_id')
    # si fait partie d'un jury
    type_id = db.Column(db.Integer, db.ForeignKey('type.id'))
    typejury = db.relationship('Type', foreign_keys='Pro.type_id')

    def __repr__(self):
        return f'<Pro {self.name}>'


class Film(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(64), index=True, unique=True)
    resume = db.Column(db.String(64))
    type_id = db.Column(db.Integer, db.ForeignKey('type.id'))
    equipe = db.relationship('Pro', backref='film')

    def __repr__(self):
        return f'<Film {self.title}>'


class Type(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(64), index=True, unique=True)
    films = db.relationship('Film', uselist=False, backref='type')

    def __repr__(self):
        return f'<Type_film {self.name}>'


class Assign(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    pro_name = db.Column(db.String(64), db.ForeignKey('pro.name'))
    hotel_name = db.Column(db.String(64), db.ForeignKey('hotel.name'))
    date_deb = db.Column(db.Date)
    date_fin = db.Column(db.Date)

    def __repr__(self):
        return f'<Assign {self.pro_name}|{self.hotel_name}>'
