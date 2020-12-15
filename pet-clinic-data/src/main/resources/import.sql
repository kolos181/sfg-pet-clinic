insert into owners (first_name, last_name, address, city, telephone) values ('karabas', 'barabas','Chornovola st.','Sacramento', '+38099332201')
insert into owners (first_name, last_name, address, city, telephone) values ('Michael', 'Jordan','Baker st','Chicago', '+38043424244')
insert into owners (first_name, last_name, address, city, telephone) values ('Michael', 'Phelps','Barker st','Wisconsin city', '+38043223344')
insert into owners (first_name, last_name, address, city, telephone) values ('James', 'Wilson','Valua st.','Princeton', '+380434356623')
insert into owners (first_name, last_name, address, city, telephone) values ('William', 'Shatner','Saint st','Pasadena', '+3804423456')

insert into types (name) values ('dog')
insert into types (name) values ('cat')
insert into types (name) values ('bird')
insert into types (name) values ('snake')
insert into types (name) values ('camel')

insert into pet (birth_date, name, owner_id, type_id) values ('2001-12-12', 'Mishkah', 1, 1)
insert into pet (birth_date, name, owner_id, type_id) values ('2001-12-12', 'Spotty', 2, 2)
insert into pet (birth_date, name, owner_id, type_id) values ('2001-12-12', 'Mickey', 3, 3)
insert into pet (birth_date, name, owner_id, type_id) values ('2001-12-12', 'Droopy', 4, 4)
insert into pet (birth_date, name, owner_id, type_id) values ('2001-12-12', 'Smiley', 5, 1)

insert into speciality (description) values ('ass doctor')
insert into speciality (description) values ('eye doctor')
insert into speciality (description) values ('left toe doctor')
insert into speciality (description) values ('infectologist')
insert into speciality (description) values ('dermatologist')
insert into speciality (description) values ('neurologist')

insert into vets (first_name, last_name) values ('Bob', 'Odenkirk')
insert into vets (first_name, last_name) values ('Bryan', 'Cranston')
insert into vets (first_name, last_name) values ('Aaron', 'Paul')
insert into vets (first_name, last_name) values ('Walter', 'Mitty')
insert into vets (first_name, last_name) values ('Anna', 'Gunn')
insert into vets (first_name, last_name) values ('Giancarlo', 'Esposito')

insert into vet_specialities (vet_id, speciality_id) values (1,2);
insert into vet_specialities (vet_id, speciality_id) values (2,1);
insert into vet_specialities (vet_id, speciality_id) values (3,4);
insert into vet_specialities (vet_id, speciality_id) values (4,3);
insert into vet_specialities (vet_id, speciality_id) values (5,5);