/*
Exercice n°10 - WHERE avec LIKE '%quelquechose' = se termine par 'quelquechose'

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves qui ont une adresse de type gmail.com
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Email LIKE '%gmail.com';
SELECT * FROM Eleve WHERE Email NOT LIKE '%gmail.com';