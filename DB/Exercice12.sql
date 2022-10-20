/*
Exercice n°12 - WHERE avec LIKE '%quelquechose%' = contient 'quelquechose'

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves dont le nom commence par 'be'
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Nom LIKE '%s%';