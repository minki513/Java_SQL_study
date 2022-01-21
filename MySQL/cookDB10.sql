USE cookdb;
-- 내부 조인(일대다 관계)
SELECT *
FROM buytbl
INNER JOIN usertbl
ON buytbl.userID = usertbl.userID 
WHERE buytbl.userID = 'KYM';

SELECT buytbl.userID, userName, prodName, addr, concat(mobile1, mobile2) AS '연락처'
FROM buytbl
INNER JOIN usertbl
ON buytbl.userID = usertbl.userID
ORDER BY buytbl.userID;

SELECT DISTINCT U.userID, U.userName, U.addr
FROM usertbl U
INNER JOIN buytbl B
ON U.userID = B.userID
ORDER BY U.userID;
-- 다대다 관계
CREATE TABLE stdTBL (stdName VARCHAR(10) NOT NULL PRIMARY key, addr CHAR(4) NOT NULL);
CREATE TABLE clubTBL (clubName VARCHAR(10) NOT NULL PRIMARY KEY, roomNo CHAR(4) NOT NULL);
CREATE TABLE stdclubTBL (num int AUTO_INCREMENT NOT NULL PRIMARY KEY, stdName VARCHAR(10) NOT NULL, clubName VARCHAR(10) NOT NULL, 
FOREIGN KEY(stdName) REFERENCES stdTBL(stdName), FOREIGN KEY(clubName) REFERENCES clubTBL(clubName));
INSERT INTO stdTBL VALUES ('강호동', '경북'), ('김제동', '경남'), ('김용만', '서울'), ('이휘 재', '경기'), ('박수홍', '서울');
INSERT INTO clubTBL VALUES ('수영', '101호'), ('바둑', '102호'), ('축구', '103호'), ('봉사', '104호');
INSERT INTO stdclubTBL VALUES (NULL, '강호동', '바둑'), (NULL, '강호동', '축구'), (NULL, '김용만', '축구'), (NULL, '이휘재', '축구'), (NULL, '이휘재', '봉사'), (NULL, '박수홍', '봉사');
SELECT S.stdName , S.addr, C.clubName, C.roomNo
FROM stdTBL S
INNER JOIN stdclubTBL SC
ON S.stdName = SC.stdName
INNER JOIN clubTBL C
ON SC.clubName = C.clubName
ORDER BY S.stdName;

 -- 외부 조인 (조인 조건을 만족하지 않는 행까지 포함하여 출력하는 조인)
SELECT U.userID, U.userName, B.prodName, U.addr, concat(U.mobile1, U.mobile2) AS '연락처'
FROM usertbl U LEFT OUTER JOIN buytbl B
ON U.userID = B.userID
ORDER BY U.userID;

SELECT U.userID, U.userName, B.prodName, U.addr, concat(U.mobile1, U.mobile2) AS '연락처'
FROM buytbl B RIGHT OUTER JOIN usertbl U 
ON U.userID = B.userID
ORDER BY U.userID;
-- 물건을 한번 도 구매한 적이 없는 회원을 목록 출력
SELECT U.userID, U.userName, B.prodName, U.addr, concat(U.mobile1, U.mobile2) AS '연락처'
FROM usertbl U LEFT OUTER JOIN buytbl B
ON U.userID = B.userID
WHERE B.prodName IS NULL
ORDER BY U.userID;

SELECT S.stdName, S.addr, C.clubName, C.roomNo
FROM stdTBL S LEFT OUTER JOIN stdclubTBL SC
ON S.stdName = SC.stdName
LEFT OUTER JOIN clubTBL C
ON SC.clubName = C.clubName
ORDER BY S.stdName;

SELECT C.clubName, C.roomNo, S.stdName, S.addr
FROM stdTBL S LEFT OUTER JOIN stdclubTBL SC ON SC.stdName = S.stdName
RIGHT OUTER JOIN clubTBL C ON SC.clubName = C.clubName
ORDER BY C.clubName;

-- 상호 조인
SELECT * FROM buytbl CROSS JOIN userTBL;

-- 자체 조인
CREATE TABLE empTBL(emp CHAR(3), manager CHAR(3), empTel VARCHAR(8));
INSERT INTO empTBL VALUES ('나사장', NULL, '0000'), ('김재무', '나사장', '2222'), ('김부장', '김재무', '2222-1'),('이부장', '김재무', '2222-2'),
('우대리', '이부장', '2222-2-1'),('지사원', '이부장', '2222-2-2'), ('이영업', '나사장', '1111'),('한과장', '이영업', '1111-1'), ('최정보', '나사장', '3333'),
 ('윤차장', '최정보', '3333-1'), ('이주임', '윤차장', '3333-1-1');
SELECT * FROM empTBL;
SELECT A.emp AS '부하직원', B.emp AS '직속상관', B.emptel AS '직속상관연락처'
FROM empTBL A INNER JOIN emptbl B ON A.manager = B.emp
WHERE A.emp = '우대리';