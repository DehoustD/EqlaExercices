USE biblio4_prof;

-- SELECT titre, theme.theme
-- FROM livre
-- WHERE id <= 20
-- INNER JOIN theme ON livre.theme_id = theme.id
-- ;

-- erreur 1 : WHERE Après INNER JOIN
-- erreur 2 : préciser le "id"

SHOW TABLES;

DESC livre\p;
DESC lecteur\p;
DESC exemplaire\p;
DESC emprunt\p;

SELECT 'Afficher la liste de tous les livres avec leur titre et leur theme.' AS Exercice_1;

SELECT titre, theme.theme
FROM livre
INNER JOIN theme ON livre.theme_id = theme.id
WHERE livre.id <= 20
\p;

SELECT 'Combien d''exemplaires sont empruntes en ce moment ?' AS Exercice_2;

-- SELECT exemplaire.id, reference, emprunt.date_retour
-- FROM exemplaire
-- INNER JOIN emprunt ON exemplaire.id = emprunt.id
-- WHERE emprunt.date_retour IS NULL
-- ORDER BY exemplaire.id ASC
-- ;

SELECT count(*) AS nombreExemplaire 
FROM exemplaire
INNER JOIN emprunt ON exemplaire.id = emprunt.id
WHERE emprunt.date_retour IS NULL
ORDER BY exemplaire.id ASC
\p;

SELECT 'Quel est le lecteur qui a emprunte le plus de livres ?' AS Exercice_3;

-- SELECT nom, prenom, emprunt.lecteur_id
-- FROM lecteur
-- INNER JOIN emprunt ON
-- ;

SELECT lecteur.id, nom, prenom, count(*) AS nombreExemplaire
FROM lecteur
INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
GROUP BY lecteur.id
ORDER BY nombreExemplaire DESC
LIMIT 1 -- limiter au premier résultat dans le tableau
;

SELECT 'Quel est le livre qui a ete le plus emprunte ?' AS Exercice_4;

SELECT id, titre, count(*) AS nombreEmprunt
FROM livre

WHERE livre.id <= 20
GROUP BY titre
ORDER BY id ASC

;
