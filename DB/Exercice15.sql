/*
Exercice n°15 - ORDER BY

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB BlindCode, tapez: use BlindCode;
On va ici créer une colonne dynamiquement dans le résultat qu'on nommera Age. On utilisera le AS comme vu au cours dans la Exercice n°"champs calculés" Je vous demande d'afficher le prenom, nom et l'age des eleves. Pour cela, je vous rappelle que la fonction YEAR() permet de récupérer l'année d'une date et que CURDATE() donne la date du jour. Pour avoir l'age approximatif de l'élève on pourrait donc faire Année en cours(2022)-Année de naissance(ex:1974) AS Age
Reprenez la requête précédente et affichez les élèves du plus jeune au plus vieux.
Ensuite, du plus vieux au plus jeune.
Réécrivez vos deux requêtes pour ne traîter que des élèves de BlindCode4Data.
*/

USE BlindCode;

SELECT Nom, Prenom, AVG(YEAR(CURDATE())-YEAR(Naissance)) AS Age FROM Eleve; -- note du cours
SELECT Nom, Prenom, YEAR(CURDATE())-YEAR(Naissance) AS Age FROM Eleve;
SELECT Nom, Prenom, YEAR(CURDATE())-YEAR(Naissance) AS Age FROM Eleve ORDER BY Age;