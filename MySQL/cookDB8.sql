-- 내장함수
-- 제어 흐름 함수
SELECT IF(100>200,'참이다', '거짓이다'); -- IF(수식, 참, 거짓) / 수식이 참이면 두 번째 인수를 반환하고, 거짓이면 세 번째 인수를 반환
SELECT ifnull(NULL,'널이군요'), ifnull(100,'널이군요'); -- IFNULL(수식1, 수식2) / 수식1이 NULL이 아니면 수식1을 반환하고, 수식1이 NULL이면 수식2를 반환
SELECT NULLIF(100, 100), IFNULL(200, 100); -- NULLIF(수식1, 수식2) / 수식1과 수식2가 같으면 NULL을 반환하고, 다르면 수식1을 반환

-- 문자열 함수
-- BIT_LENGTH( ) - 할당된 비트 크기를 반환 / CHAR_LENGTH - 문자의 개수를 반환 / LENGTH( ) - 할당된 바이트 수를 반환
SELECT ascii('A'), char(65);
SELECT BIT_LENGTH('abc'), CHAR_LENGTH('abc'), LENGTH('abc');
SELECT BIT_LENGTH('가나다'), CHAR_LENGTH('가나다'), LENGTH('가나다');
-- CONCAT_WS( ) -  구분자와 함께 문자열을 이어줌
SELECT CONCAT_WS('/', '2020', '01', '01');
-- FORMAT(숫자, 소수점자릿수) - 숫자를 소수점 이하 자릿수까지 표현하고 1000단위마다 쉼표를 넣음
SELECT FORMAT(123456.123456, 4);
-- INSERT(기준 문자열, 위치, 길이, 삽입할 문자열)
SELECT INSERT('abcdefghi', 3, 4, '@@@@'), INSERT('abcdefghi', 3, 2, '@@@@');
-- LPAD(문자열, 길이, 채울 문자열), RPAD(문자열, 길이, 채울 문자열)
SELECT LPAD('쿡북', 5, '##'), RPAD('쿡북', 5, '##');
-- 문자열의 왼쪽 또는 오른쪽 공백을 제거(중간의 공백은 제거되지 않음)
SELECT LTRIM(' 쿡북'), RTRIM('쿡북 ');
SELECT TRIM(' 쿡북 '), TRIM(BOTH 'ㅋ' FROM 'ㅋㅋㅋ재미있어요.ㅋㅋㅋ'); -- TRIM( ) 함수는 문자열의 앞뒤 공백을 모두 없앰 / 앞을 의미 LEADING, 양쪽 의미 BOTH, 뒤를 의미 TRAILING
-- REPEAT(문자열, 횟수)
SELECT repeat('쿡북',3);
-- REPLACE(문자열, 원래문자열, 바꿀문자열)
SELECT replace('IT 쿡북 MySQL','쿡북','CookBook');
-- 문자열의 순서를 거꾸로 반환
SELECT REVERSE ('MySQL');
-- 길이만큼의 공백을 반환
SELECT CONCAT('IT', SPACE(10), 'CookBook MySQL');
-- SUBSTRING(문자열, 시작위치, 길이) -시작 위치부터 길이만큼 문자를 반환
SELECT SUBSTRING('대한민국만세', 3, 2);

-- 수학 함수
-- 올림, 내림, 반올림
SELECT ceiling(4.7), floor(4), round(4.7);
 -- CONV(숫자, 원래진수, 변환할 진수)
 SELECT conv('AA', 16, 2), CONV(100, 10, 8);
 -- MOD(숫자1, 숫자2) - 숫자1을 숫자2로 나눈 나머지 값을 반환
 SELECT MOD(157, 10), 157 % 10, 157 MOD 10;
 -- POW(숫자1, 숫자2) - 숫자1을 숫자2만큼 거듭제곱한 값을 반환 / SQRT(숫자) - 숫자의 제곱근을 반환
SELECT pow(2,3), sqrt(9);
SELECT RAND(), FLOOR(1 + (RAND() * (6-1))); -- 0~1 미만의 실수와 주사위 숫자가 출력
SELECT SIGN(100), SIGN(0), SIGN(-100.123); -- 양수,0,음수
SELECT TRUNCATE(12345.12345, 2), TRUNCATE(12345.12345, -2);

-- 날짜/시간 함수
SELECT ADDDATE('2020-01-01', INTERVAL 31 DAY), ADDDATE('2020-01-01', INTERVAL 1 MONTH); -- 날짜를 기준으로 차이를 더한 날짜 반환
SELECT SUBDATE('2020-01-01', INTERVAL 31 DAY), SUBDATE('2020-01-01', INTERVAL 1 MONTH); -- 날짜를 기준으로 뺀 날짜 반환
SELECT ADDTIME('2020-01-01 23:59:59', '1:1:1'), ADDTIME('15:00:00', '2:10:10');
SELECT subtime('2020-01-01 23:59:59', '1:1:1'), subtime('15:00:00', '2:10:10');
SELECT YEAR(CURDATE()), MONTH(CURRENT_DATE()), DAYOFMONTH(CURRENT_DATE);
SELECT HOUR(CURTIME()), MINUTE(CURRENT_TIME()), SECOND(CURRENT_TIME), MICROSECOND(CURRENT_TIME);
SELECT DATE(NOW()), TIME(NOW());
SELECT HOUR(NOW());
SELECT DATEDIFF('2023-01-01', NOW()), TIMEDIFF('23:23:59', '12:11:10'); -- 차이 반환
SELECT DAYOFWEEK(CURDATE()), MONTHNAME(CURDATE()), DAYOFYEAR(CURDATE());
SELECT LAST_DAY('2022-02-01'); -- 입력한 월의 마지막 날짜를 반환
SELECT MAKEDATE(2022, 32); -- 연도의 첫날부터 정수만큼 지난 날짜를 반환
SELECT MAKETIME(12, 11, 10);
SELECT PERIOD_ADD(202201, 11), PERIOD_DIFF(202201, 201812);
SELECT QUARTER('2022-07-07'); -- 날짜가 4분기 중에서 몇 분기인지를 반환
SELECT TIME_TO_SEC('12:11:10'); -- 시간을 초 단위로 반환

-- 시스템 정보 함수
SELECT CURRENT_USER(), DATABASE(); -- 현재 사용자와 현재 선택된 데이터베이스를 반환
SELECT * FROM usertbl;
SELECT found_rows(); -- 바로 앞의 SELECT 문에서 조회된 행의 개수를 반환