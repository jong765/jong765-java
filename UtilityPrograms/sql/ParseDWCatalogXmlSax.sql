DROP TABLE JKIM2.JKProduct;
CREATE TABLE JKIM2.JKProduct (
	ProductId	VARCHAR(25),
	Brand		VARCHAR(100),
	Department	VARCHAR(100),
	OnlineFlagTablet	VARCHAR(10),
	OnlineFlagPacsun	VARCHAR(10)
);
SELECT	*
FROM	JKIM2.JKProduct;


DROP TABLE JKIM2.JKCustomer;
CREATE TABLE JKIM2.JKCustomer (
	Login	VARCHAR(100),
	FirstName	VARCHAR(100),
	LastName	VARCHAR(100),
	Email	VARCHAR(100),
	Zip	VARCHAR(100),
	GigyaUId	VARCHAR(100)
);
SELECT	*
FROM	JKIM2.JKCustomer;