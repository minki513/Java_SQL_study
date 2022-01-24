-- while (1부터 100까지 값 더하기)
DELIMITER $$
CREATE PROCEDURE whileProc()
BEGIN
	DECLARE i INT;
    DECLARE hap INT;
    SET i =1;
    SET hap = 0;
    
    WHILE(i <=100) DO
    SET hap = hap + i;
    SET i =i +1;
    END WHILE;
    
    SELECT hap;
END $$
DELIMITER ;
CALL whileProc();
-- 1-100 중 7의 배수를 합계에서 제외 (ITERATE / LEAVE)
DROP PROCEDURE IF EXISTS whileProc2;
DELIMITER $$
CREATE PROCEDURE whileProc2()
BEGIN
	DECLARE i INT;
    DECLARE hap INT;
    SET i =1;
    SET hap = 0;
    
    myWhile:WHILE(i <=100) DO  -- while 문에 label을 지정
    IF (i%7=0) THEN
		SET i = i+1;
        ITERATE myWhile; -- 지정한 label문으로 가서 계속 진행
	END IF;
    
    SET hap = hap +i;
    IF (hap > 2000) THEN
		LEAVE myWhile; -- 지정한 label문을 떠남(while 종료)
	END IF;
    SET i = i+1;
    END WHILE;
    
    SELECT hap;
end $$
DELIMITER ;
CALL whileProc2();

-- 오류처리
DELIMITER $$
CREATE PROCEDURE errorProc()
BEGIN
	DECLARE CONTINUE HANDLER FOR 1146 SELECT '테이블이 없어요' AS '메세지';
    SELECT * FROM noTable; 
END $$
DELIMITER ;
CALL errorProc();

-- 동적 SQL
-- PREPARE - sql문을 실행하지 않고 따로 준비
-- EXECUTE - PREPARE문으로 준비한 쿼리문 실행
-- 동적 SQL로 쿼리문을 실행한 후에는 DEALLOCATE PREPARE 문으로 준비 했던 문장을 해제하는 것이 바람직
CREATE TABLE myTable (id INT AUTO_INCREMENT PRIMARY KEY, mDate DATETIME);
SET @curDATE = CURRENT_TIMESTAMP(); -- 현재 날짜와 시간
PREPARE myQuery FROM 'INSERT INTO myTable VALUES(NULL, ?)';
EXECUTE myQuery USING @curDATE;
DEALLOCATE PREPARE myQuery;
SELECT * FROM myTable;