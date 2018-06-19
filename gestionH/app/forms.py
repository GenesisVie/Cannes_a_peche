from flask_wtf import FlaskForm
from wtforms import StringField, PasswordField, BooleanField, SubmitField
from wtforms import IntegerField, DateField
from wtforms.validators import DataRequired
from datetime import date


class LoginForm(FlaskForm):
    username = StringField('Username', validators=[DataRequired()])
    password = PasswordField('Password', validators=[DataRequired()])
    remember_me = BooleanField('Remember Me')
    submit = SubmitField('Sign In')


class PlaceForm(FlaskForm):
    number = IntegerField('Nouveau nombre de place :',
                          validators=[DataRequired()])
    jour = IntegerField('Numero jour :', validators=[DataRequired()])
    submit = SubmitField('OK')


class NewService(FlaskForm):
    name = StringField('Nom nouveau service :', validators=[DataRequired()])
    descr = StringField('Description service :', validators=[DataRequired()])
    submit = SubmitField('OK')


class AssignForm(FlaskForm):
    hotel = StringField('Nom hotel choisi :', validators=[DataRequired()])
    date_deb = DateField('Date début :', format='%Y-%m-%d',
                         default=date(2018, 5, 8),
                         validators=[DataRequired()])
    date_fin = DateField('Date fin :', format='%Y-%m-%d',
                         default=date(2018, 5, 19),
                         validators=[DataRequired()])
    submit = SubmitField('OK')
