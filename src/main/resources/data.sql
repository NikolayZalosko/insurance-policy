INSERT INTO person (id, full_name, address, passport_info, phone_number, email)
VALUES (1, 'Иванов Иван Иванович', 'г. Минск, ул. Кальварийская, д. 1, кв. 1', 'AB1234567 выдан Фрунз. РУВД 20.12.2016', '+375 (29) 123-45-67 ', 'ivanov.ivan@example.com');

INSERT INTO vehicle (id, model, production_year, VIN, register_sign, category)
VALUES (1, 'Toyota Corolla', 2016, 'JTHBAA0E490144371', '1234AB-7', 'C');

INSERT INTO insurance_policy (id, type, insurant_id, start_date, end_date, vehicle_id, sign_date)
VALUES (1, 'COLLISION_COVERAGE', 1, '2020-12-20 17:30:00', '2021-12-20 17:30:00', 1, '2020-12-20');