from datetime import date

u = User(username = 'Pierre-Louis', statut = True)
u.set_password('kaka')

i = User(username = 'David', statut = True)
i.set_password('salu')

r = User(username = 'Gerrard', statut = False)
r.set_password('resp')

h = Hotel(id = 1, name = 'Beaux rivages', type = "Hotel", numb_place=30, resp_id= 3, owner_id = 1)
k = Hotel(id = 3, name = 'Chez Max et Lili', type = "Villa", numb_place=10, resp_id= 3, owner_id = 2)
ho = Hotel(id=4, name = 'Le grand Hotel Dieu', type="Hotel", numb_place=100, resp_id=3, owner_id = 2)
lm = Hotel(id=5, name = 'Castleroc', type="Hotel", numb_place=45, resp_id=3, owner_id = 1)
j = Hotel(id = 2, name = 'Les copains en premier', type = "Auberge", numb_place=50, resp_id= 3, owner_id = 1)

s = Service(id = 1, name ='Bar', descr='Pour se désaltérer', hotel=h)
d = Service(id = 2, name ='Sauna', descr='Eau chauffé à 35 degrés', hotel=h)

p = Place(id = 1, nbr_pl = 23, date = date(2018,5,8), hotel=h)
p1 = Place(id = 2, nbr_pl = 23, date = date(2018,5,9), hotel=h)
p2 = Place(id = 3, nbr_pl = 23, date = date(2018,5,10), hotel=h)
p3 = Place(id = 4, nbr_pl = 23, date = date(2018,5,11), hotel=h)
p4 = Place(id = 5, nbr_pl = 23, date = date(2018,5,12), hotel=h)
p5 = Place(id = 6, nbr_pl = 23, date = date(2018,5,13), hotel=h)
p6 = Place(id = 7, nbr_pl = 23, date = date(2018,5,14), hotel=h)
p7 = Place(id = 8, nbr_pl = 23, date = date(2018,5,15), hotel=h)
p8 = Place(id = 9, nbr_pl = 23, date = date(2018,5,16), hotel=h)
p9 = Place(id = 10, nbr_pl = 23, date = date(2018,5,17), hotel=h)
p10 = Place(id = 11, nbr_pl = 23, date = date(2018,5,18), hotel=h)
p11 = Place(id = 12, nbr_pl = 23, date = date(2018,5,19), hotel=h)

t = Type(id=1, name='Long métrage')
t1 = Type(id=2, name='Court métrage')
t2 = Type(id=3, name='Un certain regard')

f = Film(title ='Les Aventures de juju',resume='Une histoire banale', type=t)
f1 = Film(title='Everybody Knows',resume="Laura vit avec son mari Alejandro et leurs deux enfants à Buenos Aires. À l'occasion du mariage de sa sœur Ana, elle retourne, sans son mari, auprès de sa famille dans son village natal. Elle y retrouve notamment Paco, son ancien amant viticulteur. Mais la réunion familiale dérape lorsqu'Irene, la fille de Laura, disparaît au cours de la soirée de mariage ...",type=t)
f2 = Film(title='Yomeddine', resume="Beshay, lépreux aujourd’hui guéri, n’avait jamais quitté depuis l’enfance sa léproserie, dans le désert égyptien. Après la disparition de son épouse, il décide pour la première fois de partir à la recherche de ses racines, ses pauvres possessions entassées sur une charrette tirée par son âne", type=t)
f3 = Film(title="L'été", resume="Le sujet du film est constitué par des éléments peu connus de la biographie de Viktor Tsoi et se déroule l'été 1981 à Leningrad. La trame de l'intrigue est la rencontre et la relation du jeune Tsoi , âgé de dix-neuf ans, de Mike Naumenko (en) (du groupe Zoopark), qui a vingt-six ans, et de Natalia Naoumenko, l'épouse de Mike . Il raconte aussi la création de la salle de concert Leningrad Rock Club et l'enregistrement du premier album du groupe Kino intitulé 45", type=t)
f4 = Film(title='Plaire, aimer et courir', resume="Été 1993 : Arthur (Vincent Lacoste), étudiant à Rennes, rencontre Jacques (Pierre Deladonchamps), écrivain qui vit à Paris avec son fils. Ils se plaisent, s’aiment et, pour Jacques, il faut vite profiter leur amour avant de…", type=t)
f5 = Film(title='Gabriel', resume="Court métrage", type=t1)
f6 = Film(title='Judgement', resume="Court métrage", type=t1)
f7 = Film(title='Caroline', resume="Court métrage", type=t1)
f8 = Film(title='Ombre', resume="Court métrage", type=t1)
f9 = Film(title='Border', resume="", type=t2)
f10 = Film(title='Un grand voyage vers la nuit', resume="", type=t2)
f11 = Film(title='Sofia', resume="", type=t2)
f12 = Film(title='Les Chatouilles', resume="", type=t2)
f13 = Film(title='À genoux les gars', resume="", type=t2)

pr = Pro(statut = 'eqfilm', name = 'Fournier', surname ='Juliette',film=f)
pr1 = Pro(statut = 'eqfilm', name = 'Ananda', surname ='David',film=f)
pr2 = Pro(statut = 'eqfilm', name='Harabi', surname='Nael', film=f)
pr18 = Pro(statut = 'eqfilm', name='Lewis', surname='Mallory', film=f1)
pr19 = Pro(statut = 'eqfilm', name='Sean', surname='Isaac', film=f1)
pr20 = Pro(statut = 'eqfilm', name='Uma', surname='Grant', film=f8)
pr21 = Pro(statut = 'eqfilm', name='Madeline', surname='Ferdinand', film=f2)
pr22 = Pro(statut = 'eqfilm', name='Nissim', surname='Emerson', film=f3)
pr23 = Pro(statut = 'eqfilm', name='Remedios', surname='Ali', film=f3)
pr24 = Pro(statut = 'eqfilm', name='Benedict', surname='Martha', film=f4)
pr25 = Pro(statut = 'eqfilm', name='Reed', surname='Austin', film=f5)
pr26 = Pro(statut = 'eqfilm', name='Martena', surname='Cassady', film=f6)
pr27 = Pro(statut = 'eqfilm', name='Rina', surname='Vaughan', film=f6)
pr28 = Pro(statut = 'eqfilm', name='Abigail', surname='Lucas', film=f7)

pr3 = Pro(statut = 'jury', name ='Campion', surname='Jane', typejury=t)
pr4 = Pro(statut = 'jury', name='Bouquet', surname='Carole', typejury=t)
pr5 = Pro(statut = 'jury', name='Coppola', surname='Sofia', typejury=t)
pr6 = Pro(statut = 'jury', name='Dafoe', surname='Willem', typejury=t)
pr7 = Pro(statut = 'jury', name='Do-yeon', surname='Jeon', typejury=t)
pr8 = Pro(statut = 'jury', name='Garcia Bernal', surname='Gael', typejury=t)
pr9 = Pro(statut = 'jury', name='Kiarostami', surname='Abbas', typejury=t1)
pr29 = Pro(statut = 'jury', name='Lvovsky', surname='Noémie', typejury=t1)
pr10 = Pro(statut = 'jury', name='Thomas', surname='Daniela', typejury=t1)
pr11 = Pro(statut = 'jury', name='Saleh Haroun', surname='Mahamat', typejury=t1)
pr12 = Pro(statut = 'jury', name='Trier', surname='Joachim', typejury=t1)
pr13 = Pro(statut = 'jury', name='Trapero', surname='Pablo', typejury=t2)
pr14 = Pro(statut = 'jury', name='Becker', surname='Peter', typejury=t2)
pr15 = Pro(statut = 'jury', name='Bonnevie', surname='Maria', typejury=t2)
pr16 = Pro(statut = 'jury', name='Pailhas', surname='Géraldine', typejury=t2)
pr17 = Pro(statut = 'jury', name='Touré', surname='Moussa', typejury=t2)


db.session.add(u)
db.session.add(i)
db.session.add(r)
db.session.add(h)
db.session.add(j)
db.session.add(k)
db.session.add(ho)
db.session.add(lm)
db.session.add(s,d)
db.session.add(p)
db.session.add(p1,p2)
db.session.add(p3)
db.session.add(p4,p5)
db.session.add(p6)
db.session.add(p7,p8)
db.session.add(p9)
db.session.add(p10,p11)
db.session.add(t)
db.session.add(t1,t2)
db.session.add(f,f1)
db.session.add(f2)
db.session.add(pr,pr1)
db.session.add(pr2)
db.session.add(pr3,pr4)
db.session.add(pr5)
db.session.add(pr6,pr7)
db.session.add(pr8)
db.session.add(pr9,pr10)
db.session.add(pr11)
db.session.add(pr12,pr13)
db.session.add(pr14)
db.session.add(pr15,pr16)
db.session.add(pr17)
db.session.add(pr18,pr19)
db.session.add(pr20)
db.session.add(pr21,pr22)
db.session.add(pr23)
db.session.add(pr24,pr25)
db.session.add(pr26)
db.session.add(pr27,pr28)
db.session.add(pr29)


db.session.commit()

exit()
