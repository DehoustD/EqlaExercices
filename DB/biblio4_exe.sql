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

SELECT 'Afficher la liste des exemplaires empruntes par le lecteur ayant l''ID 1' AS Exercice_5;
-- On affichera le nom du lecteur, son prénom, le nom du livre, la date d'emprunt ainsi que la date retour.

SELECT nom, prenom, titre, date_emprunt, date_retour
FROM emprunt
INNER JOIN lecteur ON emprunt.lecteur_id = lecteur.id
INNER JOIN exemplaire ON emprunt.exemplaire_id = exemplaire.id
INNER JOIN livre ON exemplaire.livre_id = livre.id
WHERE emprunt.lecteur_id = 1
;

SELECT 'Idem mais affichez en plus le nom et le prenom de l''auteur.' AS Exercice_6;
-- Il faudra faire attention qu'on ne puisse pas hésiter à la lecture si ce sont les noms et prénoms des lecteurs/auteurs.

SELECT lecteur.nom AS nom_lecteur, lecteur.prenom AS prenom_lecteur, auteur.nom A
FROM emprunt
INNER JOIN lecteur ON emprunt.lecteur_id = lecteur.id
INNER JOIN exemplaire ON emprunt.exemplaire_id = exemplaire.id
INNER JOIN livre ON exemplaire.livre_id = livre.id
INNER JOIN auteur ON livre.auteur_id = auteur.id
WHERE emprunt.lecteur_id = 1
;

SELECT 'Afficher la liste des livres ayant un auteur né avant le 1er janvier 1980.' AS Exercice_7;



