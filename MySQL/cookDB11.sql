USE cookdb;
-- UNION
SELECT stdName, addr FROM stdtbl
UNION
SELECT clubName, roomNo FROM clubtbl;
-- NOT IN / IN
SELECT userName, concat(mobile1, '-', mobile2) AS '전화번호' FROM usertbl
WHERE userName NOT IN (SELECT userName FROM usertbl WHERE mobile1 IS NULL);
SELECT userName, concat(mobile1, '-', mobile2) AS '전화번호' FROM usertbl
WHERE userName IN (SELECT userName FROM usertbl WHERE mobile1 IS NULL);

-- if...else...end if문
DROP PROCEDURE if EXISTS ifProc;
DELIMITER $$
CREATE PROCEDURE ifProc()
BEGIN
 DECLARE var1 INT;
 SET var1 = 100;
 
 if var1 = 100 THEN
	SELECT '100입니다.';
 ELSE 
	SELECT '100이 아닙니다.';
 END IF;
END $$
DELIMITER ;
CALL ifProc();
-- 직원 번호가 10001번인 직원의 입사일이 5년이 넘었는지 확인
USE employees;
DELIMITER $$
CREATE PROCEDURE ifProc2()
BEGIN
	DECLARE hireDATE DATE; -- 입사일
    DECLARE curDATE DATE;  -- 오늘
    DECLARE days INT;  -- 근무한 일수
    
    SELECT hire_date INTO hireDATE
    FROM employees.employees
    WHERE emp_no = 10001;
    
    SET curDATE = current_date(); -- 현재 날짜
    SET days = datediff(curDATE, hireDATE); -- 날짜의 차이, 일 단위
    
    IF (days/365) >=5 THEN -- 5년이 지났다면
		SELECT concat('입사한지 ', days, '일이나 지났습니다.') AS '메세지';
	ELSE
		SELECT '입사한지' + days + '일 밖에 안되었네요.' AS '메세지';
	END IF;
END $$
DELIMITER ;
CALL ifProc2();
-- 다중 분기 if문
DELIMITER $$
CREATE PROCEDURE ifProc3()
BEGIN
	DECLARE point INT;
    DECLARE credit CHAR(1);
    SET point = 77;
    
    IF point >= 90 THEN
		SET credit ='A';
	ELSEIF point >= 80 THEN
		SET credit ='B';
	ELSEIF point >= 70 THEN
		SET credit ='C';
	ELSEIF point >= 60 THEN
		SET credit ='D';
	ELSE
		SET credit = 'F';
	END IF;
    SELECT concat('취득점수 => ', point), concat('학점 => ', credit );
END $$
DELIMITER ;
CALL ifProc3();