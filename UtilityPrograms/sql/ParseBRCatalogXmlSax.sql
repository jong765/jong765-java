DROP TABLE JKIM2.JKProduct3;
CREATE TABLE JKIM2.JKProduct3 (
	ProductId		VARCHAR(25),
	ProductType		VARCHAR(25),
	MasterProductId	VARCHAR(25)
);
COMMIT;

SELECT	count(distinct (productId))
FROM	JKIM2.JKProduct3
where	productType = 'Product';	-- 420

SELECT	count(distinct(productId))
FROM	JKIM2.JKProduct3
where	productType = 'Master Product';	-- 10547

SELECT	count(distinct(productId))	-- 69
FROM	JKIM2.JKProduct3
where	productType = 'Product Set';

with cs as (
SELECT	productId
FROM	JKIM2.JKProduct3
where	productType = 'Product'	
union all
SELECT	productId
FROM	JKIM2.JKProduct3
where	productType = 'Master Product'	
union all
SELECT	productId
FROM	JKIM2.JKProduct3
where	productType = 'Product Set'
)
select	count(distinct(productId))
from	cs;




