/*
Exercice n°17 - MIN, MAX, SUM

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe
Si vous n'êtes pas dans la DB Ventes, tapez: use ventes;
Affichez le prix maximum des produits
Affichez le prix minimum des produits
Affichez le prix total de tous les produits
*/

USE ventes;

SELECT MAX(prix) FROM produit;
SELECT MIN(prix) FROM produit;
SELECT SUM(Stock) AS Total FROM produit;

SELECT * FROM produit WHERE Prix = (SELECT Max(Prix) FROM Produit);