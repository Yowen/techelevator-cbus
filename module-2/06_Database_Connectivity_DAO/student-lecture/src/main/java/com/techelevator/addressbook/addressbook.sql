INSERT INTO person (user_id, first_name, last_name) VALUES (DEFAULT, ?, ?)

SELECT user_id, first_name, last_name FROM person

SELECT user_id, first_name, last_name FROM person WHERE user_id = ?

UPDATE person SET first_name = ?, last_name = ? WHERE user_id = ?

DELETE FROM person WHERE user_id = ?