-- I want many accounts to be held many users and vice versa

-- How can I do that?

-- I can have a one to many relationship: one account to many users
create table users ( 
	id serial,
	username varchar(60),
	password varchar(60),
	references accounts(id)
);

create table accounts (
	id serial,
	account_balance
);

-- I can have a one to many relationship: one user to many accounts
create table users ( 
	id serial,
	username varchar(60),
	password varchar(60)
);

create table accounts (
	id serial,
	account_balance numeric,
	user_id references users(id)
);


-- So how can we get many users to many accounts?


-- Many to many relationship

drop table users_accounts;
drop table accounts;
drop table users;

create table users ( 
	id serial primary key,
	username varchar(60),
	password varchar(60)
);

create table accounts (
	id serial primary key,
	account_balance numeric
);

create table users_accounts (
	user_id serial references users(id),
	account_id serial references accounts(id)
);

-- Test data
insert into users (username, password) values
	('jacobd', 'password'),
	('otherguy', 'password');

insert into accounts (account_balance) values
	(1500),
	(1200),
	(30000);

insert into users_accounts values 
	(1, 1), -- user 1 owns account 1
	(2, 2), -- user 2 owns account 2
	(1, 3),
	(2, 3);

-- find all users that have ownership of account 3
select users.*, accounts.* from users 
	left join users_accounts on users.id = users_accounts.user_id
	left join accounts on users_accounts.account_id = accounts.id
	where accounts.id = 3;
	
