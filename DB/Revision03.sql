-- Exercice 1 - DB Pays

-- Afficher la colonne name nommée Nom à l'affichage de la table Pays où les pays ont un nom commençant par 'u';
-- Reprenez la requête précédente et classer par ordre décroissant les noms de pays.

-- Maintenant par ordre croissant.
-- Affichez les pays dont le nom se terminent par %ca';
-- Affichez le nombre de pays de la précédente requête.
-- Affichez les pays qui commencent par 'e' et qui se terminent par 'a' et enfin qui contiennent un 't'. Vous utiliserez 3 LIKE;
-- Même chose mais vous n'utiliserez qu'un seul LIKE.
-- Compter le nombre total de pays.
-- Affichez les pays dont l'Id_Pays est compris entre 20 et 43;
-- Idem mais trouvez une autre méthode pour faire votre condition.
-- Affichez les noms de pays où l'Id_Pays est inférieur à 48 ou supérieur à 125.
-- Affichez les noms de pays où le code pays est compris dans cette liste de valeurs: BE, FR, LU, NL.


USE Pays;

SELECT name AS Nom
FROM Pays
WHERE name LIKE 'u%'
ORDER BY Nom ASC
;