--Lab 5 Perform SQL queries for Like operator
--Part – A:
--Create following table using query according to the definition.CREATE TABLE STUDENT(STUID INT,FIRSTNAME VARCHAR(25),LASTNAME VARCHAR(25),WEBSITE VARCHAR(50),CITY VARCHAR(25),ADDRESS VARCHAR(100))INSERT INTO STUDENT(FIRSTNAME,LASTNAME,WEBSITE,CITY,ADDRESS)VALUES(1011,'Keyur Patel','techonthenet.com','Rajkot','A-303 ‘Vasant Kunj’, Rajkot'),
(1022,'Hardik Shah','digminecraft.com','Ahmedabad','“Ram Krupa”, Raiya Road'),
(1033,'Kajal Trivedi','bigactivities.com','Baroda','Raj bhavan plot, near
garden'),
(1044,'Bhoomi Gajera','checkyourmath.com','Ahmedabad','“Jig’s Home”, Narol'),
(1055,'Harmit Mitel','@me.darshan.com','Rajkot','B-55, Raj Residency'),
(1066,'Ashok Jani',NULL,'Baroda','A502, Club House Building')

--From the above given tables perform the following queries (LIKE Operation):
--PART-A
--1. Display the name of students whose name starts with ‘k’.


--2. Display the name of students whose name consists of five characters.


--3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.


--4. Display all the students whose last name ends with ‘tel’.


--5. Display all the students whose first name starts with ‘ha’ & ends with‘t’.


--6. Display all the students whose first name starts with ‘k’ and third character is ‘y’.


--7. Display the name of students having no website and name consists of five characters.


--8. Display all the students whose last name consist of ‘jer’.


--9. Display all the students whose city name starts with either ‘r’ or ‘b’.


--10. Display all the name students having websites.


--11. Display all the students whose name starts from alphabet A to H.


--12. Display all the students whose name’s second character is vowel.


--13. Display the name of students having no website and name consists of minimum five characters.


--14. Display all the students whose last name starts with ‘Pat’.


--15. Display all the students whose city name does not starts with ‘b’.


--Part – B:
--1. Display all the students whose name starts from alphabet A or H.


--2. Display all the students whose name’s second character is vowel and of and start with H.


--3. Display all the students whose last name does not ends with ‘a’.


--4. Display all the students whose first name starts with consonant.


--5. Display all the students whose website contains .net


--Part – C:
--1. Display all the students whose address consist of -.


--2. Display all the students whose address contains single quote or double quote.


--3. Display all the students whose website contains @.


--4. Display all the names those are either four or five characters.
