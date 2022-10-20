/*
Exercice n°6 - WHERE IS NULL IS NOT NULL

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez tous les élèves qui n'ont pas de numéro de téléphone: On utilisera IS NULL
A l'inverse, affciez les élèves qui ont un numéro de téléphone: On utilisera IS NOT NULL: On peut faire autrement, rappelez-le moi :)
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Tel IS NULL;
SELECT * FROM Eleve WHERE Tel IS NOT NULL;