create database if not exists ejercicio4;
use ejercicio4;
create table if not exists Album (
	idAlbum integer primary key auto_increment,
    albumName varchar(255),
    dateReleased year
);
create table if not exists Gnere (
	idGenre integer primary key auto_increment,
    genre varchar(255)
);
create table if not exists Artist (
	artistId integer primary key auto_increment,
    artistName varchar(255)
);
INSERT INTO ejercicio4.Album VALUES 
	(null, 'THE WHITE ALBUM', '1968'), 
    (null, 'BLONDE ON BLONDE', '1966'),
    (null, 'LONDON CALLING', '1980'),
    (null, 'EXILE ON MAIN STREET', '1972'),
    (null, 'WHAT’S GOING ON', '1971'),
    (null, 'RUBBER SOUL', '1965'),
    (null, 'HIGHWAY 61 REVISITED', '1965'),
    (null, 'REVOLVER', '1966'),
    (null, 'PET SOUNDS', '1966'),
    (null, 'SGT. PEPPER’S LONELY HEARTS CLUB BAND', '1967');
INSERT INTO ejercicio4.Artist VALUES 
	(null, 'The Beatles'), 
	(null, 'Madonna'),
    (null, 'Elton John'),
    (null, 'Elvis Presley'),
    (null, 'Mariah Carey'),
    (null, 'Stevie Wonder'),
    (null, 'Janet Jackson'),
    (null, 'Michael Jackson'),
    (null, 'Whitney Houston'),
    (null, 'Rihanna');
INSERT INTO ejercicio4.Gnere VALUES 
	(null, 'Rap'), 
	(null, 'Pop'),
    (null, 'Rock'),
    (null, 'Clasico'),
    (null, 'Reggaeton'),
    (null, 'Electrónica'),
    (null, 'Country'),
    (null, 'Metal'),
    (null, 'Folk'),
    (null, 'Flamenco');

select * from ejercicio4.gnere;





