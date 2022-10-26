/*
Exercice n°14 - ORDER BY

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
Affichez les champs: Prenom, Nom, Sexe, Naissance et triez dans l'ordre alphabétique sur le nom et puis le prenom.
Ensuite, triez dans l'ordre inverse le nom.
Triez les élèves du plus agé au plus jeune.
Ensuite, triez dans l'ordre inverse.
*/

USE BlindCode;

SELECT Nom, Prenom, Naissance, Sexe FROM Eleve ORDER BY Nom, Prenom;
SELECT Nom, Prenom, Naissance, Sexe FROM Eleve ORDER BY Nom, Prenom DESC;

/*
SELECT Commune FROM Localite WHERE CP = 4280;
SELECT Commune FROM Localite WHERE CP = 4280 AND (Commune LIKE 'B%' OR Commune LIKE 'A%');
SELECT Commune FROM Localite WHERE CP BETWEEN 4000 AND 4999;
*/