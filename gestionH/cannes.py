from app import app, db
from app.models import User, Hotel, Service, Place, Pro, Film, Type


@app.shell_context_processor
def make_shell_context():
    return {'db': db, 'User': User, 'Hotel': Hotel, 'Service': Service,
            'Place': Place, 'Pro': Pro, 'Type': Type, 'Film': Film}
