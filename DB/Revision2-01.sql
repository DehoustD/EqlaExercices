DROP DATABASE IF EXISTS Biblio;
CREATE DATABASE Biblio;

USE Biblio;

CREATE TABLE Auteur (
    -- Un auteur peut avoir écrit 0 ou plusieurs livres.
    IdAuteur INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    DateNaissance DATE NULL,
    Nationalite VARCHAR(64) NULL,
    IdLivre INT UNSIGNED NOT NULL,
    PRIMARY KEY(IdAuteur)
);
CREATE TABLE Theme (
    -- Un thème porte sur 0 ou plusieurs livres.
    IdTheme INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Libelle VARCHAR(64) NOT NULL,
    PRIMARY KEY(IdTheme)
);
CREATE TABLE Emprunt (
    -- Rendu (O/N), Un livre est emprunté par un et un seul lecteur. Un emprunt concerne 1 et seul livre.
    IdEmprunt INT UNSIGNED NOT NULL AUTO_INCREMENT,
    DateDebut DATE NULL,
    DatFin DATE NULL,
    Rendu VARCHAR(1) NOT NULL,
    PRIMARY KEY(IdEmprunt)
);
CREATE TABLE Livre (
    -- Un livre est écrit par un seul auteur. Un livre porte sur un thème. Un livre peut être emprunté 0 ou plusieurs fois.
    IdLivre INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Titre VARCHAR(128) NOT NULL,
    ISBN INT UNSIGNED NOT NULL,
    Langue VARCHAR(32) NOT NULL,
    AnnéePublication INT UNSIGNED NULL,
    NombrePages INT UNSIGNED NULL,
    NombreExemplaires INT UNSIGNED NULL,
    DateAchat DATE NULL,
    IdTheme INT UNSIGNED NOT NULL,
    PRIMARY KEY(IdLivre),
    FOREIGN KEY(IdTheme) REFERENCES Theme(IdTheme)
);
CREATE TABLE Lecteur (
    -- Un lecteur a emprunté 0 ou plusieurs livres.
    IdLecteur INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(64) NOT NULL,
    Prenom VARCHAR(64) NOT NULL,
    Naissance DATE NULL,
    PRIMARY KEY(IdLecteur)
);

DESC Livre;