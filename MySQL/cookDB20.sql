USE cookDB;
CREATE TABLE IF NOT EXISTS testTBL(id INT, txt VARCHAR(10));
INSERT INTO testTBL VALUES (1,'이엑스아이디'),(2,'블랙핑크'),(3,'에이핑크');
-- 트리커 (테이블에 부착되는 프로그램 코드)
-- 제약 조건과 더불어 데이터의 무결성을 보장하는 장치의 역할을 함
-- 테이블에 데이터 삽입, 수정, 삭제 작업이 발생하면 자동으로 실행
DROP TABLE buyTBL;
DELIMITER //
CREATE TRIGGER testTrg
	AFTER DELETE -- 삭제 후에 작동하도록 지정
    ON testtbl -- 트리거를 부찰할 테이블
    FOR EACH ROW -- 각 행마다 적용
BEGIN
	SET @msg = '가수 그룹이 삭제됨'; -- 트리거 실행 시 작동하는 코드
END //
DELIMITER ;

SET @msg = '';
INSERT INTO testtbl VALUES(4,'여자친구');
SELECT @msg;
UPDATE testtbl SET txt = '레드벨벳' WHERE id = 3;
SELECT @msg;
DELETE FROM testtbl WHERE id =4;
SELECT @msg;

CREATE TABLE backup_userTBL
( userID char(8) NOT NULL, 
userName varchar(10) NOT NULL, 
birthYear int NOT NULL, 
addr char(2) NOT NULL, 
mobile1 char(3), 
mobile2 char(8), 
height smallint, 
mDate date, 
modType char(2), -- 변경된 유형(‘수정’ 또는 ‘삭제’) 
modDate date, -- 변경된 날짜
modUser varchar(256) -- 변경한 사용자
);
-- 데이터를 수정했을 떄 작동하는 트리거 생성 (백업테이블)
DELIMITER //
CREATE TRIGGER backUserTBL_UpdateTrg
	AFTER UPDATE
    ON usertbl
    FOR EACH ROW
BEGIN
	 INSERT INTO backup_userTBL VALUES (OLD.userID, OLD.userName, OLD.birthYear,
     OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate, '수정', curdate(), current_user()); -- OLD 삭제 혹은 수정 이전의 값
 END //
 DELIMITER ;
-- 데이터를 삭제했을 떄 작동하는 트리거 생성 (백업테이블)
DROP TRIGGER IF EXISTS backUserTBL_DeleteTrg;
DELIMITER //
CREATE TRIGGER backUserTBL_DeleteTrg
	AFTER DELETE
    ON usertbl
    FOR EACH ROW
BEGIN
	 INSERT INTO backup_userTBL VALUES (OLD.userID, OLD.userName, OLD.birthYear,
     OLD.addr, OLD.mobile1, OLD.mobile2, OLD.height, OLD.mDate, '삭제', curdate(), current_user()); -- OLD 삭제 혹은 수정 이전의 값
 END //
 DELIMITER ;
UPDATE usertbl SET addr = '제주' WHERE userID = 'KJD';
DELETE FROM usertbl WHERE height >=180;
SELECT * FROM backup_userTBL;
TRUNCATE TABLE userTBL;
SELECT * FROM usertbl;
-- BEFORE INSERT 트리거 (테이블에 변경이 가해지기 전에 작동하는 트리거)
DELIMITER //
CREATE TRIGGER userTBL_BeforeInsertTrg
	BEFORE INSERT
    ON usertbl
    FOR EACH ROW
BEGIN
	IF NEW.birthYear < 1900 THEN 
		SET NEW.birthYear =0;
	ELSEIF NEW.birthYear > year(curdate()) THEN
		SET NEW.birthYear = year(curdate());
	END IF;
END //
DELIMITER ;
INSERT INTO userTBL VALUES ('AAA', '에이', 1877, '서울', '011', '11112222', 181, '2019-12-25');
INSERT INTO userTBL VALUES ('BBB', '비이', 2977, '경기', '011', '11113333', 171, '2011-3-25');
SELECT * FROM userTBL;

-- 다중 트리거 (하나의 테이블에 동일한 트리거가 여러 개 부착되어 있는 것)
-- 중첩 트리거 (트리거가 또 다른 트리거를 작동시키는 것)
-- FOLLOWS 트리거 이름 (지정한 트리거 다음에 현재 트리거가 작동)
-- PRECEDES 트리거 이름 (지정한 트리거가 작동하기 이전에 현재 트리거가 작동)
USE mysql;
DROP DATABASE IF EXISTS triggerDB;
CREATE DATABASE IF NOT EXISTS triggerDB;
USE triggerDB;
CREATE TABLE orderTBL -- 구매 테이블
(orderNo INT AUTO_INCREMENT PRIMARY KEY, -- 구매일련번호
userID VARCHAR(5), -- 구매한 회원 아이디
prodName VARCHAR(5), -- 구매한 물건
orderamount INT); -- 구매한 개수
CREATE TABLE prodTBL -- 물품 테이블
( prodName VARCHAR(5), -- 물건 이름
account INT); -- 남은 물건 수량
CREATE TABLE deliverTBL -- 배송테이블
( deliverNo INT AUTO_INCREMENT PRIMARY KEY, -- 배송 일련번호
prodName VARCHAR(5), -- 배송한 물건
account INT UNIQUE); -- 배송할 물건 개수
INSERT INTO prodTBL VALUES ('사과', 100),('배', 100),('귤', 100);
SELECT * from prodTBL;
TRUNCATE TABLE prodtbl;
-- 트리거를 구매 테이블(orderTBL)과 물품 테이블(prodTBL)에 부착
-- 물품 테이블에서 개수를 감소시키는 트리거
-- DROP TRIGGER IF EXISTS orderTrg;
DELIMITER //
CREATE TRIGGER orderTrg
	AFTER INSERT
	ON orderTBL
    FOR EACH ROW
BEGIN
	UPDATE prodTBL SET account = account - NEW.orderamount WHERE prodName = NEW.prodName;
END //
DELIMITER ;
-- 배송테이블에 새 배송 건을 삽입하는 트리거
DROP TRIGGER IF EXISTS prodTrg;
DELIMITER //
CREATE TRIGGER prodTrg
	AFTER UPDATE
    ON prodTBL
    FOR EACH ROW
BEGIN
	DECLARE orderAmount INT;
    SET orderAmount = OLD.account - NEW.account; -- 주문 개수 = (변경 전 개수 - 변경 후 개수)
    INSERT INTO deliverTBL(prodName, account) VALUES (NEW.prodName, orderAmount);
END //
DELIMITER ;
-- 고객이 물건을 구매했다고 가정하고 삽입
INSERT INTO orderTBL VALUES ( null, 'JOHN','배',5);
SELECT * FROM orderTBL;
SELECT * FROM prodTBL;
SELECT * FROM deliverTBL;
INSERT INTO orderTBL VALUES ( null, 'JOHN','배',11);
INSERT INTO orderTBL VALUES ( null, 'min','사과',15);