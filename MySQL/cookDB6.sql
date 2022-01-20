USE cookdb;
CREATE TABLE pivotTest (uName CHAR(3), season CHAR(3), amount INT);
INSERT INTO pivotTest VALUES ('유재석', '겨울', 10),('강호동', '여름', 15),('유재석', '가을', 25),('유재석', '봄', 3),('유재석', '봄', 37),
('강호동', '겨울', 40),('유재석', '여름', 14),('유재석', '겨울', 22),('강호동', '여름', 64);
SELECT * FROM pivotTest;

-- 피벗 테이블
-- CASE WHEN 조건절 THEN 참일때 값 ELSE 거짓일때 값 END 컬럼명 (조건문)
SELECT uName, SUM(CASE WHEN season = '봄' THEN amount END) AS '봄',SUM(CASE WHEN season='여름' THEN amount END) AS '여름',
SUM(CASE WHEN season='가을' THEN amount END) AS '가을', SUM(CASE WHEN season='겨울' THEN amount END) AS '겨울' 
FROM pivottest
GROUP BY uName;

-- WITH절 - 기존의 뷰, 파생 테이블, 임시 테이블 등을 더 간결하게 표현하는 CTE를 포함하는 구문
-- CTE - 비재귀적 CTE(단순한 형태로 복잡한 쿼리 문장을 단순화 시킴),재귀적 CTE(자기 자신을 반복적으로 호출)로 구분
WITH abc(userid, total)
AS (SELECT userid, SUM(price * amount) FROM buytbl GROUP BY userid)
SELECT * FROM abc ORDER BY total DESC;  -- 쿼리가 단순해짐
WITH cte_userTBL (addr, maxHeight)
AS
(SELECT addr, MAX(height) FROM usertbl GROUP BY addr)
SELECT AVG(maxHeight * 1.0) AS '각 지역별 최고키의 평균' FROM cte_userTBL;



