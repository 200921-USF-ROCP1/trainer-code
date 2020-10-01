-- Part 1!

-- Apartments: id, building_letter, room_number, monthly_rent
create table apartments (
	id serial primary key, 
	building_letter varchar(1),
	room_number numeric,
	monthly_rent numeric(10, 2) -- ie 8 characters before decimal, 2 characters after
);

-- Residents: id, first_name, last_name, apartment_id
create table residents (
	id serial primary key,
	first_name varchar(60), 
	last_name varchar(60),
	apartment_id integer references apartments(id) on delete cascade
);

-- Cars: id, make, model, year, license_plate, owner_id
create table cars (
	id serial primary key, 
	make varchar(60),
	model varchar(60),
	year numeric(4),
	license_plate varchar(10),
	owner_id integer references residents(id) on delete cascade
);

-- Pets: id, breed, name, apartment_id, is_service_animal
create table pets (
	id serial primary key,
	breed varchar(60), 
	name varchar(60),
	apartment_id integer references apartments(id) on delete cascade,
	is_service_animal numeric(1)
);

-- Part 2!

INSERT INTO apartments (building_letter, room_number, monthly_rent) VALUES
  ('A', 1, 1250),
  ('B', 1, 1300),
  ('C', 1, 1500),
  ('C', 2, 1400);

INSERT INTO residents (first_name, last_name, apartment_id) VALUES
  ('Jacob', 'Davis', 1),
  ('Sally', 'Bobson', 2),
  ('Ricky', 'Bobson', 2),
  ('Martha', 'Stuart', 3),
  ('Jackie', 'Samson', 4);

INSERT INTO cars (make, model, year, license_plate, owner_id) VALUES
  ('Toyota', 'Corolla', 1995, 'IGB18SS', 2),
  ('Honda', 'Civic', 2001, 'FFGB91S', 3);

INSERT INTO pets (breed, name, apartment_id, is_service_animal) VALUES
  ('cat', 'Jimmy', 3, 0),
  ('dog', 'Spot', 4, 1);
  
 
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
 
 