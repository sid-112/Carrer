CREATE TABLE Customer(
    CustomerID INT PRIMARY KEY,
    CustomerName VARCHAR(50),
    LastName VARCHAR(50),
    Country VARCHAR(50),
    Age int(2),
  Phone int(10)
);

describe Customer;

insert into Customer values(1, "Sid", "Gurjakshtriya", "India", 14, 6358741133);