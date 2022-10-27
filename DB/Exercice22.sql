/*
Exercice n°22 - INNER JOIN

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Pays, tapez: use Pays;
Affichez chaque pays et le nom du continent dont il fait partie.
Faites un tri ascendant sur le nom du pays.
Je vous conseille d'utiliser le mot clef AS après le nom du pays et après le nom du continent. Sinon vous allez avoir deux colonnes Name pour le pays et le continent. Ce qui n'est pas très pratique...
*/

USE Pays;

SELECT Pays.name AS Nom, continent.name
FROM Pays
INNER JOIN continent ON continent.code = Pays.continent
ORDER BY Pays.name ASC;