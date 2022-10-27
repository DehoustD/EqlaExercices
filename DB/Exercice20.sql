/*
Exercice n°20 - GROUP BY

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Pays, tapez: use Pays;
Faites un DESC Pays, pour voir sa structure.
Affichez pour chaque continent, combien il a de pays. On n'utilisera qu'une seule table: Pays. Donc pour le continent à afficher on prendra le champ continent. (On fera mieux plus tard.)
*/

USE Pays;

SELECT Continent, COUNT(*) AS Nombre FROM Pays GROUP BY Continent;