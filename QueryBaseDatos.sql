

create database gestionalumnos;

use  gestionalumnos;

create table alumnos
(
    boleta int unique,
    nombre varchar(50),
    PrimerAp varchar(50),
    SegundoAp varchar(50)
);

create table profesor
(
	Numero_economico int unique,
	nombre varchar(50),
	primerAp varchar(50),
	segundoAp varchar(50),
	contraseña varchar(22)
);