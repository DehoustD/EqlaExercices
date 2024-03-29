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
    theme_id INT UNSIGNED NOT NULL,
    -- IdAuteur INT UNSIGNED NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(theme_id) REFERENCES theme(id)
)\p;

-- Un exemplaire correspond à 1 et 1 seul livre.
-- Un exemplaire a été emprunté aucune fois ou plusieurs fois.
CREATE TABLE exemplaire (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    reference INT NOT NULL,
    rayon VARCHAR(64) NOT NULL,
    date_acquisition DATE NULL,
    etat VARCHAR(64) NULL,
    est_perdu BOOLEAN NOT NULL,
    livre_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (livre_id) REFERENCES livre(id)
)\p;

CREATE TABLE auteur_livre (
    auteur_id INT UNSIGNED NOT NULL,
    livre_id INT UNSIGNED NOT NULL,
    PRIMARY KEY (auteur_id, livre_id),
    FOREIGN KEY (auteur_id) REFERENCES auteur(id),
    FOREIGN KEY (livre_id) REFERENCES livre(id)
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
    lecteur_id INT UNSIGNED NOT NULL,
    livre_id int UNSIGNED NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(lecteur_id) REFERENCES lecteur(id),
    FOREIGN KEY(livre_id) REFERENCES livre(id)
)\p;


INSERT INTO theme (libelle)
VALUES('Programmation'),('Roman'),('Science-Fiction'),('Thriller'),('Policier')\p;

INSERT INTO auteur (nom, prenom, date_naissance, nationalite)
VALUES ('Fauteuil', 'Daniel', '1975-04-22', 'FR'),
('Dusquez', 'Nathalie', '1973-11-07', 'BE'),
('Charvet', 'Clement', '1967-03-14', 'FR'),
('Caulon', 'Fernand', '1980-05-11', 'BE'),
('Canne', 'Alice', '1985-02-12', 'BE')\p;

INSERT INTO livre (titre, isbn, langue, annee_publication, nombre_pages, theme_id)
VALUES ('Le Grand Bouquin', 112233, 'FR', 1960, 500, 1),
('Le pleind''pages', 221133, 'FR', 1998, 240, 2),
('The edgy lord dealer', 982486, 'EN', 2015, 69, 4),
('Des cables et des disques', 344355, 'FR', 2018, 200, 1),
('Osez DOS', 669754, 'FR', 2018, 350, 1)\p;

INSERT INTO exemplaire (reference, rayon, date_acquisition, etat, est_perdu, livre_id)
VALUES (555, 1, '2000-01-01', 'bon', 0, 1),
(556, 1, '2000-01-01', 'bon', 0, 2)\p;

INSERT INTO lecteur (nom, prenom, naissance)
VALUES ('Delacroix', 'Gertrude', '1964-07-13'),
('Vaillant', 'Bertrand', '1972-03-21'),
('LeBrun', 'Jonathan', '1980-11-25'),
('Durif', 'Sylvestre', '1961-02-12'),
('Faure', 'Lina', '1990-01-19')\p;

INSERT INTO emprunt (date_debut, date_fin, rendu, lecteur_id, livre_id)
VALUES ('2022-01-01','2022-01-15', FALSE, 3, 1),
('2022-01-01','2022-01-15', FALSE, 1, 2),
('2022-01-01','2022-01-15', FALSE, 2, 3)\p;

INSERT INTO auteur_livre (auteur_id, livre_id)
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