/*
Exercice n°27 - CREATE DATABASE / CREATE TABLE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Trouvez les commandes sql suivantes:
Si la base de données Exercice27 existe la supprimer.
Créez une base de données nommée: Exercice27
Créer la Table Joueur. Cette table aura les champs suivants:
IdJoueur (clef primaire): Entier, non null, non signé, auto-incrémenté.
Nom: chaîne de max 30 caractères, non null.
Prenom: Chaîne de max 30 caractères, non null.
DateNaissance: Date, non null.
IdEquipe (clef étrangère): entier non null, non signé, Référence IdEquipe de la table Equipe.
*/

DROP DATABASE IF EXISTS Exercice27;

CREATE DATABASE Exercice27;

USE Exercice27;

CREATE TABLE Equipe (
    IdEquipe INT UNSIGNED NOT NULL AUTO_INCREMENT,
    NomClub VARCHAR(30) NOT NULL,
    Localite VARCHAR(30) NOT NULL,
    Division TINYINT UNSIGNED NOT NULL,
    PRIMARY KEY(IdEquipe)
);

CREATE TABLE Joueur (
    IdJoueur INT UNSIGNED NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(30) NOT NULL,
    Prenom VARCHAR(30) NOT NULL,
    DateNaissance DATE NOT NULL,
    IdEquipe INT UNSIGNED NOT NULL,
    PRIMARY KEY(IdJoueur),
    FOREIGN KEY(IdEquipe) REFERENCES Equipe(IdEquipe)
);