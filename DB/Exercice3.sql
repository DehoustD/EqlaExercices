/*
Exercice n°3 - SELECT ch1, ch2, etc.

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez tous les enregistrements de la table Eleve avec les champs suivants: Nom, Prenom, Email
Affichez tous les enregistrements de la table Classe avec les champs: Nom, Lieux
*/

use BlinCode;
SELECT Nom, Prenom, Email FROM Eleve INTO OUTFILE 'toto.csv';