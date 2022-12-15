DROP DATABASE IF EXISTS Biblio4;
CREATE DATABASE Biblio4;

USE Biblio4;

-- Un thème porte sur 0 ou plusieurs livres.
CREATE TABLE theme (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    libelle VARCHAR(64) NOT NULL,
    PRIMARY KEY(Id)
)\p;

-- Un auteur peut avoir écrit 0 ou plusieurs livres.
CREATE TABLE auteur (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nom VARCHAR(64) NOT NULL,
    prenom VARCHAR(64) NOT NULL,
    date_naissance DATE NULL,
    nationalite VARCHAR(64) NULL,
    PRIMARY KEY(Id)
)\p;

-- Un livre est écrit par un seul auteur. Un livre porte sur un thème. Un livre peut être emprunté 0 ou plusieurs fois.
CREATE TABLE livre (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    titre VARCHAR(128) NOT NULL,
    isbn INT UNSIGNED NOT NULL,
    langue VARCHAR(32) NOT NULL,
    annee_publication INT UNSIGNED NULL,
    nombre_pages INT UNSIGNED NULL,
    nombre_exemplaires INT UNSIGNED NULL,
    date_achat DATE NULL,
    id_theme INT UNSIGNED NOT NULL,
    -- IdAuteur INT UNSIGNED NOT NULL,
    CONSTRAINT PRIMARY KEY(id),
    FOREIGN KEY(id_theme) REFERENCES theme(id)
)\p;

CREATE TABLE auteur_livre (
    id_auteur INT UNSIGNED NOT NULL,
    id_livre INT UNSIGNED NOT NULL,
    PRIMARY KEY (id_auteur, id_livre),
    FOREIGN KEY(id_auteur) REFERENCES auteur(id),
    FOREIGN KEY(id_livre) REFERENCES livre(id)
)\p;

-- Un lecteur a emprunté 0 ou plusieurs livres.
CREATE TABLE lecteur (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nom VARCHAR(64) NOT NULL,
    prenom VARCHAR(64) NOT NULL,
    naissance DATE NULL,
    PRIMARY KEY(Id)
)\p;

-- Rendu (O/N), Un livre est emprunté par un et un seul lecteur. Un emprunt concerne 1 et seul livre.
CREATE TABLE emprunt (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    date_debut DATE NOT NULL,
    date_fin DATE NOT NULL,
    rendu BOOLEAN NOT NULL,
    id_lecteur INT UNSIGNED NOT NULL,
    id_livre int UNSIGNED NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(id_lecteur) REFERENCES lecteur(id),
    FOREIGN KEY(id_livre) REFERENCES livre(id)
)\p;

INSERT INTO theme (libelle)
VALUES('Programmation'),('Roman'),('Science-Fiction'),('Thriller'),('Policier')\p;

INSERT INTO auteur (nom, prenom, date_naissance, nationalite)
VALUES ('Fauteuil', 'Daniel', '1975-04-22', 'FR'),
('Dusquez', 'Nathalie', '1973-11-07', 'BE'),
('Charvet', 'Clement', '1967-03-14', 'FR'),
('Caulon', 'Fernand', '1980-05-11', 'BE'),
('Canne', 'Alice', '1985-02-12', 'BE')\p;

INSERT INTO livre (titre, isbn, langue, annee_publication, nombre_pages, nombre_exemplaires, date_achat, id_theme)
VALUES ('Le Grand Bouquin', 112233, 'FR', 1960, 500, 359, '1961-01-01', 1),
('Le pleind''pages', 221133, 'FR', 1998, 240, 120, '2013-10-05', 2),
('The edgy lord dealer', 982486, 'EN', 2015, 69, 1800, '2013-06-05', 4),
('Des cables et des disques', 344355, 'FR', 2018, 200, 760, '2019-07-21', 1),
('Osez DOS', 669754, 'FR', 2018, 350, 1200, '2019-09-19', 1)\p;

INSERT INTO lecteur (nom, prenom, naissance)
VALUES ('Delacroix', 'Gertrude', '1964-07-13'),
('Vaillant', 'Bertrand', '1972-03-21'),
('LeBrun', 'Jonathan', '1980-11-25'),
('Durif', 'Sylvestre', '1961-02-12'),
('Faure', 'Lina', '1990-01-19')\p;

INSERT INTO emprunt (date_debut, date_fin, rendu, id_lecteur, id_livre)
VALUES ('2022-01-01','2022-01-15', FALSE, 3, 1),
('2022-01-01','2022-01-15', FALSE, 1, 2),
('2022-01-01','2022-01-15', FALSE, 2, 3)\p;

INSERT INTO auteur_livre (id_auteur, id_livre)
VALUES (1, 1),
(2, 1),
(3, 2),
(4, 3),
(5, 4)\p;

SELECT * FROM livre;
SELECT * FROM theme;
SELECT * FROM auteur;
SELECT * FROM emprunt;
SELECT * FROM lecteur;
SELECT * FROM auteur_livre;