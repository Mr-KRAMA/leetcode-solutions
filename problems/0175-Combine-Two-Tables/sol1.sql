-- ========================================================
-- 175. Combine Two Tables
-- Difficulty : Easy
-- Language   : Oracle SQL
-- Solution   : #1
-- Runtime    : 460 ms (Beats 86%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/combine-two-tables/
-- ========================================================






SELECT 
P.FIRSTNAME,
P.LASTNAME,
A.CITY,
A.STATE 
FROM PERSON P LEFT JOIN ADDRESS A ON P.PERSONID=A.PERSONID;