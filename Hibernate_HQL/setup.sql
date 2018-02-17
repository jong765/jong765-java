/*************************************
Employee
*************************************/
DROP TABLE JKIM2.Employee;
CREATE TABLE JKIM2.Employee (
  	emp_id		INT 		NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
  	emp_name		VARCHAR(20) 	NOT NULL,
  	emp_salary		NUMERIC(10,0)	NOT NULL DEFAULT 0,
  	PRIMARY KEY (emp_id)
);
commit;
rollback;

select	*
from	JKIM2.Employee;
/*************************************
Address
*************************************/
DROP TABLE JKIM2.Address;
CREATE TABLE JKIM2.Address (
  	emp_id		INT		NOT NULL,
  	address_line1		VARCHAR(50) 	NOT NULL DEFAULT '',
  	zipcode		VARCHAR(10) 	DEFAULT NULL,
  	city 		VARCHAR(20) 	DEFAULT NULL,
  	PRIMARY KEY (emp_id),
  	CONSTRAINT JKIM2.emp_fk_1 	FOREIGN KEY (emp_id) REFERENCES JKIM2.Employee (emp_id)
);
commit;
rollback;

select	*
from	JKIM2.Address; 

/*************************************
Populate data
*************************************/

INSERT INTO JKIM2.Employee (emp_name, emp_salary)
VALUES
	('Pankaj', 100),
	('David', 200),
	('Lisa', 300),
	('Jack', 400);


INSERT INTO JKIM2.Address (emp_id, address_line1, zipcode, city)
VALUES
	(1, 'Albany Dr', '95129', 'San Jose'),
	(2, 'Arques Ave', '95051', 'Santa Clara'),
	(3, 'BTM 1st Stage', '560100', 'Bangalore'),
	(4, 'City Centre', '100100', 'New Delhi');
	
commit;