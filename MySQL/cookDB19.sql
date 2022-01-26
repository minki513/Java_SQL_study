USE cookDB;
-- 커서 - 쿼리의 결과 행 집합에서 한 행씩 옮겨가며 명령을 처리
DELIMITER $$
CREATE PROCEDURE cursorProc()
BEGIN
	DECLARE userHeight INT; -- 고객의 키
	DECLARE cnt INT DEFAULT 0;  -- 고객의 인원수(읽을 행의 수)
	DECLARE totalHeight INT DEFAULT 0; -- 키의 합계
	DECLARE endOfRow BOOLEAN DEFAULT FALSE; -- 행의 끝 여부(기본은 false)
	DECLARE userCuror CURSOR FOR -- 커서 선언
		SELECT height FROM usertbl;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET endOfRow = TRUE; -- 행의 끝이면 endOfRow 변수에 true 대입
    OPEN userCuror; -- 커서열기

	cursor_loop: LOOP FETCH userCuror INTO userHeight; 고객의 키 1개 대입
		IF endOfRow THEN
			LEAVE cursor_loop;
		END IF;
		SET cnt = cnt +1;
		SET totalHeight = totalHeight + userHeight;
    END LOOP cursor_loop;
    
    SELECT CONCAT('고객 키의 평균 ==> ', (totalHeight/cnt));
    
    CLOSE userCuror; 
END $$
DELIMITER ;


DROP PROCEDURE IF EXISTS gradeProc;
DELIMITER $$
CREATE PROCEDURE gradeProc()
BEGIN
	DECLARE id VARCHAR(10); -- 사용자 아이디를 저장할 변수
    DECLARE hap BIGINT; -- 총 구매액을 저장할 변수
    DECLARE userGrade CHAR(5); -- 고객 등급 변수
    DECLARE endOfRow BOOLEAN DEFAULT FALSE;
    DECLARE userCuror CURSOR FOR -- 커서 선언
		SELECT U.userid, sum(price * amount)
        FROM buytbl B
        RIGHT OUTER JOIN usertbl U
        ON B.userid = U.userid
        GROUP BY U.userid, U.userName;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET endOfRow = TRUE;
    
    OPEN userCuror;
    grade_loop: LOOP FETCH userCuror INTO id, hap;
    IF endOfRow THEN
		LEAVE grade_loop;
	END IF;
    
    CASE
		WHEN(hap >=1500) THEN SET userGrade = '최우수고객';
        WHEN(hap >=1000) THEN SET userGrade = '우수고객';
        WHEN(hap >=1) THEN SET userGrade = '일반고객';
        ELSE SET userGrade = '유령고객';
	END CASE;
    UPDATE usertbl SET grade = userGrade WHERE userID = id;
    END LOOP grade_loop;
    
    CLOSE userCuror;
END $$
DELIMITER ;
CALL gradeProc();
SELECT * FROM usertbl;


