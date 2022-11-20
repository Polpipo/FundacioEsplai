/*
DROP SCHEMA IF EXISTS ejercicio11;
CREATE SCHEMA IF NOT EXISTS ejercicio11;
USE ejercicio11;

CREATE TABLE IF NOT EXISTS ejercicio11.student(
 Sid INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
 Sname VARCHAR(50) NOT NULL,
 Sage INT NOT NULL,
 Ssex VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS ejercicio11.score(
 Cid INT AUTO_INCREMENT NOT NULL,
 score INT(2) NOT NULL,
 
 Sid INT,
 PRIMARY KEY (Cid, Sid),
    FOREIGN KEY (Sid)
    REFERENCES ejercicio11.student(Sid)
);

CREATE TABLE IF NOT EXISTS ejercicio11.course(
 Tid INT AUTO_INCREMENT NOT NULL,
 Cname VARCHAR(50) NOT NULL,
 
 Cid INT NOT NULL,
 PRIMARY KEY (Tid, Cid),
    FOREIGN KEY (Cid)
    REFERENCES ejercicio11.score(Cid)
);

CREATE TABLE IF NOT EXISTS ejercicio11.teacher(
 Tname VARCHAR(50) NOT NULL,
 
 Tid INT NOT NULL,
 PRIMARY KEY (Tname, Tid),
    FOREIGN KEY (Tid)
    REFERENCES ejercicio11.course(Tid)
);

INSERT INTO ejercicio11.student (Sname, Sage, Ssex) VALUES
	 ('Pol', 22, 'Male'),
     ('Gerard', 23, 'Male'),
     ('Julia', 18, 'Female'),
     ('Bianca', 27, 'Female'),
     ('Laia', 24, 'Female');
     
INSERT INTO ejercicio11.score (score, Sid) VALUES
	 (9, 1),
     (5, 2),
     (6, 3),
     (10, 4),
     (2, 5);
     
INSERT INTO ejercicio11.course (Cname, Cid) VALUES
	 ('Fisica', 1),
     ('Geografia', 2),
     ('Educacion Fisica', 3),
     ('Matematicas', 4),
     ('Lengua', 5);

INSERT INTO ejercicio11.teacher (Tname, Tid) VALUES
	 ('Roberto', 1),
     ('Albert', 2),
     ('Diana', 3),
     ('Pepito', 4),
     ('Alfredo', 5);
*/

-- Muestra los alumnos a los que un profesor les da clase.
SELECT stu.Sid, stu.Sname, tea.Tname
FROM ejercicio11.student stu
INNER JOIN ejercicio11.score sco
ON stu.Sid = sco.Sid

INNER JOIN ejercicio11.course cou
ON sco.Cid = cou.Cid

INNER JOIN ejercicio11.teacher tea
ON cou.Tid = tea.Tid
;

-- Muestra el total de cursos que imparte el profesor
SELECT cou.Tid, tea.Tname, cou.Cname
FROM ejercicio11.course cou
INNER JOIN ejercicio11.teacher tea
ON cou.Tid = tea.Tid
;

-- Muestra el total de cursos que ha realizada el alumno
SELECT stu.Sid, stu.Sname, cou.Cname
FROM ejercicio11.student stu

INNER JOIN ejercicio11.score sco
ON stu.Sid = sco.Sid

INNER JOIN ejercicio11.course cou
ON sco.Cid = cou.Cid
;
