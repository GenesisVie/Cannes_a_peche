from flask_wtf import FlaskForm
from wtforms import StringField, PasswordField, BooleanField, SubmitField, IntegerField
from wtforms.validators import DataRequired


class LoginForm(FlaskForm):
    username = StringField('Username', validators=[DataRequired()])
    password = PasswordField('Password', validators=[DataRequired()])
    remember_me = BooleanField('Remember Me')
    submit = SubmitField('Sign In')


class PlaceForm(FlaskForm):
    number = IntegerField('Nouveau nombre de place :',
                          validators=[DataRequired()])
    jour = IntegerField('Numero jour :', validators=[DataRequired()])
    hotel = IntegerField('Hotel id :', validators=[DataRequired()])
    submit = SubmitField('OK')


class NewService(FlaskForm):
    nameS = StringField('Nom nouveau service :', validators=[DataRequired()])
    descrS = StringField('Description service :', validators=[DataRequired()])
    hotel = IntegerField('Numero Hotel:', validators=[DataRequired()])
    submitS = SubmitField('OK')
