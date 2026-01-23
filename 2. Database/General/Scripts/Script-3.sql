SELECT * FROM employees ORDER BY birth_date;

SELECT * FROM  titles ORDER BY to_date DESC;

SELECT MAX(salary) FROM salaries;
SELECT min(salary) FROM salaries;
SELECT avg(salary) FROM salaries;
SELECT sum(salary) FROM salaries;
SELECT COUNT(*) FROM salaries;

SELECT COUNT(*) AS '직원 수' FROM employees;

SELECT COUNT(*) AS '직원의 수' FROM titles WHERE title = 'Enginner';

SELECT count(*) FROM employees WHERE hire_date > '1965-01-01';

SELECT min(emp_no), MAX(emp_no) FROM employees;

SELECT max(emp_no), birth_date FROM employees
GROUP BY birth_date;

-- 부서별 직원 수 구하기
-- -  부서 번호(dept_no) 조회
SELECT count(*), dept_no FROM dept_emp GROUP BY dept_no;

SELECT count(*) AS 'cnt', gender FROM employees 
GROUP BY gender;

SELECT count(*) AS '직원 수', title FROM titles
GROUP BY title ORDER BY title desc;

SELECT count(*) AS '직원 수', title FROM titles
GROUP BY title HAVING count(*) >= 100000 ORDER BY title desc;

-- dept_emp에서 직원 수가 5만 이상인 부서만 조회
SELECT count(*), dept_no FROM dept_emp GROUP BY dept_no HAVING count(*)>=50000;

-- 현재 재직중인 직원들 중 직무별 직원 수가 200명 미만인 직무만 조회
SELECT COUNT(*), title FROM titles WHERE to_date = '9999-01-01' GROUP BY title HAVING count(*) < 200;