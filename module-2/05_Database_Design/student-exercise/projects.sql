DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS employee_department;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
        employee_id serial primary key,
        title varchar(30) not null,
        last_name varchar(50) not null,
        first_name varchar(50) not null,
        gender varchar(6) not null,
        date_of_birth date not null,
        date_of_hire date not null
);

CREATE TABLE department (
        department_id serial primary key,
        name varchar(30) not null
);

CREATE TABLE project (
        project_id serial primary key,
        name varchar(30) not null,
        start_date date not null
);

CREATE TABLE employee_department (
        employee_id int,
        department_id int,
        
        PRIMARY KEY (employee_id, department_id),
        constraint fk_employee_employee_id foreign key (employee_id) references employee(employee_id),
        constraint fk_department_department_id foreign key (department_id) references department(department_id)
);

CREATE TABLE employee_project (
        employee_id int,
        project_id int,
        
        PRIMARY KEY (employee_id, project_id),
        constraint fk_employee_employee_id foreign key (employee_id) references employee(employee_id),
        constraint fk_project_project_id foreign key (project_id) references project(project_id)
);

INSERT INTO employee (title, last_name, first_name, gender, date_of_birth, date_of_hire)
VALUES ('Senior Developer', 'Doe', 'John', 'Male', DATE'1994-08-11', DATE'2019-06-16'),
        ('Senior Developer', 'Doe', 'Jane', 'Female', DATE'1991-07-15', DATE'2019-04-12'),
        ('Senior Developer', 'Atkins', 'Tommy', 'Male', DATE'1990-05-05', DATE'2015-05-09'),
        ('Senior Developer', 'Schmoe', 'Joe', 'Male', DATE'2000-01-01', DATE'2020-06-20'),
        ('Senior Developer', 'Oddie', 'Bill', 'Male', DATE'1999-12-13', DATE'2019-08-11'),
        ('Junior Developer', 'Bloggs', 'Jane', 'Female', DATE'1989-10-10', DATE'2014-05-13'),
        ('Junior Developer', 'Hills', 'Harry', 'Male', DATE'1995-11-20', DATE'2015-05-13'),
        ('Junior Developer', 'Brown', 'Heather', 'Female', DATE'1993-09-10', DATE'2010-06-06');

INSERT INTO department (name)
VALUES ('Geography'), ('Chemistry'), ('Computer Science');

INSERT INTO project (name, start_date)
VALUES ('Bomb Sight', DATE'2011-12-10'),
        ('Cloning', DATE'1996-07-05'),
        ('The Continuum Hypothesis', DATE'2000-01-01'),
        ('Neural Computation', DATE'2006-01-01');

INSERT INTO employee_department (employee_id, department_id)
VALUES (1, 1), (2, 1), (3, 1), (4, 1), (5, 2), (6, 3), (7, 1), (8, 2);

INSERT INTO employee_project (employee_id, project_id)
VALUES (1, 1), (1, 2), (1, 3), (1, 4), (2, 1), (2, 2), (2, 3), (2, 4), (3, 1), (3, 2),
        (3, 3), (3, 4), (4, 1), (4, 2), (4, 3), (4, 4);