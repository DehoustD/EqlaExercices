/*
Exercice n°4 - Notre premier WHERE

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez tous les élèves de sexe Féminin.
Affichez tous les élèves de sexe Masculin.
Affichez Le nom, le prénom, la localite des élèves qui habitent sur le CP 6890.
*/

USE BlinCode;
SELECT * FROM Eleve WHERE Sexe = 'F';
SELECT * FROM Eleve WHERE Sexe = 'M';
SELECT Nom, Prenom, Localite, FROM Eleve WHERE CP = 6890;