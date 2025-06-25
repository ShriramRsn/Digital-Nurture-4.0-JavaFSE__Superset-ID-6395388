CREATE TABLE CUSTOMERS (
    CustomerID   NUMBER PRIMARY KEY,
    Name         VARCHAR2(100),
    Age          NUMBER,
    Balance      NUMBER(12, 2),
    IsVIP        VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE LOANS (
    LoanID       NUMBER PRIMARY KEY,
    CustomerID   NUMBER,
    InterestRate NUMBER(5, 2),
    DueDate      DATE,
    FOREIGN KEY (CustomerID) REFERENCES CUSTOMERS(CustomerID)
);

INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance, IsVIP) VALUES (1, 'Tony', 65, 15000, 'FALSE');
INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance, IsVIP) VALUES (2, 'Razak', 45, 8000, 'TRUE');
INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance, IsVIP) VALUES (3, 'Chandler', 70, 12000, 'FALSE');
INSERT INTO CUSTOMERS (CustomerID, Name, Age, Balance, IsVIP) VALUES (4, 'Vijay', 30, 10500, 'FALSE');

INSERT INTO LOANS (LoanID, CustomerID, InterestRate, DueDate) VALUES (101, 1, 5.5, SYSDATE + 10);
INSERT INTO LOANS (LoanID, CustomerID, InterestRate, DueDate) VALUES (102, 2, 6.0, SYSDATE + 40);
INSERT INTO LOANS (LoanID, CustomerID, InterestRate, DueDate) VALUES (103, 3, 7.2, SYSDATE + 5);
INSERT INTO LOANS (LoanID, CustomerID, InterestRate, DueDate) VALUES (104, 4, 6.5, SYSDATE + 25);

SELECT * FROM CUSTOMERS;
SELECT *  FROM LOANS;
