USE cookDB;
CREATE TABLE testTBL1 (id int, userName char(3), age int);
-- INSERT 문
INSERT INTO testTBL1 VALUES (1, '뽀로로', 16);
INSERT INTO testTBL1(id, userName) VALUES(2,'크롱');
INSERT INTO testTBL1 (userName, age, id) VALUES ('루피', 14, 3);
-- AUTO_INCREMENT (자동으로 1부터 증가하는 값을 입력하는 키워드 - 반드시 기본키, 유니크로 설정해야하며 데이터 형식이 숫자인 열에 사용 가능)
CREATE TABLE testTBL2 (id int AUTO_INCREMENT PRIMARY KEY, userName char(3), age int);
INSERT INTO testTBL2 VALUES (NULL, '에디', 15);
INSERT INTO testTBL2 VALUES (NULL, '포비', 12);
INSERT INTO testTBL2 VALUES (NULL, '통통이', 11);
SELECT * FROM testTBL2;
-- AUTO_INCREMENT 입력 값을 100부터 시작하도록 변경
ALTER TABLE testTBL2 AUTO_INCREMENT=100;
INSERT INTO testTBL2 VALUES (NULL, '패티', 13);
SELECT * FROM testTBL2;
-- 초깃값 1000으로 하고 증가 값 3으로 변경 
CREATE TABLE testTBL3( id int AUTO_INCREMENT PRIMARY KEY,userName char(3),age int);
ALTER TABLE testTBL3 AUTO_INCREMENT = 1000;
SET @@auto_increment_increment=3;
INSERT INTO testTBL3 VALUES (NULL, '우디', 20);
INSERT INTO testTBL3 VALUES (NULL, '버즈', 18);
INSERT INTO testTBL3 VALUES (NULL, '제시', 19);
SELECT * FROM testTBL3;
INSERT INTO testTBL3 VALUES (NULL, '토이', 17), (NULL, '스토리', 18),(NULL, '무비', 19);
-- 대량 데이터 삽입
CREATE TABLE testTBL4 (id int, Fname varchar(50), Lname varchar(50));
INSERT INTO cookdb.testTBL4 
SELECT emp_no, first_name, last_name FROM employees.employees;
SELECT * FROM testTBL4;

-- UPDATE 문
UPDATE testtbl4 SET Lname = '없음' WHERE Fname = 'Kyoichi';
UPDATE buyTBL SET price = price * 1.5;
SELECT * FROM buyTBL;

-- DELETE 문
DELETE FROM testTBL4 WHERE Fname = 'Aamer';
CREATE TABLE bigTBL1 (SELECT * FROM employees.employees);
CREATE TABLE bigTBL2 (SELECT * FROM employees.employees);
CREATE TABLE bigTBL3 (SELECT * FROM employees.employees);
-- DROP, DELETE, TRUNCATE 실행시간 확인
DELETE FROM bigTBL1;
DROP TABLE bigTBL2; -- 테이블 자체가 필요없는 경우
TRUNCATE TABLE bigTBL3; -- 테이블의 구조를 남겨놓고 싶은 경우
SELECT * FROM bigTBL3;

CREATE TABLE memberTBL (SELECT userID, userName, addr FROM userTBL LIMIT 3);
ALTER TABLE memberTBL
ADD CONSTRAINT pk_memberTBL PRIMARY KEY (userID); 
SELECT * FROM memberTBL;
INSERT INTO memberTBL VALUES ('KHD', '강후덜', '미국'); -- 기본키 중복 입력
INSERT INTO memberTBL VALUES ('LSM', '이상민', '서울');
INSERT INTO memberTBL VALUES ('KSJ', '김성주', '경기');
INSERT IGNORE INTO memberTBL VALUES ('KHD', '강후덜', '미국'); -- 중복키 제약조건에 위배되면 insert를 무시
INSERT INTO memberTBL VALUES ('KHD', '강후덜', '미국') ON DUPLICATE KEY UPDATE userName='강후덜', addr='미국'; -- 데이터 삽입 시 pk와 uk가 중복될 경우 지정한 데이터만 update
INSERT INTO memberTBL VALUES ('DJM', '동짜몽', '일본') ON DUPLICATE KEY UPDATE userName='동짜몽', addr='일본';
SELECT * FROM memberTBL;