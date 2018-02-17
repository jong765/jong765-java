/*************************************
TestTable
*************************************/
DROP TABLE JKIM2.TestTable;
CREATE TABLE JKIM2.TestTable (
  	OrderNumber		VARCHAR(16)		NOT NULL,
  	Amount			NUMERIC(11,2)	NOT NULL,
	CustomerNumber	VARCHAR(20)		NOT NULL,
	Reference		VARCHAR(50)		NOT NULL,
	StatusCode		CHAR(1)			NOT NULL,
  	OrderDate		DATE			NOT NULL
);
commit;
rollback;

select	*
from	JKIM2.TestTable;