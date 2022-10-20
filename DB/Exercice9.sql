/*
Exercice n°9 - WHERE sur des DATES

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves nés entre 1970 ET 1980.
Affichez les élèves qui ne sont pas nés entre 1970 ET 1980.
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Naissance BETWEEN '1980/01/01' AND '1989/12/31';
SELECT * FROM Eleve WHERE Naissance > '1980/01/01' AND Naissance < '1989/12/31';