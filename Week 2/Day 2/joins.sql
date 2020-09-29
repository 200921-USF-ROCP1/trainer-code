-- the "left" table is the "from" table, and "right" table is the "join" table

-- left join: get all data in the left table, 
-- plus data matching the join condition in the 
-- right table. Rows that don't get matches in the
-- left table get nulls for the new columns. Also
-- called a left outer join
select apartments.*, residents.* from apartments 
	left join residents on apartments.id = residents.apartment_id;
	
-- right join: get all data from the right table,
-- with only matching rows from the left. null values
-- for any rows in the right table with no matches. Also
-- called a right outer join.
select apartments.*, residents.* from apartments 
	right join residents on apartments.id = residents.apartment_id;

-- inner join: only gives rows with a match for the join condition.
-- join by itself is implied to be an inner join
select apartments.*, residents.* from apartments 
	inner join residents on apartments.id = residents.apartment_id;

-- full outer join or full join gives all rows from both tables,
-- connecting matches if they exist
select apartments.*, residents.* from apartments 
	full outer join residents on apartments.id = residents.apartment_id;

-- cross join: gives every permutation of combinations of rows from
-- tables a and b, eg a.1 <-> b.1, a.2 <-> b.1, a.1 <-> b.2, etc...
select apartments.*, residents.* from apartments
	cross join residents;
	
select apartments.*, residents.* from apartments, residents
	where apartments.id = residents.apartment_id;

-- natural join: join on columns of the same name. Works with
-- left, right, full, and inner joins
select apartments.*, residents.* from apartments
	natural join residents;
	
