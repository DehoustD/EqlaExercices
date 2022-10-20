/*
Exercice n°8 - WHERE sur une DATE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves nés après 1980: Le format de la date est année/Mois/Jour
Affichez les élèves nés avant 1990: Le format de la date est année/Mois/Jour
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Naissance > '1980/01/01';
SELECT * FROM Eleve WHERE Naissance < '1980/01/01';