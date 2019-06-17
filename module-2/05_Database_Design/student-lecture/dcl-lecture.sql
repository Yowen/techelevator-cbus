SELECT * FROM students

INSERT INTO students VALUES ('XYZ', 'noselect', 'lastName');

CREATE USER rachelle WITH PASSWORD '123';

GRANT SELECT ON students TO rachelle;

GRANT INSERT ON students TO rachelle;

REVOKE SELECT ON students FROM rachelle;