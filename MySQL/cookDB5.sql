-- 순위함수
USE cookdb;
-- ROW_NUMBER() - 중복 값들에 대해서도 순차적인 순위를 표시하도록 출력하는 함수
SELECT ROW_NUMBER() OVER(ORDER BY height DESC) "키큰 순위", userName, addr, height FROM usertbl;
SELECT ROW_NUMBER() OVER(ORDER BY height DESC, userName ASC) "키큰 순위", userName, addr, height FROM usertbl; -- 키가 같은 경우 이름의 가나다 순으로 정렬
SELECT addr, ROW_NUMBER() OVER(PARTITION BY addr ORDER BY height DESC, userName ASC) "지역 별키큰 순위", userName, height FROM usertbl; -- 각 지역별로 순위 매기기
-- DENSE_RANK() - 중복 값들에 대해서 동일 순위로 표시 중복 값 개수와 상관없이 순차적인 순위 값 출력
SELECT DENSE_RANK() OVER(ORDER BY height DESC) "키큰순위", userName, addr, height FROM usertbl; 
-- RANK() - 중복 값들에 대해서 동일 순위로 표시 중복 값 개수만큼 떨어진 순위로 출력
SELECT RANK() OVER(ORDER BY height DESC) "키큰순위", userName, addr, height FROM usertbl; 
-- NTILE() - 뒤에 함께 적어주는 숫자만큼 등분하는 함수
SELECT NTILE(2) OVER(ORDER BY height DESC) "반번호", userName, addr, height FROM usertbl; 

-- 분석함수
-- LEAD() - 다음 행의 값을 리턴 LEAD(가져올 행, offset, default) offset 행 기준 몇번째 값 가져올지
SELECT userName, addr, height AS '키', height - (LEAD(height, 1,0) OVER (ORDER BY height DESC)) AS '다음 사람과 키 차이' FROM usertbl;
-- FIRST_VALUE() - 정렬된 컬럼 값중 처음값을 리턴
SELECT addr, userName, height AS '키', height - (FIRST_VALUE(height) OVER(PARTITION BY addr ORDER BY height DESC)) AS '지역별 최대키와 차이' FROM usertbl;
-- CUME_DIST() - 각 그룹에서 지정한 값의 상대적 위치를 계산
SELECT addr, userName, height AS '키', (CUME_DIST() OVER(PARTITION BY addr ORDER BY height DESC)) AS '누적인원 백분율%' FROM usertbl;