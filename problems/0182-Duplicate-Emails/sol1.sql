-- ========================================================
-- 182. Duplicate Emails
-- Difficulty : Easy
-- Language   : Oracle SQL
-- Solution   : #1
-- Runtime    : 496 ms (Beats 39%)
-- Memory     : 0B (Beats 100%)
-- Link       : https://leetcode.com/problems/duplicate-emails/
-- ========================================================

 

 select email as Email
 from person
 group by email 
 having Count(email)>1;