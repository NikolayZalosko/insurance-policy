DROP TABLE IF EXISTS insurance_policy, person, vehicle;

CREATE TABLE insurance_policy (
	id BIGINT PRIMARY KEY,
	type VARCHAR(50) NOT NULL,
	insurant_id BIGINT NOT NULL,
	start_date TIMESTAMP NOT NULL,
	end_date TIMESTAMP NOT NULL,
	vehicle_id BIGINT NOT NULL,
	sign_date DATE NOT NULL
);
CREATE TABLE person (
	id BIGINT PRIMARY KEY,
	full_name VARCHAR(255) NOT NULL,
	address VARCHAR(255) NOT NULL,
	passport_info VARCHAR(255) NOT NULL,
	phone_number VARCHAR(50) NOT NULL,
	email VARCHAR(255) NOT NULL
);

CREATE TABLE vehicle (
	id BIGINT PRIMARY KEY,
	model VARCHAR(255) NOT NULL,
	production_year INT NOT NULL,
	VIN VARCHAR(255) NOT NULL,
	register_sign VARCHAR(255) NOT NULL,
	category VARCHAR(255) NOT NULL
);

ALTER TABLE insurance_policy
ADD CONSTRAINT fk_insurant
FOREIGN KEY (insurant_id) REFERENCES person(id);

ALTER TABLE insurance_policy
ADD CONSTRAINT fk_vehicle
FOREIGN KEY (vehicle_id) REFERENCES vehicle(id);
