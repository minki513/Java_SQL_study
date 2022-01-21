USE cookdb;
-- JSON
SELECT JSON_OBJECT('name',userName,'height',height) AS 'JSON 값' 
FROM usertbl
WHERE height >=180;
SET @json='{"userTBL" : 
[
	{"name":"강호동", "height":182},
    {"name":"이휘재", "height":180},
    {"name":"남희석", "height":180},
    {"name":"박수홍", "height":183}
]
}';
SELECT JSON_VALID(@json) AS JSON_VALID; -- json 포맷 검증 - 유효한 경우 1 / 유효하지 않은 경우 0
SELECT JSON_SEARCH(@json, 'one', '남희석') AS JSON_SEARCH; -- json에서 조건에 맞는 최초 검색 위치 리턴 
SELECT JSON_EXTRACT(@json, '$.userTBL[2].name') AS JSON_EXTRACT; -- 세 번째 유저의 name 값 리턴
SELECT JSON_INSERT(@json, '$.userTBL[0].mDate', '2019-09-09') AS JSON_INSERT; -- 첫 번째 유저의 mDate 속성을 생성 후 값 삽입
SELECT JSON_REPLACE(@json, '$.userTBL[0].name', '토마스') AS JSON_REPLACE; -- 첫 번째 유저의 name을 토마스로 변경
SELECT JSON_REMOVE(@json, '$.userTBL[0]') AS JSON_REMOVE; -- 첫 번째 유저 정보 삭제

