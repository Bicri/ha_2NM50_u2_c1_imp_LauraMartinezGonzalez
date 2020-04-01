

create database GestionAlumnos;

use  GestionAlumnos;

create table alumnos
(
	boleta int unique,
    nombre varchar(50),
    PrimerAp varchar(50),
    SegundoAp varchar(50)
);

select * from alumnos