/*
Exercice n°19 - GROUP BY

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez pour chaque sexe, le nombre total. (Indice COUNT)
Affichez pour chaque nationalite, le nombre total.
*/

USE BlindCode;

SELECT Sexe, COUNT(*) AS Nombre FROM Eleve GROUP BY Sexe;
SELECT Nationalite, COUNT(*) AS Nombre FROM Eleve GROUP BY Nationalite;