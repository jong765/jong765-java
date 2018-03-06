DROP TABLE JKIM2.JKCustomer;
CREATE TABLE JKIM2.JKCustomer (
    UUID		VARCHAR(50),
	Login		VARCHAR(50),
	CustomerNo	VARCHAR(8),
	FirstName	VARCHAR(50),
	LastName	VARCHAR(50),
	Email		VARCHAR(50),
	Zip			VARCHAR(20),
	GigyaUId	VARCHAR(50),
	CreationDate				VARCHAR(20),
	GigyaToDemandwareConversion	VARCHAR(10),
	NeedsGigyaResetPassword		VARCHAR(10)
);
SELECT	*
FROM	JKIM2.JKCustomer;