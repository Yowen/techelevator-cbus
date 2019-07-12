DROP TABLE IF EXISTS cost;
DROP TABLE IF EXISTS address;

create table address (
        owner_id int not null,
        line_one varchar(255) not null,
        line_two varchar(255),
        line_three varchar(255),
        city varchar(255) not null,
        province varchar(64) not null,
        postalcode varchar(20) not null,
        
        constraint fk_owner_owner_id foreign key (owner_id) references owner(owner_id)
);

CREATE TABLE cost (
        procedure_id int not null,
        type_id int not null,
        cost decimal not null,
        
        constraint fk_type_type_id foreign key (type_id) references type(type_id),
        constraint fk_procedure_procedure_id foreign key (procedure_id) references procedure(procedure_id)

);