/*
Exercice n°30 - UPDATE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Exercices, tapez: use Exercice27.sql;
Mettre à jour le joueur où les champs sont les suivants:
Nom: Dupont
Prenom: Philip
Mettez la date de naissance à 25/12/1991 (attention au format de la date dans Mysql ;) )
Idéalement il serait plus propre de faire un WHERE sur l'id du joueur et non sur le nom et prénom.
*/

USE Exercice27;

DELETE FROM Joueur; /* sert a effacer toute les entrées */
ALTER TABLE Joueur AUTO_INCREMENT = 1; /* sert a remettre le compteur AUTO_INCREMENT à 0 */

INSERT INTO Joueur (Nom, Prenom, DateNaissance, IdEquipe)
VALUES ('Dehoust', 'David', '1988-05-02', 2),
('Colin', 'Pierre', '1984-07-22', 3),
('Jacques', 'Gabriel', '2014-08-22', 2),
('Dupont', 'Philip', '1991-12-13', 2);

SELECT Nom, Prenom, DateNaissance, Equipe.NomClub
FROM Joueur
INNER JOIN Equipe ON Joueur.IdEquipe = Equipe.IdEquipe;

UPDATE Joueur
SET DateNaissance = '1991-12-25'
WHERE IdJoueur = 4;

SELECT Nom, Prenom, DateNaissance AS Corrected_DateNaissance, Equipe.NomClub
FROM Joueur
INNER JOIN Equipe ON Joueur.IdEquipe = Equipe.IdEquipe;