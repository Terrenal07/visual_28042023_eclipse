--crear base de datos
DROP DATABASE IF EXISTS Triangulos;
CREATE DATABASE Triangulos;
--SELECCIONAR BASE DE DATOS
USE Triangulos;
--crear tabla
CREATE TABLE  Triangulos(
id INT NOT NULL AUTO_INCREMENT,
base DOUBLE NOT NULL,
altura DOUBLE NOT NULL,
    PRIMARY KEY (ID)
);
--insertar registros de una tabla
INSERT INTO Triangulos(base,altura)
VALUES(3.24,12.34);
INSERT INTO Triangulos(base,altura)
VALUES(1.25,10.41);
--mostrar todos los registros
SELECT*FROM Triangulos