-- ========================================================
-- 181. Employees Earning More Than Their Managers
-- Difficulty : Easy
-- Language   : Oracle SQL
-- Solution   : #1
-- Runtime    : 428 ms (Beats 85%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/employees-earning-more-than-their-managers/
-- ========================================================

 SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2
ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;