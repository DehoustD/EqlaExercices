/*
Exercice n°25 - INNER JOIN

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.

Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;

Affichez le nom des différentes classes/formations et le nombre d'élèves dans chacune d'elle.
La colonne du nombre d'élèves s'appelera NBEleves.
Faites un tri descendant sur le nombre d'élèves.
*/

USE BlindCode;


SELECT Eleve.Nom, Classe.Nom
FROM Eleve
INNER JOIN Classe ON Eleve.IdClasse = Classe.IdClasse;


SELECT COUNT(Eleve.Nom) AS NBEleves, Classe.Nom
FROM Eleve
INNER JOIN Classe ON Eleve.IdClasse = Classe.IdClasse;
