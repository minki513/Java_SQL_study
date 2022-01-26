-- 파티션
-- 대량의 데이터를 한 테이블에 저장할 때 그 내용을 물리적으로 별도의 테이블에 분리해서 저장하는 기법
-- 몇 개의 파티션으로 분리되었든 사용자 입장에서는 하나의 테이블로 보이기 때문에 테이블을 사용하는 방법은 같음
-- MySQL 내부적으로는 데이터가 분리되어 처리되기 때문에 시스템의 성능 향상에 큰 도움이 됨
-- 테이블을 분리할 때는 테이블의 범위에 따라서 서로 다른 파티션에 저장하는 것이 가장 보편적
CREATE DATABASE IF NOT EXISTS partDB;
USE partDB;
CREATE TABLE partTBL
( userID CHAR(8) NOT NULL,
userName VARCHAR(10) NOT NULL,
birthYear INT NOT NULL,
addr CHAR(2) NOT NULL)
PARTITION BY RANGE (birthYear)
(PARTITION part1 VALUES LESS THAN (1970),
PARTITION part2 VALUES LESS THAN (1972),
PARTITION part3 VALUES LESS THAN MAXVALUE);

-- 파티션 1 (1970년 미만) / 파티션 2 ( 1097-~1972년 미만) / 파티션 3 ( 1972년 이후)
INSERT INTO partTBL SELECT userID, userName, birthYear, addr FROM cookDB.userTBL;
SELECT * FROM partTBL;
-- 파티션 정보 확인
SELECT TABLE_SCHEMA, TABLE_NAME, PARTITION_NAME, PARTITION_ORDINAL_POSITION, TABLE_ROWS
FROM INFORMATION_SCHEMA.PARTITIONS
WHERE TABLE_NAME = 'parttbl';

SELECT * FROM partTBL WHERE birthYear < 1970;
EXPLAIN SELECT * FROM partTBL WHERE birthYear < 1970; -- 어떤 파티션을 사용했는지 확인

-- 파티션 3을 1972-1974 미만(파티션 3) 과 1974 이후 (파티션 4)로 분리
ALTER TABLE partTBL
REORGANIZE PARTITION part3 INTO (
	PARTITION part3 VALUES LESS THAN (1974),
    PARTITION part4 VALUES LESS THAN MAXVALUE);
OPTIMIZE TABLE partTBL;
-- 파티션 합치기 (파티션1 + 파티션2)
ALTER TABLE partTBL
REORGANIZE PARTITION part1, part2 INTO(
	PARTITION part12 VALUES LESS THAN (1972));
-- 파티션12 삭제
ALTER TABLE partTBL 
DROP PARTITION part12;
SELECT * FROM partTBL;

-- 파티션 테이블에 외래키를 설정할 수 없음. 파티션은 단독으로 사용되는 테이블에만 설정할 수 있음
-- 스토어드 프로시저, 스토어드 함수, 사용자 변수 등을 파티션 함수나 식에 사용할 수 없음
-- 임시 테이블에는 파티션 기능을 사용할 수 없음
-- 파티션 키에는 일부 함수만 사용 가능
-- 파티션의 개수는 최대 8192개까지 지원됨
-- 레인지 파티션에는 숫자형의 연속된 범위를 지정하여 사용하고, 리스트 파티션에는 숫자형 또는 문자형의 연속되지 않은 파티션 키 값을 하나하나 지정하여 사용함
-- 리스트 파티션에는 MAXVALUE를 사용할 수 없음. 모든 경우의 파티션 키 값을 지정해야 함