# Write your MySQL query statement below
select DISTINCT author_id as id from views where viewer_id = author_id order by author_id ASC;