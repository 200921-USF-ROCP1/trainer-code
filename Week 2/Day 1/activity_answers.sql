-- Part 1!

-- Apartments: id, building_letter, room_number, monthly_rent
create table apartments (
	id numeric primary key, 
	building_letter varchar(1),
	room_number numeric,
	monthly_rent numeric(10, 2) -- ie 8 characters before decimal, 2 characters after
);

-- Residents: id, first_name, last_name, apartment_id
create table residents (
	id numeric primary key,
	first_name varchar(60), 
	last_name varchar(60),
	apartment_id numeric references apartments(id)
);

-- Cars: id, make, model, year, license_plate, owner_id
create table cars (
	id numeric primary key, 
	make varchar(60),
	model varchar(60),
	year numeric(4),
	license_plate varchar(10),
	owner_id numeric references residents(id)
);

-- Pets: id, breed, name, apartment_id, is_service_animal
create table pets (
	id numeric primary key,
	breed varchar(60), 
	name varchar(60),
	apartment_id numeric references apartments(id),
	is_service_animal numeric(1)
);


-- Part 2!

INSERT INTO apartments VALUES
  (1, 'A', 1, 1250),
  (2, 'B', 1, 1300),
  (3, 'C', 1, 1500),
  (4, 'C', 2, 1400);

INSERT INTO residents VALUES
  (1, 'Jacob', 'Davis', 1),
  (2, 'Sally', 'Bobson', 2),
  (3, 'Ricky', 'Bobson', 2),
  (4, 'Martha', 'Stuart', 3),
  (5, 'Jackie', 'Samson', 4);

INSERT INTO cars VALUES
  (1, 'Toyota', 'Corolla', 1995, 'IGB18SS', 2),
  (2, 'Honda', 'Civic', 2001, 'FFGB91S', 3);

INSERT INTO pets VALUES
  (1, 'cat', 'Jimmy', 3, 0),
  (2, 'dog', 'Spot', 4, 1);
  
 
 -- Part 3!
 
 -- Get all residents
 select * from residents;

 -- Get all residents in building B
 select *
 from residents
 left join apartments 
 	on apartments.id = residents.apartment_id
 where apartments.building_letter = 'B';

 -- Get the average rent in building C
 select AVG(monthly_rent) 
 from apartments 
 where building_letter = 'C';

 -- Get the total number of pets
 select count(1)
 from pets;
 
 