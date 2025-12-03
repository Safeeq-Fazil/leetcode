# Write your MySQL query statement below
select user_id,
CONCAT(
    UPPER(LEFT(name,1)),
    LOWER(SUBSTRING(name,2))
) as name
from Users
ORDER by user_id;