CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
Set N = N-1;
  RETURN (
    select distinct salary as getNthHighestSalary from Employee 
    order by salary DESC LIMIT 1 OFFSET N
  );
END