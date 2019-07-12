drop table if exists visit;
drop table if exists procedure;
drop table if exists pet_owner;
drop table if exists owner;
drop table if exists pet_type;
drop table if exists type;
drop table if exists pet;

CREATE TABLE pet (

        pet_id serial primary key,
        name varchar(20),
        age int
);

CREATE TABLE type (

        type_id serial primary key,
        category varchar(20)
);

CREATE TABLE pet_type (
        pet_id int,
        type_id int,
        
        PRIMARY KEY (pet_id, type_id),
        CONSTRAINT fk_pet_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id),
        CONSTRAINT fk_type_type_id FOREIGN KEY (type_id) REFERENCES type(type_id)

);

CREATE TABLE owner (
        owner_id serial primary key,
        first_name varchar(20) not null,
        last_name varchar(20) not null
);

CREATE TABLE pet_owner (
        pet_id int,
        owner_id int,
        
        PRIMARY KEY (pet_id, owner_id),
        CONSTRAINT fk_pet_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id),
        CONSTRAINT fk_owner_owner_id FOREIGN KEY (owner_id) REFERENCES owner(owner_id)

);

CREATE TABLE procedure (
        procedure_id serial primary key,
        name varchar(35)
);

CREATE TABLE visit (
        visit_id serial primary key,
        pet_id int,
        date varchar(25) not null,
        procedure_id int,
        
        CONSTRAINT fk_pet_pet_id FOREIGN KEY (pet_id) REFERENCES pet(pet_id),
        CONSTRAINT fk_procedure_procedure_id FOREIGN KEY (procedure_id) REFERENCES procedure(procedure_id)
       
);






        