-- Write queries to return the following:
-- The following queries utilize the "world" database.

-- 1. The city name, country name, and city population of all cities in Europe with population greater than 1 million
-- (36 rows)

select ci.name as City, co.name as Country, ci.population
from city ci
join country co on co.code = ci.countrycode
where co.continent = 'Europe' and ci.population > 1000000;

-- 2. The city name, country name, and city population of all cities in countries where French is an official language and the city population is greater than 1 million
-- (2 rows)

SELECT ci.name, co.name, ci.population
FROM country co
JOIN city ci ON ci.countrycode = co.code
JOIN countrylanguage cl ON cl.countrycode = co.code
WHERE cl.language = 'French' AND ci.population > 1000000 AND cl.isofficial IS TRUE;

-- 3. The name of the countries and continents where the language Javanese is spoken
-- (1 row)

select co.name as Country, co.continent
from country co
join countrylanguage cl on cl.countrycode = co.code
where cl.language = 'Javanese';

-- 4. The names of all of the countries in Africa that speak French as an official language
-- (5 row)

select co.name
from country co
join countrylanguage cl on cl.countrycode = co.code
where cl.language = 'French' AND co.continent = 'Africa' AND cl.isofficial IS TRUE;

-- 5. The average city population of cities in Europe
-- (average city population in Europe: 287,684)

select avg(ci.population)
from city ci
join country co on co.code = ci.countrycode
where continent = 'Europe';

-- 6. The average city population of cities in Asia
-- (average city population in Asia: 395,019)

select avg(ci.population)
from city ci
join country co on co.code = ci.countrycode
where continent = 'Asia';

-- 7. The number of cities in countries where English is an official language
-- (number of cities where English is official language: 523)

select count(*)
from city ci
join countrylanguage cl on cl.countrycode = ci.countrycode
where cl.language = 'English' and cl.isofficial is true;

-- 8. The average population of cities in countries where the official language is English
-- (average population of cities where English is official language: 285,809)

SELECT AVG(ci.population) AS average_city_population
FROM city ci
JOIN country co ON co.code = ci.countrycode
JOIN countrylanguage cl ON cl.countrycode = ci.countrycode
WHERE cl.language = 'English' AND cl.isofficial IS TRUE;


-- 9. The names of all of the continents and the population of the continent’s largest city
-- (6 rows, largest population for North America: 8,591,309)

select co.continent, max(ci.population)
from country co
join city ci on ci.countrycode = co.code
group by co.continent;


-- 10. The names of all of the cities in South America that have a population of more than 1 million people and the official language of each city’s country
-- (29 rows)

SELECT ci.name, cl.language
FROM city ci
JOIN country co ON co.code = ci.countrycode
JOIN countrylanguage cl ON cl.countrycode = ci.countrycode
WHERE ci.population > 1000000 AND co.continent = 'South America' AND cl.isofficial IS TRUE