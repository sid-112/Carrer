

USE collage;

CREATE TABLE studentId(
	id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT NOT NULL,
    Numbere INT UNIQUE
);

INSERT INTO studentId VALUES(1, "Siddharth", 14, 1234567890);
INSERT INTO studentId VALUES(2, "Dhanajay", 49, 1234567899);
INSERT INTO studentId VALUES(3, "Bhavika", 47, 11234567890);
INSERT INTO studentId VALUES(4, "Ashana", 16, 12234567890);

SHOW DATABASES;
SHOW TABLES;

CREATE TABLE id1 (
    Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT NOT NULL,
);

INSERT INTO id1 VALUES (1, 'Siddharth', 14, 11);
INSERT INTO id1 VALUES (2, 'Dhanajay', 49, 22);
INSERT INTO id1 VALUES (3, 'Bhavika', 47, 33);
INSERT INTO id1 VALUES (4, 'Ashana', 16, 44);

SELECT * FROM id1;

CREATE TABLE example_table (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    City VARCHAR(50)
);

INSERT INTO example_table VALUES (1, 'John Doe', 25, 'New York');
INSERT INTO example_table VALUES (2, 'Jane Smith', 30, 'Los Angeles');
INSERT INTO example_table VALUES (3, 'Bob Johnson', 22, 'Chicago');
INSERT INTO example_table VALUES (4, 'Alice Brown', 28, 'San Francisco');

SELECT * FROM example_table;
SELECT Name, City FROM example_table;
SELECT * FROM example_table WHERE Age >25;
SELECT * FROM example_table LIMIT 2;
SELECT * FROM example_table ORDER BY Age ASC;
SELECT * FROM example_table ORDER BY Age DESC;
