/*
Exercice n°13 - WHERE AND OR

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB Localite, tapez: use Localite;
Affichez toutes les communes sur le code Postal 4280
Affichez toutes les communes sur le code Postal 4280 et dont la commune commence par 'b' ou par 'a'
Affichez les CP et les noms des communes de la Province de Liège: les CP sont compris entre 4000 et 4999
*/

USE Localite;
SELECT Commune FROM Localite WHERE CP = 4280;
SELECT Commune FROM Localite WHERE CP = 4280 AND (Commune LIKE 'B%' OR Commune LIKE 'A%');
SELECT Commune FROM Localite WHERE CP BETWEEN 4000 AND 4999;