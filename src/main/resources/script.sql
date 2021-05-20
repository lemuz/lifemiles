CREATE DATABASE lifemiles;

use lifemiles;

CREATE TABLE metodo (
    id_metodo int NOT NULL AUTO_INCREMENT,
    nombre varchar(25) NOT NULL,
    PRIMARY KEY (id_metodo)
);

CREATE TABLE letras (
    id_letra int NOT NULL AUTO_INCREMENT,
    id_metodo int NOT NULL,
    letra char NOT NULL,
    PRIMARY KEY (id_letra),
    FOREIGN KEY (id_metodo) REFERENCES metodo(id_metodo)
);

INSERT INTO metodo VALUES(0, 'morse');
INSERT INTO metodo VALUES(0, 'octal');
INSERT INTO metodo VALUES(0, 'bacedifogu');

INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')
INSERT INTO letras VALUES(0,1,'')