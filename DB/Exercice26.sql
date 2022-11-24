/*
Exercice n°26 - CREATE DATABASE / CREATE TABLE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Créez une base de données nommée: Exercice26
Créer une Table Equipe. Cette table aura les champs suivants:
IdEquipe (clef primaire): Entier, non null, non signé, auto-incrémenté.
NomClub: chaîne de max 30 caractères, non null.
Localité: chaîne de max 30 caractères, non null.
Division: TINYINT non signé, non null.
*/

CREATE DATABASE Exercice26;

USE Exercice26;

CREATE TABLE Equipe (
    IdEquipe INT UNSIGNED NOT NULL AUTO_INCREMENT,
    NomClub VARCHAR(30) NOT NULL,
    Localite VARCHAR(30) NOT NULL,
    Division TINYINT UNSIGNED NOT NULL,
    PRIMARY KEY(IdEquipe)
);