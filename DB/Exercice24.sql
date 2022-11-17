/*
Exercice n°24 - INNER JOIN

Ici, on va travailler sur trois tables.
La table Eleve, la table Classe et la table EleveClasse.
Analyser la description des tables pour comprendre comment les lier entre elles.
Pour connaître la description d'une table, on utilise la commande: DESC nomdelatable;
No stress, si vous n'y arrivez pas. On va le faire ensemble de toute manière ;)

Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB BlindCode2, tapez: use BlindCode2;
On va afficher le nom et prénom de l'élève, le nom de la classe et la date d'inscription.
*/

USE BlindCode2;

SELECT Eleve.nom, Classe.nom, DateInscription
FROM Eleve
INNER JOIN EleveClasse
ON Eleve.IdEleve = EleveClasse.IdEleve
INNER JOIN Classe
ON EleveClasse.IdClasse = Classe.IdClasse; 