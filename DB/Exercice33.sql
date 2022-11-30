/*
Exercice n°32 - UPDATE

Supprimer les enregistrements qui respectent la condition suivante:
    - Les personnes nées avant le 1er janvier 1991 et nées après le 31 décembre 1979.
    - Les personnes Dont le nom de famille commence par M ou le prénom se termine par e.
Supprimer tous les enregistrements dont l'IdJoueur est supérieur à 3.
*/

USE Exercice27;

DELETE FROM Joueur; /* sert a effacer toute les entrées */
ALTER TABLE Joueur AUTO_INCREMENT = 1; /* sert a remettre le compteur AUTO_INCREMENT à 0 */

insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Irène', 'Link', '1974-11-26', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Andréanne', 'Kempstone', '1999-12-23', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mà', 'Keech', '1985-10-28', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Lèi', 'Blindmann', '2000-05-24', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Intéressant', 'Antcliff', '1993-09-20', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mélinda', 'Astlett', '1989-01-02', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Bénédicte', 'Kelbie', '1991-07-18', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Cinéma', 'Hugonneau', '1994-12-02', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Lén', 'Harteley', '1971-06-21', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mélodie', 'Yanin', '1990-06-07', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mélia', 'Joontjes', '1995-02-08', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Noémie', 'Cowherd', '1975-05-09', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Méryl', 'Olorenshaw', '1983-06-05', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Léana', 'Kilbourn', '1978-03-21', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mélina', 'Rodrigo', '1993-04-09', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Méryl', 'Fairley', '1982-04-29', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Lóng', 'Mehew', '1976-05-21', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Maëlys', 'Masser', '1999-05-05', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Gösta', 'Elgar', '1977-03-14', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Dorothée', 'Collie', '1977-11-11', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Maïly', 'Purtell', '1994-01-06', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Gwenaëlle', 'Espinet', '1996-03-12', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Maïlis', 'Kennefick', '1995-08-22', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Thérèse', 'Leads', '1999-12-15', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Amélie', 'Lehrian', '2000-02-10', 1);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Céline', 'Czajkowski', '2001-03-20', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Mélinda', 'Pedican', '1995-05-04', 2);
insert into Joueur (Prenom, Nom, DateNaissance, IdEquipe) values ('Lauréna', 'McGiffin', '1982-06-25', 1);

DELETE FROM Joueur
WHERE DateNaissance > '1979-12-31' AND DateNaissance < '1991-01-01' OR Nom LIKE 'M%' OR Nom LIKE '%e' OR IdJoueur > 3
;

SELECT *
FROM Joueur
;