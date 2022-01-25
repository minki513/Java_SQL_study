SET GLOBAL log_bin_trust_function_creators =1;
USE cookDB;
-- 스토어드 함수
DROP FUNCTION IF EXISTS userFunc;
DELIMITER $$
CREATE FUNCTION userFunc(value1 INT, value2 INT)
RETURNS INT
BEGIN
RETURN value1 + value2;
END $$
DELIMITER ;
SELECT userFunc(100,200);

DELIMITER $$
CREATE FUNCTION getAgeFunc(bYear INT)
RETURNS INT 
BEGIN 
DECLARE age INT;
SET age = YEAR(curdate()) -bYear;
RETURN age;
end $$
DELIMITER ;
SELECT getAgeFunc(1998);
SELECT getAgeFunc(1998) INTO @age1998;
SELECT getAgeFunc(1995) INTO @age1995;
SELECT concat('1995년과 1998년의 나이차 ==> ', (@age1995 - @age1998));
SELECT userID, userName, getAgeFunc(birthYear) AS '만 나이' FROM userTBL;