USE tabledb;
-- VIEW
CREATE VIEW v_userTBL
AS SELECT userID, userName, addr FROM userTBL;
SELECT * FROM v_userTBL; -- 뷰를 테이블이라고 생각해도 무방

USE cookDB;
CREATE VIEW v_userbuyTBL
AS 
SELECT U.userID AS 'USER ID', U.userName AS 'USER NAME', B.prodName AS 'PRODUCT NAME',
U.addr, concat(U.mobile1,U.mobile2) AS 'MOBILE PHONE'
FROM userTBL U
INNER JOIN buyTBL B
ON U.userID = B.userID;
SELECT `USER ID`, `USER NAME` FROM v_userbuyTBL;
DROP VIEW v_userbuyTBL;
CREATE OR REPLACE VIEW v_userTBL 
AS
SELECT userID, userName, addr FROM userTBL;
DESCRIBE v_userTBL;
SHOW CREATE VIEW v_userTBL;
UPDATE v_userTBL SET addr = '부산' WHERE userID = 'LKK'; -- 뷰의 데이터 수정
INSERT INTO v_userTBL (userID, userName, addr) VALUES ('KBM','김병만','충북'); -- userTBL테이블에 not null 설정되어있는 열 때문에 오류
-- 그룹 함수 포함하는 뷰 데이터 수정
-- 뷰를 통해 데이터 삽입, 수정, 삭제할 수 없는 경우
-- - sum()들의 집계함수/UNION ALL, JOIN / DISTINCT, GROUP BY 등을 사용한 뷰
CREATE OR REPLACE VIEW v_sum
AS
SELECT userID AS 'userID', sum(price * amount) AS 'total'
FROM buyTBL GROUP BY userID;
SELECT * FROM v_sum;

CREATE OR REPLACE VIEW v_height180
AS
SELECT * FROM userTBL WHERE height >=180
WITH CHECK OPTION; -- 조건에 맞지않은 것을 추가가 안됨
SELECT * FROM v_height180;
INSERT INTO v_height180 VALUES('SJH', '서장훈', 1974, '경기', '010', '5555555', 158, '2019-01-01');

