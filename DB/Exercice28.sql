/*
Exercice n°28 - INSERT INTO

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Exercices, tapez: use Exercice27;
Ajouter l'équipe suivante:
NomClub: Royal Club d'Andenne
Localité: Andenne
Division: 2
Ajouter l'équipe suivante:
NomClub: Standard
Localité: Liège
Division: 3
Afficher toutes les équipes encodées à l'aide d'un SELECT.
*/

USE Exercice27;

INSERT INTO Equipe (NomClub, Localite, Division)
VALUES ('Royal Club d''Andenne', 'Andenne', 2),
('Standard','Liège',3);

SELECT * FROM Equipe;