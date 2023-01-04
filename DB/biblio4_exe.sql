USE biblio4_prof;

SHOW TABLES;

DESC livre\p;
DESC lecteur\p;
DESC exemplaire\p;
DESC emprunt\p;

SELECT 'Afficher la liste de tous les livres avec leur titre et leur theme.' AS Exercice_1;

SELECT titre, theme.theme
FROM livre
INNER JOIN theme ON livre.theme_id = theme.id
LIMIT 20
\p;

SELECT 'Combien d''exemplaires sont empruntes en ce moment ?' AS Exercice_2;

SELECT count(*) AS nombreExemplaire 
FROM exemplaire
INNER JOIN emprunt ON exemplaire.id = emprunt.id
WHERE emprunt.date_retour IS NULL
ORDER BY exemplaire.id ASC
\p;

SELECT 'Quel est le lecteur qui a emprunte le plus de livres ?' AS Exercice_3;

SELECT lecteur.id, nom, prenom, count(*) AS nombreExemplaire
FROM lecteur
INNER JOIN emprunt ON lecteur.id = emprunt.lecteur_id
GROUP BY lecteur.id
ORDER BY nombreExemplaire DESC
LIMIT 1 -- limiter au premier résultat dans le tableau
;

SELECT 'Quel est le livre qui a ete le plus emprunte ?' AS Exercice_4;

SELECT livre.id, livre.titre, count(*) AS nombreEmprunt
FROM exemplaire
INNER JOIN livre ON exemplaire.livre_id = livre.id
INNER JOIN emprunt ON emprunt.exemplaire_id = exemplaire.id 
GROUP BY livre.id
ORDER BY nombreEmprunt DESC
LIMIT 1
;

SELECT 'Afficher la liste des exemplaires empruntés par le lecteur ayant l''ID 1' AS Exercice_5;
-- On affichera le nom du lecteur, son prénom, le nom du livre, la date d'emprunt ainsi que la date retour.

