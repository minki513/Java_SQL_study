USE cookDB;
SELECT * FROM buyTBL;
SELECT * FROM userTBL;
-- 구매액이 높은 순으로 이르과 아이디 출력
SELECT B.userID, userName, sum(price * amount) AS '총 구매액'
FROM buyTBL B
INNER JOIN userTBL U 
ON B.userID = U.userID 
GROUP BY B.userID , U.userName
ORDER BY sum(price * amount) DESC;
-- 조건을 만족하지 않는 행도 모두 출력
SELECT U.userID, userName, sum(price * amount) AS '총 구매액'
FROM buyTBL B
RIGHT OUTER JOIN userTBL U 
ON B.userID = U.userID 
GROUP BY B.userID , U.userName
ORDER BY sum(price * amount) DESC;
-- case 구문 select 절에 추가
SELECT U.userID, U.userName, sum(price * amount) AS '총 구매액',
	CASE 
    when (sum(price * amount)>=1500) THEN '최우수고객'
    when (sum(price * amount)>=1000) THEN '우수고객'
    when (sum(price * amount)>=1) THEN '일반고객'
    ELSE '유령고객'
    END AS '고객등급'
FROM buyTBL B
RIGHT OUTER JOIN userTBL U 
ON B.userID = U.userID 
GROUP BY B.userID , U.userName
ORDER BY sum(price * amount) DESC;

