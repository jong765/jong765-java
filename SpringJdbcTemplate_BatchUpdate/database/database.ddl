DROP TABLE JKIM2.JKCustomer;
CREATE TABLE  JKIM2.JKCustomer (
  CUST_ID	INTEGER			NOT NULL,
  NAME 		VARCHAR(100) 	NOT NULL,
  AGE 		INTEGER 		NOT NULL,
  PRIMARY KEY (CUST_ID)
);

INSERT INTO JKIM2.JKCustomer (CUST_ID, NAME, AGE) VALUES 
 (1,'mkyong1',28),
 (2,'mkyong2',28),
 (3,'mkyong3',28);

SELECT	*
FROM	JKIM2.JKCustomer;