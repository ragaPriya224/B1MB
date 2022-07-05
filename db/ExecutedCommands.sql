create database minebratPractice;

show databases;

use minebratPractice;

create table office ( PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255));
    
Desc office;
DESC office;

ALTER TABLE office
ADD email  varchar(105);

ALTER TABLE office
ADD PRIMARY KEY (PersonID);

INSERT INTO office
VALUES (123, 'lname', 'john', 'xyz', 'bangalore', 'abc@xyz.com');

SELECT * FROM office;

INSERT INTO office
VALUES (34, 'lname1', 'dummy', 'abc', 'hyderabad', 'bcd@xyz.com'),
(456, 'lname2', 'test', 'zzzzz', 'chennai', 'def@xyz.com'),
 (890, 'lname3', 'dummy2', 'yyyy', 'delhi', 'ghi@xyz.com');
 
 SELECT city,email FROM office;
 
 select * from office where city = 'bangalore';
INSERT INTO office (personID, city, email)
VALUES (678,'mumbai', 'abc@abc.com');

UPDATE office
SET email = 'abc234@xyz.com'
WHERE city = 'mumbai';
SET SQL_SAFE_UPDATES = 0;

UPDATE office
SET  city = 'bangalore'
WHERE city = 'delhi';


UPDATE office
SET  lastname = 'spidy'
WHERE city = 'bangalore';

 select * from office;
 
 
 DELETE FROM office  WHERE address = 'abc';
 truncate table office;
 drop table office;