create database reservation;

use reservation;

create table user
(
id int not null auto_increment,
first_name varchar(20),
last_name varchar(20),
email varchar(64),
password varchar(20),
primary key (id),
unique key(email)
);

create table flight
(
id INT NOT NULL auto_increment,
flight_number varchar(20) not null,
operating_airlines varchar(20) not null,
departure_city varchar(20) not null,
arrival_city varchar(20) not null,
date_of_departure varchar(20) not null,
estimated_departure_time timestamp default current_timestamp,
primary key (id)
);

create table passenger
(
id int not null auto_increment,
first_name varchar(256),
last_name varchar(256),
midlle_name varchar(256),
email varchar(50),
phone varchar(10),
primary key (id)
);

create table reservation
(
id int not null auto_increment,
checked_in tinyint(1),
number_of_bags int,
passenger_id int,
flight_id int,
created timestamp default current_timestamp,
primary key (id),
foreign key (passenger_id) references passenger(id) on delete cascade,
foreign key (flight_id) references flight(id)
);

insert into flight values (1, 'AA1', 'American Airlines', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
insert into flight values (2, 'AA2', 'Air Algerie', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
insert into flight values (3, 'AA3', 'Aigle Azure', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
insert into flight values (4, 'AA4', 'Air France', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
insert into flight values (5, 'AA5', 'United Airlines', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
insert into flight values (6, 'AA6', 'Transavia', 'AUS', 'NYC', STR_TO_DATE('02-05-2018', '%d-%m-%Y'), '2018-02-05 03:14:07');
