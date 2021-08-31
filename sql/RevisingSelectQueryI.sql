select * from CITY where POPULATION >= 100000 and COUNTRYCODE ='USA'
select NAME from CITY where POPULATION >= 120000 and COUNTRYCODE ='USA'
select CITY,STATE from STATION
select distinct CITY from STATION where  mod(ID,2) = 0
select distinct CITY from STATION where  mod(ID,2) <> 0
-- all cities - distinct cities

SELECT (COUNT(CITY) - COUNT(DISTINCT CITY)) FROM STATION
--------------------------

SELECT city, length(city) FROM station order by length(city) desc limit 1;

SELECT city, length(city) FROM station order by length(city) asc, city asc limit 1
------Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates
select distinct CITY from STATION where CITY like 'a%' or CITY like 'e%' or CITY like 'i%'or CITY like 'o%' or CITY like 'u%'
SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";
select distinct  city from station where city like'%a' or city like'%e' or city like'%i' or city like'%o' or city like'%u'
SELECT DISTINCT CITY FROM STATION WHERE LOWER(SUBSTR(CITY,LENGTH(CITY),1)) IN ('a','e','i','o','u');
--------------------------
select distinct city from station
where left(city,1) in ('a','e','i','o','u')
and right(city, 1) in ('a','e','i','o','u')

--------------------------
select distinct city from station where left(city, 1) not in ('a','e','i','o','u')
--------------------------
select name from students where marks > 75 order by right(name, 3) , id
--------------------------
select name from Employee order by name
--------------------------
select name from Employee where salary > 2000 and months< 10 order by employee_id asc
--------------------------
select distinct city from station where left(city,1) not in ('a','e','i','o','u') and right(city, 1) not in ('a','e','i','o','u')
--------------------------
select count(*) from city where population >= 100000
--------------------------
select sum(population) from city where District  ='California'
--------------------------
select avg(population) from city where District  ='California'
--------------------------
select FLOOR(AVG(population)) from city
--------------------------
select sum(population) from city where COUNTRYCODE  ='JPN'
--------------------------
select (max(population)-min(population))from city
--------------------------

