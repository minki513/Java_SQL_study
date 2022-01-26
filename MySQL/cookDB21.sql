-- 전체 텍스트 인덱스
-- CHAR, VARCHAR, TEXT 열에만 생성할 수 있음
-- FULLTEXT로 지정
-- 자연어 검색
-- 전체 텍스트 검색을 할 때 특별히 옵션을 지정하지 않거나 IN NATURAL LANGUAGE MODE를 붙이면 자연어 검색을 함
-- 자연어 검색은 단어가 정확한 것을 검색
-- 불린 모드 검색 (IN BOOLEAN MODE)
-- 단어나 문장이 정확히 일치하지 않는 것도 검색
-- 필수를 뜻하는 +, 제외를 뜻하는 -, 부분 검색을 위한 * 등의 다양한 연산자 지원
CREATE DATABASE IF NOT EXISTS FulltextDB;
USE FulltextDB;
CREATE TABLE FulltextTbl
( id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(15) NOT NULL,
description VARCHAR(1000));
INSERT INTO FulltextTbl VALUES
(NULL, '광해, 왕이 된 남자', '왕위를 둘러싼 권력 다툼과 당쟁으로 혼란이 극에 달한 광해군 8년'),
(NULL, '간첩', '남한 내에 고장간첩 5만 명이 암약하고 있으며 특히 권력 핵심부에도 침투해 있다.'),
(NULL, '남자가 사랑할 때', '대책 없는 한 남자이야기. 형 집에 얹혀 살며 조카한테 무시당하는 남자'),
(NULL, '레지던트 이블 5', '인류 구원의 마지막 퍼즐, 이 여자가 모든 것을 끝낸다.'),
(NULL, '파괴자들', '사랑은 모든 것을 파괴한다! 한 여자를 구하기 위한, 두 남자의 잔인한 액션 본능!'),
(NULL, '킹콩을 들다', '역도에 목숨을 건 시골소녀들이 만드는 기적 같은 신화.'),
(NULL, '테드', '지상 최대 황금찾기 프로젝트! 500년 전 사라진 황금도시를 찾아라!'),
(NULL, '타이타닉', '비극 속에 침몰한 세기의 사랑, 스크린에 되살아날 영원한 감동'),
(NULL, '8월의 크리스마스', '시한부 인생 사진사와 여자 주차 단속원과의 미묘한 사랑'),
(NULL, '늑대와 춤을', '늑대와 친해져 모닥불 아래서 함께 춤을 추는 전쟁 영웅 이야기'),
(NULL, '국가대표', '동계올림픽 유치를 위해 정식 종목인 스키점프 국가대표팀이 급조된다.'),
(NULL, '쇼생크 탈출', '그는 누명을 쓰고 쇼생크 감옥에 감금된다. 그리고 역사적인 탈출.'),
(NULL, '인생은 아름다워', '귀도는 삼촌의 호텔에서 웨이터로 일하면서 또다시 도라를 만난다.'),
(NULL, '사운드 오브 뮤직', '수녀 지망생 마리아는 명문 트랩가의 가정교사로 들어간다'),
(NULL, '매트릭스', '2199년. 인공 두뇌를 가진 컴퓨터가 지배하는 세계.');
SELECT * FROM FulltextTbl WHERE description LIKE '%남자%';

-- 전체 텍스트 인덱스 생성
CREATE FULLTEXT INDEX idx_description ON FulltextTbl(description);
SHOW INDEX FROM FulltextTbl;
SELECT * FROM FulltextTbl WHERE MATCH(description) AGAINST('남자*' IN BOOLEAN MODE);
-- '남자' 또는 '여자' 단어가포함된 영화 출력
SELECT * , MATCH(description) AGAINST('남자* 여자*' IN BOOLEAN MODE) AS 점수
FROM FulltextTbl WHERE MATCH(description) AGAINST('남자* 여자*' IN BOOLEAN MODE);
-- '남자'와 '여자' 단어 둘다 포함된 영화 출력
SELECT * FROM FulltextTbl WHERE MATCH(description) AGAINST('+남자* +여자 *' IN BOOLEAN MODE);
-- '남자'라는 단어가 들어 있는 영화 중에서 '여자'가 포함된 영화 제외
SELECT * FROM FulltextTbl WHERE MATCH(description) AGAINST('+남자* -여자 *' IN BOOLEAN MODE);
-- 전체 텍스트 인덱스로 만들어진 단어 확인
SET GLOBAL innodb_ft_aux_table = 'fulltextdb/fulltexttbl';
SELECT word, doc_count, doc_id, position FROM INFORMATION_SCHEMA.INNODB_FT_INDEX_TABLE;
