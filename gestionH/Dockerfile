FROM python:3.6-alpine

WORKDIR /home/Cannes_a_peche/gestionH/
RUN adduser -D cannes

COPY requirement.txt requirement.txt
RUN python -m venv venv
RUN venv/bin/pip install -r requirement.txt
RUN venv/bin/pip install gunicorn

COPY app app
COPY migrations migrations
COPY cannes.py config.py boot.sh script.sh ./
RUN chmod +x boot.sh
RUN chmod +x script.sh

ENV FLASK_APP cannes.py

RUN chown -R cannes:cannes ./
USER cannes

EXPOSE 5000
ENTRYPOINT ["./boot.sh"]
