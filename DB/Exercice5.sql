/*
Exercice n°5 - WHERE AND

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez tous les élèves de Sexe Masculin ET ayant comme CP 1348
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Sexe = 'M' AND CP = 1348;