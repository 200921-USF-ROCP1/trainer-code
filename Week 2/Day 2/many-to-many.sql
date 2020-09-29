select * from residents;

-- DML
-- update
update residents -- update some table
	set last_name = 'Sillyson' -- new values for columns
	where id = 1 -- given the set of columns that matches this condition
	
insert into apartments values
  (1, 'A', 1, 1250), 
  (2, 'B', 1, 1300),
  (3, 'C', 1, 1500),
  (4, 'C', 2, 1400);
	
-- delete
delete from residents -- delete rows from a table
	where id = 4 -- I could delete given some condition

-- truncate
truncate residents; -- Deletes all of the rows, but not the table
	
-- DDL
-- create
create table my_table (
	some_column numeric(1, 0) -- Columns go: column_name data_type and are comma-delimited
);

-- drop
drop residents; -- Outright deletes the table and all of its data

-- alter
alter table residents drop column last_name;
alter table residents add column last_name varchar(60);
alter table residents alter column first_name set not null; -- use set to add restrictions other restrictions include unique
alter table residents alter column first_name drop not null; -- use drop to get rid of restrictions
alter table cars drop constraint cars_owner_id_fkey; -- to drop a foreign key, find its name and use drop constraint
