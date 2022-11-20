/*
DROP SCHEMA IF EXISTS ejercicio10;
CREATE SCHEMA IF NOT EXISTS ejercicio10;
USE ejercicio10;

CREATE TABLE IF NOT EXISTS ejercicio10.salesman (
	`salesman_id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `name` VARCHAR(30) NOT NULL,
    `city` VARCHAR(15) NOT NULL,
    `comission` DECIMAL(5,2)
    );
    
CREATE TABLE IF NOT EXISTS ejercicio10.costumer (
	`costumer_id` INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    `cust_name` VARCHAR(30) NOT NULL,
    `city` VARCHAR(15) NOT NULL,
    `grade` NUMERIC(3)
    );

CREATE TABLE IF NOT EXISTS ejercicio10.orders (
	`order_no` INT AUTO_INCREMENT NOT NULL,
    `purch_amt` DECIMAL(8,2) NOT NULL,
    `ord_date` DATE NOT NULL,
    `grade` NUMERIC(3),
    `salesman_id` INT NOT NULL,
    `costumer_id` INT NOT NULL,
    PRIMARY KEY (`order_no`, `salesman_id`, `costumer_id`),
    FOREIGN KEY (`salesman_id`)
    REFERENCES ejercicio10.salesman(`salesman_id`), 

    FOREIGN KEY (`costumer_id`)
    REFERENCES ejercicio10.costumer(`costumer_id`)
    );
    
INSERT INTO ejercicio10.salesman(`name`, `city`, `comission`) VALUES 
	('Pol', 'Barcelona', 190.00),
    ('Adri', 'Paris', 140.00),
    ('Guillem', 'Madrid', 50.00),
    ('Victor', 'Sevilla', 70.00),
    ('Julia', 'Lima', 50.00),
    ('Marta', 'Mataro', 60.00),
    ('Bianca', 'Mallorca', 230.00),
    ('Laia', 'Girona', 850.00),
    ('Xavi', 'Los Angeles', 305.00),
    ('Pepa', 'Tarragona', 00.00)
    ;

INSERT INTO ejercicio10.costumer(`cust_name`, `city`, `grade`) VALUES 
	('Pepo', 'Barcelona', 100),
    ('David', 'Seul', 40),
    ('Marc', 'Segovia', 50),
    ('Pepito', 'Valladolid', 70),
    ('Manolo', 'Almeria', 50),
    ('Martina', 'Cadiz', 60),
    ('Alba', 'Toledo', 20),
    ('Pepo', 'Valencia', 85),
    ('Asuncion', 'Alicante', 30),
    ('Alberto', 'Soria', 00)
    ;
    
INSERT INTO ejercicio10.orders(`purch_amt`, `ord_date`, `grade`, `salesman_id`, `costumer_id`) VALUES 
	(300.20, '2001-12-12', 100, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Barcelona'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Barcelona')),
    (830.24, '2010-11-15', 0, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Paris'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Seul')),
    (160.40, '2000-09-19', 80, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Madrid'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Segovia')),
    (132.80, '2000-09-30', 20, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Sevilla'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Valladolid')),
    (70.98, '2012-12-20', 70, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Lima'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Almeria')),
    (340.24, '2003-12-02', 90, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Mataro'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Cadiz')),
    (10.40, '2022-02-04', 75, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Mallorca'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Toledo')),
    (390.37, '2000-03-12', 60, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Girona'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Valencia')),
    (213.22, '2009-04-03', 40, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Los Angeles'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Alicante')),
    (452.96, '2020-08-20', 30, (SELECT salesman_id FROM ejercicio10.salesman WHERE city = 'Tarragona'), (SELECT costumer_id FROM ejercicio10.costumer WHERE city = 'Soria'))
    ;
    
*/
-- Cuenta los elementos el total de registros que tiene la tabla orders
SELECT COUNT(*) FROM ejercicio10.orders;

-- Muestra los customers que tienen nombres distintos, es decir, que no se repiten.
SELECT DISTINCT cust_name FROM ejercicio10.costumer;

-- Ordena los salemans en función de las ventas que han realizado.
SELECT * FROM ejercicio10.salesman ORDER BY comission desc;

-- Muestra solamente los 5 primeros customers (ordenados por id).
SELECT * FROM ejercicio10.costumer LIMIT 5;

-- Saca el registro con un PURCH_AMT menor.
SELECT MIN(purch_amt) FROM ejercicio10.orders;

-- Saca el registro con un PURCH_AMT mayor.
SELECT MAX(purch_amt) FROM ejercicio10.orders;