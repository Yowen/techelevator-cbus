-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
START TRANSACTION;
        SELECT * FROM actor
        INSERT INTO actor (first_name, last_name)
        VALUES ('Hampton', 'Avenue'),
               ('Lisa', 'Byway')
ROLLBACK;
COMMIT;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
START TRANSACTION;
        SELECT * FROM film
        WHERE title = 'Euclidean PI'
        INSERT INTO film (title, description, release_year, language_id, length)
        VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece',
                '2008', '1', '198')
ROLLBACK;
COMMIT;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
START TRANSACTION;
        SELECT * FROM film_actor WHERE actor_id = 201 OR actor_id = 202;
        INSERT INTO film_actor (actor_id, film_id)
        VALUES (201, 1002), (202, 1002);
ROLLBACK;
COMMIT;

-- 4. Add Mathmagical to the category table.
START TRANSACTION;
        SELECT * FROM category;
        INSERT INTO category (name)
        VALUES ('Mathmagical');
ROLLBACK;
COMMIT;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
START TRANSACTION;
        SELECT * FROM film WHERE title = 'Euclidean PI';
        SELECT * FROM film_category WHERE category_id = 17;
        INSERT INTO film_category (category_id, film_id)
        VALUES (17, 274), (17, 494), (17, 714), (17, 996), (17, 1002);
ROLLBACK;
COMMIT;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
START TRANSACTION;
        SELECT film.film_id
        FROM film
        WHERE rating = 'G';
        
        UPDATE film
        SET rating = 'G'
        FROM film_category
        WHERE film_category.film_id = film.film_id AND film_category.category_id = 17;
ROLLBACK;
COMMIT;

-- 7. Add a copy of "Euclidean PI" to all the stores.
START TRANSACTION;
        SELECT * FROM inventory WHERE film_id = 1002;
        INSERT INTO inventory (film_id, store_id)
        VALUES (1002, 1), (1002, 2);
ROLLBACK;
COMMIT;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
DELETE FROM film
WHERE title = 'Euclidean PI';
-- <YOUR ANSWER HERE>
-- It does not work because it is referenced in another table (film_actor).

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical';
-- <YOUR ANSWER HERE>
-- It does not work because it is referenced in another table (film_category).

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
DELETE FROM film_category
WHERE category_id = 17;
-- <YOUR ANSWER HERE>
-- It succeeded because it is not referenced in another table

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical';
DELETE FROM film
WHERE title = 'Euclidean PI';
-- <YOUR ANSWER HERE>
-- It worked for deleting Mathmagical because it is no longer being referenced in film_category
-- It did not work Euclidean PI because it is still being referenced in film_actor