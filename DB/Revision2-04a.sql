DROP DATABASE IF EXISTS Biblio2;
CREATE DATABASE Biblio2;

USE Biblio2;

-- Un thème porte sur 0 ou plusieurs livres.
CREATE TABLE Theme (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Libelle VARCHAR(64) NOT NULL,
    PRIMARY KEY(Id)
)\p;

-- Un auteur peut avoir écrit 0 ou plusieurs livres.
CREATE TABLE Auteur (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    DateNaissance DATE NULL,
    Nationalite VARCHAR(64) NULL,
    PRIMARY KEY(Id)
)\p;

-- Un livre est écrit par un seul auteur. Un livre porte sur un thème. Un livre peut être emprunté 0 ou plusieurs fois.
CREATE TABLE Livre (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Titre VARCHAR(128) NOT NULL,
    ISBN INT UNSIGNED NOT NULL,
    Langue VARCHAR(32) NOT NULL,
    AnneePublication INT UNSIGNED NULL,
    NombrePages INT UNSIGNED NULL,
    NombreExemplaires INT UNSIGNED NULL,
    DateAchat DATE NULL,
    IdTheme INT UNSIGNED NOT NULL,
    -- IdAuteur INT UNSIGNED NOT NULL,
    CONSTRAINT PRIMARY KEY(Id),
    FOREIGN KEY(IdTheme) REFERENCES Theme(Id)
)\p;

CREATE TABLE Auteur_Livre (
    IdAuteur INT UNSIGNED NOT NULL,
    IdLivre INT UNSIGNED NOT NULL,
    PRIMARY KEY (IdAuteur, IdLivre),
    FOREIGN KEY(IdAuteur) REFERENCES Auteur(Id),
    FOREIGN KEY(IdLivre) REFERENCES Livre(Id)
)\p;

-- Un lecteur a emprunté 0 ou plusieurs livres.
CREATE TABLE Lecteur (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    Naissance DATE NULL,
    PRIMARY KEY(Id)
)\p;

-- Rendu (O/N), Un livre est emprunté par un et un seul lecteur. Un emprunt concerne 1 et seul livre.
CREATE TABLE Emprunt (
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    DateDebut DATE NOT NULL,
    DateFin DATE NOT NULL,
    Rendu BOOLEAN NOT NULL,
    IdLecteur INT UNSIGNED NOT NULL,
    IdLivre int UNSIGNED NOT NULL,
    PRIMARY KEY(Id),
    FOREIGN KEY(IdLecteur) REFERENCES Lecteur(Id),
    FOREIGN KEY(IdLivre) REFERENCES Livre(Id)
)\p;

INSERT INTO Theme (Libelle)
VALUES('Programmation'),('Roman'),('Science-Fiction'),('Thriller'),('Policier')\p;

INSERT INTO Auteur (Nom, Prenom, DateNaissance, Nationalite)
VALUES ('Fauteuil', 'Daniel', '1975-04-22', 'FR'),
('Dusquez', 'Nathalie', '1973-11-07', 'BE'),
('Charvet', 'Clement', '1967-03-14', 'FR'),
('Caulon', 'Fernand', '1980-05-11', 'BE'),
('Canne', 'Alice', '1985-02-12', 'BE')\p;

INSERT INTO Livre (Titre, ISBN, Langue, AnneePublication, NombrePages, NombreExemplaires, DateAchat, IdTheme)
VALUES ('Le Grand Bouquin', 112233, 'FR', 1960, 500, 359, '1961-01-01', 1),
('Le pleind''pages', 221133, 'FR', 1998, 240, 120, '2013-10-05', 2),
('The edgy lord dealer', 982486, 'EN', 2015, 69, 1800, '2013-06-05', 4),
('Des cables et des disques', 344355, 'FR', 2018, 200, 760, '2019-07-21', 1),
('Osez DOS', 669754, 'FR', 2018, 350, 1200, '2019-09-19', 1)\p;

INSERT INTO Lecteur (Nom, Prenom, Naissance)
VALUES ('Delacroix', 'Gertrude', '1964-07-13'),
('Vaillant', 'Bertrand', '1972-03-21'),
('LeBrun', 'Jonathan', '1980-11-25'),
('Durif', 'Sylvestre', '1961-02-12'),
('Faure', 'Lina', '1990-01-19')\p;

INSERT INTO Emprunt (DateDebut, DateFin, Rendu, IdLecteur, IdLivre)
VALUES ('2022-01-01','2022-01-15', FALSE, 3, 1),
('2022-01-01','2022-01-15', FALSE, 1, 2),
('2022-01-01','2022-01-15', FALSE, 2, 3)\p;

INSERT INTO Auteur_Livre (IdAuteur, IdLivre)
VALUES (1, 1),
(2, 1),
(3, 2),
(4, 3),
(5, 4)\p;

SELECT *
FROM Lecteur
;
-- Ajout de la colonne inscription pour les lecteurs.
ALTER TABLE Lecteur
ADD Inscription DATE NULL
;
DESC Lecteur;

-- Valeur par defaut.
UPDATE Lecteur
SET Inscription = '0000-00-00'
;
-- Valeur précise pour l'id 1.
UPDATE Lecteur
SET Inscription = '2022-01-15'
WHERE Id = 1
;

ALTER TABLE Lecteur
MODIFY Inscription DATE NOT NULL
;

DESC Lecteur;

SELECT *
FROM Lecteur
;