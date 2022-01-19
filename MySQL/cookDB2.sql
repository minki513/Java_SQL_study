USE cookDB;
SELECT * FROM userTBL;

SELECT * FROM usertbl WHERE userName='강호동';

-- 조건연사자와 관계연산자
SELECT userID, userName FROM userTBL WHERE birthYear >=1970 AND height >=182;
SELECT userID, userName FROM usertbl WHERE birthYear >=1970 OR height >=182;
SELECT userName, height FROM usertbl WHERE height >=180 AND height <=182;
SELECT userName, height FROM usertbl WHERE height BETWEEN 180 AND 182;
SELECT userName, addr FROM usertbl WHERE addr IN('경남','충남','경북');
SELECT userName, height FROM userTBL WHERE userName LIKE '김%';
SELECT userName, height FROM userTBL WHERE userName LIKE '_경규';

SELECT userName, height FROM usertbl WHERE height > 177;
SELECT userName, height FROM usertbl WHERE height > (SELECT height FROM usertbl WHERE userName='김용만');
SELECT userName, height,addr FROM usertbl WHERE height >= ANY(SELECT height FROM usertbl WHERE addr = '경기');
SELECT userName, height,addr FROM usertbl WHERE height >= ALL(SELECT height FROM usertbl WHERE addr = '경기');
SELECT userName, height,addr FROM usertbl WHERE height = ANY(SELECT height FROM usertbl WHERE addr = '경기');

-- ORDER BY
SELECT userName, mDate FROM usertbl ORDER BY mDate; -- 오름차순
SELECT userName, mDate FROM usertbl ORDER BY mDate DESC; -- 내림차순
SELECT userName, height FROM userTBL ORDER BY height DESC, userName ASC;

-- DISTINCT
SELECT DISTINCT addr FROM userTBL; -- 중복 X

