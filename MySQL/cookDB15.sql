USE cookDB;
-- 인덱스
CREATE TABLE TBL1
(a INT PRIMARY KEY,
b INT,
c INT);
SHOW INDEX FROM TBL1;
CREATE TABLE TBL2
(a INT PRIMARY KEY,
b INT UNIQUE,
c INT UNIQUE,
d INT);
SHOW INDEX FROM TBL2;
CREATE TABLE TBL3
(a INT UNIQUE,
b INT UNIQUE,
c INT UNIQUE,
d INT);
SHOW INDEX FROM TBL3;
CREATE TABLE TBL4
( a INT UNIQUE NOT NULL, 
b INT UNIQUE, 
c INT UNIQUE, 
d INT PRIMARY KEY 
);
SHOW INDEX FROM TBL4;
-- PRIMARY KEY로 지정한 열에 클러스터형 인덱스가 생성
-- UNIQUE NOT NULL로 지정한 열에 클러스터형 인덱스가 생성
-- UNIQUE 또는 UNIQUE NULL로 지정한 열에 보조 인덱스가 생성
-- PRIMARY KEY와 UNIQUE NOT NULL이 같이 있으면 PRIMARY KEY로 지정한 열에 우선 클러스터형 인덱스가 생성
-- PRIMARY KEY로 지정한 열을 기준으로 데이터가 오름차순 정렬
CREATE DATABASE IF NOT EXISTS testDB;
USE testDB;
-- 클러스터형 인덱스 만들기
CREATE TABLE clusterTBL
( userID char(8), userName VARCHAR(10));
INSERT INTO clusterTBL VALUES('YJS','유재석'),('KHD', '강호동'),('KKJ', '김국진'),('KYM', '김용만'),('KJD', '김제동'),
('NHS', '남희석'),('SDY', '신동엽'),('LHJ', '이휘재'),('LKK', '이경규'),('PSH', '박수홍');
SELECT * FROM clusterTBL;
ALTER TABLE clusterTBL
ADD CONSTRAINT PK_clusterTBL_userID PRIMARY KEY (userID); -- userID열 기준으로 정렬 (클러스터형 인덱스 구성)
-- 보조 인덱스 만들기
CREATE TABLE secondaryTBL
( userID char(8), userName VARCHAR(10));
INSERT INTO secondaryTBL VALUES('YJS','유재석'),('KHD', '강호동'),('KKJ', '김국진'),('KYM', '김용만'),('KJD', '김제동'),
('NHS', '남희석'),('SDY', '신동엽'),('LHJ', '이휘재'),('LKK', '이경규'),('PSH', '박수홍');
ALTER TABLE secondaryTBL
ADD CONSTRAINT UK_secondaryTBL_userID UNIQUE (userID);
SELECT * FROM secondaryTBL;
-- 클러스터형 인덱스 데이터 삽입
INSERT INTO clusterTBL VALUES('KKK','크크크'),('MMM','마마무');
-- 보조 인덱스 데이터 삽입
INSERT INTO secondaryTBL VALUES('KKK','크크크'),('MMM','마마무');
-- 클러스터형 인덱스의 특징
-- - 인덱스를 생성할 때 데이터 페이지 전체가 다시 정렬. 이미 대용량 데이터가 입력된 상태에서 중간에 클러스터형 인덱스를 생성하면 시스템에 심각한 부하를 줄 수 있음
-- - 리프 페이지가 곧 데이터 페이지, 인덱스 자체에 데이터가 포함되어 있음
-- - 보조 인덱스보다 검색 속도가 빠르고 데이터 변경(삽입, 수정, 삭제) 속도는 느림
-- - 클러스터형 인덱스는 테이블에 하나만 생성할 수 있음. 어느 열에 클러스터형 인덱스를 생성하는지에 따라 시스템의 성능이 달라짐

-- 보조 인덱스의 특징
-- - 인덱스를 생성할 때 데이터 페이지는 그대로 둔 상태에서 별도의 페이지에 인덱스를 구성
-- - 리프 페이지에 데이터가 아니라 데이터가 위치하는 주소 값(RID)이 들어 있음
-- - 데이터 변경(삽입, 수정, 삭제) 시 클러스터형 인덱스보다 성능 부하가 적음
-- - 보조 인덱스는 한 테이블에 여러 개를 생성할 수 있음. 하지만 함부로 남용하면 오히려 시스템의 성능을 떨어뜨리는 결과를 초래할 수 있으므로 필요한 열에만 생성해야 함
