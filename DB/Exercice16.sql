/*
Exercice n°16 - AVG

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Reprenez la requête de la Exercice n°16.
Modifiez-la pour que l'on ait l'age moyen des élèves.
*/

USE BlindCode;

SELECT AVG(YEAR(CURDATE())-YEAR(Naissance)) AS Age FROM Eleve ORDER BY Age;
SELECT ROUND (AVG(YEAR(CURDATE())-YEAR(Naissance))) AS Age FROM Eleve ORDER BY Age;
SELECT FLOOR (AVG(YEAR(CURDATE())-YEAR(Naissance))) AS Age FROM Eleve ORDER BY Age;