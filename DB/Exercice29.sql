/*
Exercice n°29 - INSERT INTO

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Exercices, tapez: use Exercice27.sql;
Ajouter le joueur suivant:
Nom: votre nom
Prenom: votre prenom
DateNaissance: votre date de naissance. (attention au format de la date dans Mysql ;) )
IdEquipe: l'IdEquipe correspondant à Standard.
Ajouter le joueur suivant:
Nom: Colin
Prenom: Pierre
DateNaissance: 22/07/1984
IdEquipe: l'IdEquipe correspondant à Andenne.
Ajouter le joueur suivant:
Nom: Jacques
Prenom: Gabriel
DateNaissance: 22/08/2014
IdEquipe: l'IdEquipe correspondant à Standard.
Ajouter le joueur suivant:
Nom: Dupont
Prenom: Philip
DateNaissance: 13/12/1991
IdEquipe: l'IdEquipe correspondant à Standard.
Affichez tous les champs des enregistrements de la table joueur.
Idem mais en plus affichez le nom du club (cfr INNER JOIN)
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