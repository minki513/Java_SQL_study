CREATE TABLE indexTBL (first_name varchar(14), last_name varchar(16), hire_date date);
INSERT INTO indexTBL
		SELECT first_name, last_name, hire_date
		FROM employees.employees
		LIMIT 500;
SELECT * FROM indextbl;
SELECT * FROM indexTBL WHERE first_name = 'Mary';
CREATE INDEX idx_indexTBL_firstname ON indexTBL(first_name);



