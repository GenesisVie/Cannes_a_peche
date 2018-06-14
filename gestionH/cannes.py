from app import app, db
from app.models import User, Hotel, Service, Place


@app.shell_context_processor
def make_shell_context():
    return {'db': db, 'User': User, 'Hotel': Hotel, 'Service': Service,
            'Place': Place}
