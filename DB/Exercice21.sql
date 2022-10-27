/*
Exercice n°21 - GROUP BY
Allez dans le répertoire d'exercices SQL
Connectez-vous au SGBD MySQL: mysql -u root -p
Entrez votre mot de passe.
Si vous n'êtes pas dans la DB BlindCode2, tapez: use BlindCode2;
Expliquez ce que fait cette commande SQL:
*/
SELECT YEAR(DateInscription) As 'Annee Inscription', COUNT(DateInscription)
FROM EleveClasse
group by YEAR(DateInscription);
/*
Pourquoi avoir utilisé la Fonction YEAR ? Pour vous aider, comparez sans le YEAR:
*/
SELECT DateInscription As 'Annee Inscription', COUNT(DateInscription)
FROM EleveClasse
group by DateInscription;
/*
Réponse :

L'utilisation du YEAR compacte les informations par année,
la solution dépourvue de YEAR est plus précise.

*/