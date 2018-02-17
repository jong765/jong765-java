DROP TABLE JKIM2.JKTransaction;
CREATE TABLE JKIM2.JKTransaction (
	TransactionId		INTEGER,
	ProductId		VARCHAR(16),
	ProductDescription	VARCHAR(50),
	CustomerId		INTEGER,
	Quantity		INTEGER
);

SELECT	TransactionId,
	ProductId,
	ProductDescription,
	CustomerId,
	Quantity
FROM	JKIM2.JKTransaction;

INSERT INTO JKIM2.JKTransaction
SELECT	ODORD#,
	ODITEM,
	ODIDSC,
	ODSCUS,
	ODOQTY
FROM	OPF998.LORDTL01
WITH NC;

select	*
FROM	OPF998.LORDTL01;