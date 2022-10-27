/*
Exercice n°18 - GROUP BY

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB Ventes, tapez: use ventes;
Affichez pour chaque catégorie, son stock. (Indice utilisez aussi SUM)
*/

USE ventes;

SELECT SUM(Stock) AS Total FROM Produit GROUP BY Categorie;