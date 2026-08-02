# Write your MySQL query statement below
SELECT p.project_id, ROUND(AVG(e.experience_years),2) AS average_years
 FROM Project p 
 LEFT JOIN Employee e ON  p.employee_id = e.employee_id 
     GROUP BY p.project_id;

-- ROUND(..,2) ->Sometimes the average has many decimal places.
-- 2 digits after the decimal so it's print only 2.00 not like 2.0000000
-- GROUP BY puts rows having the same value into the same group.