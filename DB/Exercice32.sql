/*
Exercice n°32 - UPDATE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Exercices, tapez: use Exercice27.sql;
Suite à l'arrêt du club d'Andenne, les joueurs de ce club feront dérénavant partie du Standard.
Mettez à jour la table joueur en tenant compte de ce changement de club.
*/

USE Exercice27;

DELETE FROM Joueur; /* sert a effacer toute les entrées */
ALTER TABLE Joueur AUTO_INCREMENT = 1; /* sert a remettre le compteur AUTO_INCREMENT à 0 */

INSERT INTO Joueur (Nom, Prenom, DateNaissance, IdEquipe)
VALUES ('Dehoust', 'David', '1888-05-02', 2),
('Colin', 'Pierre', '1984-07-22', 3),
('Jacques', 'Gabriel', '2014-08-22', 2),
('Dupont', 'Philip', '1991-12-13', 2);

SELECT Nom, Prenom, DateNaissance, Equipe.NomClub
FROM Joueur
INNER JOIN Equipe ON Joueur.IdEquipe = Equipe.IdEquipe;

UPDATE Joueur
SET IdEquipe = 2
WHERE IdEquipe = 3;

SELECT Nom, Prenom, DateNaissance AS Corrected_DateNaissance, Equipe.NomClub
FROM Joueur
INNER JOIN Equipe ON Joueur.IdEquipe = Equipe.IdEquipe
ORDER BY Nom;