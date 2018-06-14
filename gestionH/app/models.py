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
        return '<Place {}>'.format(self.nbr_pl)

    def change_pl(nbr_pl, jour, hotel):
        pl = Place.query.filter_by(id=jour)
        setattr(pl, 'nbr_pl', nbr_pl=nbr_pl)
        db.session.commit()
