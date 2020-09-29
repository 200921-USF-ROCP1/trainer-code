drop table test_table;

create table test_Table (
	name varchar(60) primary key,
	number_of_pets numeric(5),
	yearly_income numeric(10, 2),
	department varchar(60)
);

-- Use references othertable(columnname) for foreign key!
create table foreign_key_table (
	id numeric primary key,
	other_id varchar(60) references test_table(name)
);

-- I need to put data into my table!
-- If I am inserting a value for every column in the original order,
--  I dont need to list the columns
insert into test_table values
  ('Jacob', 0, 10000, 'Engineering'),
  ('Jackson', 2, 20000, 'Engineering'),
  ('Phillie', 1, 30000, 'Accounting');
  
-- Here, I changed the order of columns I was inserting into,
--  so I had to declare them.
insert into test_table(number_of_pets, yearly_income, name, department) values 
  (4, 50000, 'Steve', 'Accounting');
  
-- Basic select call: find all people in the table
select * from test_table;

-- if I wanted to change the order, I could order by, which defaults
--  to ascending
select * from test_table
order by number_of_pets;

-- I can follow the order by clause with desc to get descending behavior
select * from test_table
order by number_of_pets desc;

-- We can use the where clause to filter out rows, and we can use the same
--  symbols as in Java: <, >, <=, >=
select * from test_table
where yearly_income < 40000;

-- We can do operations on entire tables using aggregate functions
-- Here we take the average income of everyone in the table!
select AVG(yearly_income) from test_table;

-- We can also filter out rows before running the aggregate
select AVG(number_of_pets) from test_table
where name like 'J%';

-- We can use Group By to further split up aggregate data
--  such as below, where we find the average income per
--  department
select department, AVG(yearly_income) as average_income
from test_table
group by department;

-- We can use having to filter results of aggregate functions
-- Note that you cant use aliases in the having clause in PostgreSQL
select department, AVG(yearly_income) as average_income
from test_table as t
group by department
having AVG(yearly_income) > 20000;





