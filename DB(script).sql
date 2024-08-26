                                            TABLE FROM USERS
-----------------------------------------------------------------------------------------------------------------------
CREATE TABLE users
(
	id BIGSERIAL PRIMARY KEY,
	first_name VARCHAR(255),
	last_name VARCHAR(255),
	email VARCHAR(255),
	date_of_birth VARCHAR(255),
	gender VARCHAR(255),
	phone_number VARCHAR(255)
);

INSERT INTO users (first_name, last_name, email, date_of_birth, gender, phone_number)
VALUES
('John', 'Doe', 'johndoe@example.com', '1990-01-01', 'Male', '+1234567890'),
('Jane', 'Smith', 'janesmith@example.com', '1992-05-15', 'Female', '+9876543210'),
('David', 'Johnson', 'davidjohnson@example.com', '1985-09-30', 'Male', '+1122334455'),
('Emily', 'Brown', 'emilybrown@example.com', '1988-12-12', 'Female', '+9988776655'),
('Michael', 'Wilson', 'michaelwilson@example.com', '1993-06-20', 'Male', '+5544332211'),
('Sarah', 'Anderson', 'sarahanderson@example.com', '1991-02-18', 'Female', '+6677889900'),
('Christopher', 'Martinez', 'christophermartinez@example.com', '1987-07-04', 'Male', '+1122998877'),
('Olivia', 'Lee', 'olivialeee@example.com', '1989-11-27', 'Female', '+8899776655'),
('Daniel', 'Taylor', 'danieltaylor@example.com', '1995-09-10', 'Male', '+5566778899'),
('Sophia', 'Walker', 'sophiawalker@example.com', '1986-03-05', 'Female', '+9988776655'),
('Matthew', 'Harris', 'matthewharris@example.com', '1994-08-22', 'Male', '+2233445566'),
('Ava', 'Thomas', 'avathomas@example.com', '1998-12-09', 'Female', '+6655443322'),
('Andrew', 'White', 'andrewwhite@example.com', '1997-01-14', 'Male', '+8877665544'),
('Isabella', 'Robinson', 'isabellarobinson@example.com', '1996-04-27', 'Female', '+9988776655'),
('Joseph', 'Clark', 'josephclark@example.com', '1992-07-08', 'Male', '+1122334455'),
('Mia', 'Evans', 'miaevans@example.com', '1993-09-16', 'Female', '+3322114466'),
('James', 'Hall', 'jameshall@example.com', '1990-11-19', 'Male', '+6655443322'),
('Charlotte', 'Lewis', 'charlottelewis@example.com', '1988-03-24', 'Female', '+9988776655'),
('Benjamin', 'Young', 'benjaminyoung@example.com', '1995-05-11', 'Male', '+1122334455'),
('Amelia', 'King', 'ameliaking@example.com', '1991-06-26', 'Female', '+4455667788');

ALTER TABLE users ADD COLUMN password VARCHAR(255);
UPDATE users SET password = MD5(RANDOM()::text) FROM generate_series(1, 20);

-----------------------------------------------------------------------------------------------------------------------
                                            TABLE FROM CARS
-----------------------------------------------------------------------------------------------------------------------
CREATE TABLE cars
(
	id BIGSERIAL PRIMARY KEY,
	brand VARCHAR(255),
	model VARCHAR(255),
	year_of_publishing VARCHAR(255),
	country_of_origin VARCHAR(255),
	horse_power VARCHAR(255),
	color VARCHAR(255),
	price VARCHAR(255)
);

INSERT INTO cars (brand, model, year_of_publishing, country_of_origin, horse_power, color, price)
VALUES
('Volkswagen', 'Golf', 2020, 'Germany', 150, 'Blue', 25000),
('BMW', '3 Series', 2021, 'Germany', 190, 'Black', 35000),
('Audi', 'A4', 2021, 'Germany', 200, 'White', 37000),
('Toyota', 'Camry', 2020, 'Japan', 200, 'Silver', 24000),
('Honda', 'Civic', 2021, 'Japan', 158, 'Red', 22000),
('Nissan', 'Altima', 2020, 'Japan', 182, 'Gray', 23000),
('Ford', 'Mustang', 2021, 'USA', 450, 'Yellow', 45000),
('Hyundai', 'Elantra', 2021, 'South Korea', 147, 'Green', 20000),
('Kia', 'Optima', 2020, 'South Korea', 178, 'Blue', 22000),
('Mercedes-Benz', 'C-Class', 2021, 'Germany', 255, 'Black', 42000);

-----------------------------------------------------------------------------------------------------------------------
