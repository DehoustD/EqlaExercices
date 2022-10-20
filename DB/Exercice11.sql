/*
Exercice n°11 - WHERE avec LIKE 'quelquechose%' = commence par 'quelquechose'

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les élèves qui n'ont pas une adresse de type gmail.com
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Email NOT LIKE '%gmail.com';