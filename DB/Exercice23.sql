/*
Exercice n°23 - INNER JOIN

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB Pays, tapez: use Pays;
Affichez le nom COMPLET du pays et le nom COMPLET du continent (pas l'acronyme) dont il fait partie.
*/

USE Pays;

SELECT Pays.full_name AS Nom, continent.name
FROM Pays
INNER JOIN continent ON continent.code = Pays.continent;