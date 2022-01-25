USE cookDB;
DROP PROCEDURE IF EXISTS userProc1;
-- 1개의 입력 매개변수가 있는 스토어드 프로시저
DELIMITER $$
CREATE PROCEDURE userProc1(IN uName VARCHAR(10))
BEGIN
SELECT * FROM usertbl WHERE userName = uName;
END $$
DELIMITER ;
CALL userProc1('이경규');

-- 2개의 입력 매개변수가 있는 스토어드 프로시저
DROP PROCEDURE IF EXISTS userProc2;
DELIMITER $$
CREATE PROCEDURE userProc2(IN userBirth INT, IN userHeight INT)
BEGIN
SELECT * FROM usertbl
WHERE birthYear > userBirth AND height > userHeight;
END $$
DELIMITER ;  
CALL userProc2(1970, 178);

-- 출력 매개변수가 있는 스토어드 프로시저
DROP PROCEDURE IF EXISTS userProc3;
DELIMITER $$
CREATE PROCEDURE userProc3(IN txtValue CHAR(10), OUT outValue INT)
BEGIN
INSERT INTO testTBL VALUES(NULL, txtValue);
SELECT MAX(id) INTO outValue FROM testTBL;
END $$
DELIMITER ;
CREATE TABLE IF NOT EXISTS testTBL(id INT AUTO_INCREMENT PRIMARY KEY, txt CHAR(10));
CALL userProc3('테스트값', @myValue);
SELECT concat('현재 입력된 ID 값 ==>', @myValue);
SELECT * FROM testTBL;

-- 스토어드 프로시저 안에 if-else
DELIMITER $$
CREATE PROCEDURE ifelseProc(IN uName VARCHAR(10))
BEGIN
	DECLARE bYear INT;
    SELECT birthYear INTO bYear FROM usertbl
    WHERE userName = uName;
    IF (bYear >=1970) THEN
		SELECT '아직 젊군요';
	ELSE
		SELECT '나이가 지긋하네요';
	END IF;
END $$
DELIMITER ;
CALL ifelseProc('김국진');

-- 스토어드 프로시저 - case문
DELIMITER $$
CREATE PROCEDURE caseProc(IN uName VARCHAR(10))
BEGIN
	DECLARE bYear INT;
    DECLARE tti CHAR(3); -- 띠
    SELECT birthYear INTO bYear FROM userTBL
    WHERE userName = uName;
CASE
	WHEN(bYear%12 =0) THEN SET tti ='원숭이';
    WHEN(bYear%12 =1) THEN SET tti ='닭';
    WHEN(bYear%12 =2) THEN SET tti ='개';
    WHEN(bYear%12 =3) THEN SET tti ='돼지';
    WHEN(bYear%12 =4) THEN SET tti ='쥐';
    WHEN(bYear%12 =5) THEN SET tti ='소';
    WHEN(bYear%12 =6) THEN SET tti ='호랑이';
    WHEN(bYear%12 =7) THEN SET tti ='토끼';
    WHEN(bYear%12 =8) THEN SET tti ='용';
    WHEN(bYear%12 =9) THEN SET tti ='뱀';
    WHEN(bYear%12 =10) THEN SET tti ='말';
    ELSE SET tti='양';
    END CASE;
    SELECT concat(uName,'의 띠==>',tti);
END $$
DELIMITER ;
CALL caseproc('박수홍');

-- 스토어드 프로시저 -WHILE (구구단)
DROP TABLE IF EXISTS guguTBL;
DROP PROCEDURE IF EXISTS whileProc;
CREATE TABLE guguTBL (txt VARCHAR(100));
DELIMITER $$
CREATE PROCEDURE whileProc()
BEGIN 
DECLARE str VARCHAR(100); -- 각 단 문자열로 저장
DECLARE i INT; -- 구구단 앞자리
DECLARE k INT; -- 구구단 뒷자리	
SET i =2; -- 2단부터 시작
WHILE (i<10) DO
	SET str = ''; -- 각 단의 결과를 저장할 문자열 초기화
    SET k =1; -- 1부터 9까지 곱하기
    WHILE (k<10) DO
		SET str = concat(str, ' ',i,'X',k, '=', i*k);
        SET k = k+1;
	END WHILE;
    SET i = i+1;
    INSERT INTO guguTBL VALUES(str);
END WHILE;
END $$
DELIMITER ;
CALL whileProc();
SELECT * FROM gugutbl;

SHOW CREATE PROCEDURE cookDB.whileProc;
