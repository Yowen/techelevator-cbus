CREATE TABLE students (
        student_id varchar(32) primary key,
        first_name varchar(35) not null,
        last_name varchar(35) not null
);

SELECT * FROM students;

INSERT INTO students
VALUES ('ABC', 'John', 'Fulton');

CREATE TABLE ourtable (
        id serial primary key,
        name varchar(10)
);

-- Can select the next sequence to use using nextval()
SELECT nextval('ourtable_id_seq');

-- Can use nextval() as a subquery in an insert
INSERT INTO ourtable (id, name) VALUES ( (SELECT nextval('ourtable_id_seq')), 'Steve' );

-- Can use DEFAULT to get the next value
INSERT INTO ourtable (id, name) VALUES (DEFAULT, 'John');

-- Can ignore the column to get the next sequence
INSERT INTO ourtable (name) VALUES ('Andrew');

-- Can add the next number manually
INSERT INTO ourtable (id, name) VALUES (14, 'Stephanie');

-- BUT If the number you use is not yet been used in the sequence, it will cause a conflict when that number is used in the sequence
INSERT INTO ourtable (name) VALUES ('Rachelle');

-- Create a custom sequence and optionally set its initial value
CREATE SEQUENCE our_customer_seq START 101;

SELECT nextval('our_customer_seq');

-- Can alter a sequence to restart it OR change its increment
ALTER SEQUENCE our_customer_seq RESTART 1000 INCREMENT BY 2;

-- Drop a Sequence
DROP SEQUENCE our_customer_seq;

START TRANSACTION;
        INSERT INTO ourtable (name) VALUES ('Ben');
ROLLBACK;

SELECT * FROM ourtable;

DROP TABLE ourtable;