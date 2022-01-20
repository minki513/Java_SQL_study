USE cookDB;
-- buyTBL 테이블을 buyTBL2 테이블로 복사
CREATE TABLE buyTBL2 (SELECT * FROM buyTBL);
SELECT * FROM buyTBL2;

CREATE TABLE buyTBL3 (SELECT userID, prodName FROM buyTBL);
SELECT * FROM buyTBL3;  -- 키본키와 외래키 등의 제약조건은 복사되지 않음

-- GROUP BY
SELECT userID, amount FROM buyTBL ORDER BY userID;
SELECT userID, SUM(amount) FROM buyTBL GROUP BY userID;
SELECT userID AS '사용자 아이디', SUM(amount) AS '총 구매 개수' FROM buyTBL GROUP BY userID;
SELECT userID AS '사용자 아이디', SUM(amount * price) AS '총구매액' FROM buyTBL GROUP BY userID;
SELECT avg(amount) AS '평균 구매 개수' FROM buyTBL;
-- 회원별로 한번 구매할 때 마다 평균적으로 몇 개를 구매했는지 조회
SELECT userID, avg(amount) AS '평균 구매 개수' FROM buyTBL GROUP BY userID;

-- 집계함수
SELECT userName, max(height), min(height) FROM userTBL;
SELECT userName, max(height), min(height) FROM userTBL GROUP BY userName;
SELECT userName, height FROM userTBL WHERE height = (SELECT max(height) FROM userTBL) OR height = (SELECT min(height) FROM userTBL);
SELECT COUNT(mobile1) AS '휴대폰이 있는 사용자' FROM userTBL;

-- HAVING 절
SELECT userID AS '사용자', SUM(price * amount) AS '총구매액' 
FROM buyTBL 
GROUP BY userID
HAVING SUM(price * amount) > 1000
ORDER BY SUM(price * amount);

-- WITH ROLLUP 절 (항목별 합계에 대한 전체 합계)
SELECT num, groupName, SUM(price * amount) AS '비용'
FROM buyTBL
GROUP BY groupName,num
WITH ROLLUP;
