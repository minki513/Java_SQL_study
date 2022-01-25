USE cookDB;
-- 인덱스 생성
-- CREATE INDEX 문으로 인덱스를 만들면 보조 인덱스가 생성
-- CREATE INDEX 문으로는 클러스터형 인덱스를 만들 수 없으며, 클러스터형 인덱스를 만들려면 ALTER TABLE 문을 사용해야 함
SELECT * FROM userTBL;
SHOW INDEX FROM userTBL;
CREATE INDEX idx_userTBL_addr ON userTBL(addr);
CREATE UNIQUE INDEX idx_userTBL_userName ON userTBL(userName);
CREATE INDEX idx_userTBL_userName_birthYear ON userTBL (userName, birthYear);
DROP INDEX idx_userTBL_userName ON usertbl;
SELECT * FROM usertbl WHERE userName = '신동엽' AND birthYear= '1971';
CREATE INDEX idx_userTBL_mobile1 ON usertbl (mobile1);
SELECT * FROM usertbl WHERE mobile1 ='011';
DROP INDEX idx_userTBL_addr ON userTBL;
DROP INDEX idx_userTBL_userName_birthYear ON userTBL;
DROP INDEX idx_userTBL_mobile1 ON usertbl;
