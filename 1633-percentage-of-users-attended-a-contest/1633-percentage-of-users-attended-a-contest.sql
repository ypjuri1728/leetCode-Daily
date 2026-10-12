SELECT contest_id,
    ROUND(COUNT(user_id) * 100.0 / (SELECT COUNT(*) FROM Users), 2) AS percentage
FROM Register GROUP BY contest_id ORDER BY percentage DESC, contest_id ASC;

-- COUNT(user_id) counts users registered for each contest.
-- (SELECT COUNT(*) FROM Users) gets the total number of users.
-- * 100.0 converts the result into a percentage.
-- ROUND(..., 2) rounds the percentage to two decimal places.
-- GROUP BY contest_id calculates the percentage separately for each contest.
-- ORDER BY percentage DESC, contest_id ASC sorts by highest percentage first, then by contest ID in ascending order.