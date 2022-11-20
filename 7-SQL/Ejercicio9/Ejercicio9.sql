-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
/*
drop database if exists mydb;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`country` (
  `country_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(50) NOT NULL,
  `last_update` TIMESTAMP NOT NULL,
  PRIMARY KEY (`country_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`city` (
  `city_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `city` VARCHAR(50) NOT NULL,
  `last_update` TIMESTAMP NOT NULL,
  `country_country_id` SMALLINT NOT NULL,
  PRIMARY KEY (`city_id`),
  INDEX `fk_city_country_idx` (`country_country_id` ASC) VISIBLE,
  CONSTRAINT `fk_city_country`
    FOREIGN KEY (`country_country_id`)
    REFERENCES `mydb`.`country` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`address` (
  `address_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(50) NOT NULL,
  `address2` VARCHAR(50) NULL,
  `district` VARCHAR(20) NOT NULL,
  `postal_code` VARCHAR(10) NULL,
  `phone` VARCHAR(20) NOT NULL,
  `location` VARCHAR(20) NOT NULL,
  `last_update` TIMESTAMP NOT NULL,
  `city_city_id` SMALLINT NOT NULL,
  PRIMARY KEY (`address_id`),
  INDEX `fk_address_city1_idx` (`city_city_id` ASC) VISIBLE,
  CONSTRAINT `fk_address_city1`
    FOREIGN KEY (`city_city_id`)
    REFERENCES `mydb`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO mydb.country (country, last_update) VALUES
	('Spain', '2022-12-12 00:00:00'),
    ('Portugal', '2022-12-12 00:00:00'),
    ('EEUU', '2022-12-12 00:00:00'),
    ('Germany', '2022-12-12 00:00:00'),
    ('Britain', '2022-12-12 00:00:00'),
    ('France', '2022-12-12 00:00:00'),
    ('Morocco', '2022-12-12 00:00:00'),
    ('Russia', '2022-12-12 00:00:00'),
    ('Indonesia', '2022-12-12 00:00:00'),
    ('Turkey', '2022-12-12 00:00:00'),
    ('Switzerland', '2022-12-12 00:00:00'),
    ('Australia', '2022-12-12 00:00:00'),
    ('Colombia', '2022-12-12 00:00:00'),
    ('Ecuador', '2022-12-12 00:00:00'),
    ('Brasil', '2022-12-12 00:00:00'),
    ('Argentina', '2022-12-12 00:00:00'),
    ('Chile', '2022-12-12 00:00:00'),
    ('Korea', '2022-12-12 00:00:00'),
    ('China', '2022-12-12 00:00:00'),
    ('Japan', '2022-12-12 00:00:00')
    ;
    
    SELECT * FROM mydb.country;
    
    
INSERT INTO mydb.city (city, last_update, country_country_id) VALUES
	('Barcelona', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country = 'Spain')),
    ('Lisboa', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country = 'Portugal')),
    ('Chicago', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='EEUU')),
    ('Berlin', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Germany')),
    ('Londres', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Britain')),
    ('Paris', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='France')),
    ('Fez', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Morocco')),
    ('Moscow', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Russia')),
    ('Bali', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Indonesia')),
    ('Istambul', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Turkey')),
    ('Zurich', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Switzerland')),
    ('Melbourne', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Australia')),
    ('Bogota', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Colombia')),
    ('Quito', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Ecuador')),
    ('Sao Paulo', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Brasil')),
    ('Buenos Aires', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Argentina')),
    ('Santiago', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Chile')),
    ('Seul', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Korea')),
    ('Hong Kong', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='China')),
    ('Tokyo', '2022-12-12 00:00:00', (SELECT country_id FROM country WHERE country='Japan'))
    ;
    
    SELECT * FROM mydb.city;
    
    
INSERT INTO mydb.address (address, district, postal_code, phone, location, last_update, city_city_id) VALUES
	('Street 1', 'Spain district', '00001', '6666666', 'Spain', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Barcelona')),
    ('Street 2', 'Portugal district', '00002', '6666666', 'Portugal', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Lisboa')),
    ('Street 3', 'EEUU district', '00003', '6666666', 'EEUU', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Chicago')),
    ('Street 4', 'Germany district', '00004', '6666666', 'Germany', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Berlin')),
    ('Street 5', 'Britain district', '00005', '6666666', 'Britain', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Londres')),
    ('Street 6', 'France district', '00006', '6666666', 'France', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Paris')),
    ('Street 7', 'Morocco district', '00007', '6666666', 'Morocco', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Fez')),
    ('Street 8', 'Russia district', '00008', '6666666', 'Russia', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Moscow')),
    ('Street 9', 'Indonesia district', '00009', '6666666', 'Indonesia', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Bali')),
    ('Street 10', 'Turkey district', '00010', '6666666', 'Turkey', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Istambul')),
    ('Street 11', 'Switzerland district', '00011', '6666666', 'Switzerland', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Zurich')),
    ('Street 12', 'Australia district', '00012', '6666666', 'Australia', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Melbourne')),
    ('Street 13', 'Colombia district', '00013', '6666666', 'Colombia', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Bogota')),
    ('Street 14', 'Ecuador district', '00014', '6666666', 'Ecuador', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Quito')),
    ('Street 15', 'Brasil district', '00015', '6666666', 'Brasil', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Sao Paulo')),
    ('Street 16', 'Argentina district', '00016', '6666666', 'Argentina', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Buenos Aires')),
    ('Street 17', 'Chile district', '00017', '6666666', 'Chile', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Santiago')),
    ('Street 18', 'Korea district', '00018', '6666666', 'Korea', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Seul')),
    ('Street 19', 'China district', '00019', '6666666', 'China', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Hong Kong')),
    ('Street 20', 'Japan district', '00020', '6666666', 'Japan', '2000-01-01 00:00:00', (SELECT city_id FROM city WHERE city='Tokyo'));
*/

SELECT address_id, address, city, country
	FROM mydb.address
    INNER JOIN mydb.city
    ON address_id = city_id
    INNER JOIN mydb.country
    ON address_id = country_id;