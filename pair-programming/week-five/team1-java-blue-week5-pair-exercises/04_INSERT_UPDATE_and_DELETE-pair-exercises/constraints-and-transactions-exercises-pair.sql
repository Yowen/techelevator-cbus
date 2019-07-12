start transaction;
-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)
select * from city where name ilike 'smallville';
insert into city (name, countrycode, district, population)
        values ('Smallville', 'USA', 'Kansas', 45001);

-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.
select * FROM countrylanguage WHERE language ilike 'Kryptonese';
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
        VALUES ('USA', 'Kryptonese', false, 0.0001);


-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.

select * from countrylanguage where countrycode = 'USA';

update countrylanguage
set language = 'Krypto-babble'
where language = 'Kryptonese';

-- 4. Set the US captial to Smallville, Kansas in the country table.
SELECT capital FROM country WHERE code = 'USA';

UPDATE country
SET capital = (SELECT id FROM city WHERE name = 'Smallville')
WHERE code = 'USA';

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

delete from city
where name = 'Smallville';

-- It did not succeed because the id on the city table is being referenced on another table (country).


-- 6. Return the US captial to Washington.
SELECT * FROM country WHERE code = 'USA';

UPDATE country
SET capital = (SELECT id FROM city WHERE name = 'Washington')
WHERE code = 'USA';

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)


delete from city
where name = 'Smallville';

-- It DID succed because the reference to its ID no longer exists on country


-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)


UPDATE countrylanguage
SET isofficial = NOT isofficial
FROM country
WHERE countrylanguage.countrycode = country.code AND country.indepyear > 1800 AND country.indepyear < 1972;

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)

select * from city;

update city
set population = round((population/1000), 0);


-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.
-- (7 rows affected)

SELECT * 
FROM country 
JOIN countrylanguage ON country.code = countrylanguage.countrycode
WHERE countrylanguage.language = 'French' AND countrylanguage.percentage > 20;

UPDATE country
SET surfacearea = surfacearea * 1609.344
FROM countrylanguage
WHERE country.code = countrylanguage.countrycode AND countrylanguage.language = 'French' AND countrylanguage.percentage > 20;

commit;
rollback;