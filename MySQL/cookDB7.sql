USE cookdb;
-- 변수 사용하기
SET @myVar1 =5;
SET @myVar2 =3;
SET @myVar3 =4.25;
SET @myVar4 ='MC 이름==> ';
SELECT @myVar1;
SELECT @myVar2 + @myVar3;
SELECT @myVar4, userName FROM usertbl WHERE height > 180;
-- PREPARE - 실행할 명령문 / EXECUTE - 준비된 명령문
SET @myVar1 =3;
PREPARE myQuery FROM 'SELECT userName, height FROM userTBL ORDER BY height LIMIT ?';
EXECUTE myQuery USING @myVar1;

-- CAST()/CONVERT() - 데이터 형식 변환 함수
SELECT avg(amount) AS '평균 구매 개수' FROM buytbl;
SELECT cast(avg(amount) AS SIGNED INTEGER) AS '평균 구매 개수' FROM buytbl; -- -구매 개수를 정수로 출력
SELECT CAST('2020$12$12' AS DATE); -- CAST( ) 함수를 사용하면 다양한 구분자($, /, %, @)를 날짜 형식(-)으로도 변경할 수 있음
SELECT num, CONCAT(CAST(price AS CHAR(10)), 'X', CAST(amount AS CHAR(4)), '=') AS '단가x수량', price * amount FROM buytbl;

