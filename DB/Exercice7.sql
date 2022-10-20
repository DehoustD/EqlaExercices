/*
Exercice n°7 - WHERE AND

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves dont le code postal est dans les 7000
*/

USE BlinCode;
SELECT * FROM Eleve WHERE CP BETWEEN 7000 AND 7999;