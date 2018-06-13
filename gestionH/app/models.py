from app import db


class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    username = db.Column(db.String(64), index=True, unique=True)
    statut = db.Column(db.Boolean, unique=True, default=True)
    password_hash = db.Column(db.String(128))


def __repr__(self):
    return '<User {}>'.format(self.username)


class Hotel(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    name = db.Column(db.String(64), index=True, unique=True)
    type = db.Column(db.String(64))
    num_place = db.Column(db.Integer)
    resp_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    owner_id = db.Column(db.Integer, db.ForeignKey('user.id'))
    resp = db.relationship('User', uselist=False, foreign_keys='Hotel.resp_id')
    owner = db.relationship('User', uselist=False, foreign_keys='Hotel.owner_id')


def __repr__(self):
    return '<Hotel {}>'.format(self.body)
