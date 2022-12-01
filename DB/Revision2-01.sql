DROP DATABASE IF EXISTS Biblio;
CREATE DATABASE Biblio;

USE Biblio;

CREATE TABLE Auteur (
    -- Un auteur peut avoir écrit 0 ou plusieurs livres.
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    DateNaissance DATE NULL,
    Nationalite VARCHAR(64) NULL,
    IdLivre INT UNSIGNED NOT NULL,
    PRIMARY KEY(Id)
);
CREATE TABLE Theme (
    -- Un thème porte sur 0 ou plusieurs livres.
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Libelle VARCHAR(64) NOT NULL,
    PRIMARY KEY(Id)
);
CREATE TABLE Emprunt (
    -- Rendu (O/N), Un livre est emprunté par un et un seul lecteur. Un emprunt concerne 1 et seul livre.
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    DateDebut DATE NOT NULL,
    DatFin DATE NOT NULL,
    Rendu VARCHAR(1) NOT NULL,
    PRIMARY KEY(Id)
);
CREATE TABLE Livre (
    -- Un livre est écrit par un seul auteur. Un livre porte sur un thème. Un livre peut être emprunté 0 ou plusieurs fois.
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Titre VARCHAR(128) NOT NULL,
    ISBN INT UNSIGNED NOT NULL,
    Langue VARCHAR(32) NOT NULL,
    AnnéePublication INT UNSIGNED NULL,
    NombrePages INT UNSIGNED NULL,
    NombreExemplaires INT UNSIGNED NULL,
    DateAchat DATE NULL,
    IdTheme INT UNSIGNED NOT NULL,
    PRIMARY KEY(Id),
    FOREIGN KEY(IdTheme) REFERENCES Theme(Id)
);
CREATE TABLE Lecteur (
    -- Un lecteur a emprunté 0 ou plusieurs livres.
    Id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    Naissance DATE NULL,
    PRIMARY KEY(Id)
);

INSERT INTO Theme (Libelle)
VALUES('Programmation'),('Roman'),('Science-Fiction'),('Thriller'),('Policier');

INSERT INTO Livre (Titre, ISBN, Langue, AnnéePublication, NombrePages, NombreExemplaires, DateAchat, IdTheme)
VALUES ('Le Grand Bouquin', 112233, 'FR', 1960, 500, 359, '1961-01-01', 1),
('Le pleind''pages', 221133, 'FR', 1998, 240, 120, '2013-10-05', 2),
('The edgy lord dealer', 982486, 'EN', 2015, 69, 1800, '2013-06-05', 3);

INSERT INTO Lecteur (Nom, Prenom, Naissance)
VALUES ('Delacroix', 'Gertrude', '1964-07-13'),
('Vaillant', 'Bertrand', '1972-03-21'),
('LeBrun', 'Jonathan', '1980-11-25'),
('Durif', 'Sylvestre', '1961-02-12'),
('Faure', 'Lina', '1990-01-19');

INSERT INTO Auteur (Nom, Prenom, DateNaissance, Nationalite, IdLivre)
VALUES ('Fauteuil', 'Daniel', '1975-04-22', 'FR', 1),
('Dusquez', 'Nathalie', '1973-11-07', 'BE', 2),
('Charvet', 'Clément', '1967-03-14', 'FR', 3),
('', '', '2000-01-01', 'BE', 1),
('', '', '2000-01-01', 'BE', 1);

-- INSERT INTO Emprunt (DateDebut, DatFin, Rendu)
-- VALUES ()
-- ;

SELECT * FROM Theme;
SELECT * FROM Livre;
SELECT * FROM Lecteur;
SELECT * FROM Auteur;
-- SELECT * FROM Emprunt;

/*
Ajoutez 3 livres. V
Ajoutez 5 lecteurs. V
Ajoutez 3 Emprunts par des lecteurs différents et des livres différents.
Ajoutez 5 thèmes: Programmation, Roman, Science-Fiction, Thriller et Policier. V
Ajoutez 5 auteurs. V
*/