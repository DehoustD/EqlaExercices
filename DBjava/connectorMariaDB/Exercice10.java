import java.sql.*;

public class Exercice10 {
    public static void main(String[] args) {

        Common();

    }

    private static void Common() {

        try {

            // Etablissement de la connexion
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/biblio4_prof", "new_user",
                    "password1");

            // Création d'un objet Statement pour exécuter une requête de lecture
            Statement stmt = con.createStatement();

            DisplayExemplaire(stmt, "'RAYON-38'","'neuf'");

            // Fermeture de la connexion
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void DisplayThemes(Statement _stmt) throws SQLException {

        // Exécution d'une requête de lecture
        // et récupération du résultat dans un objet ResultSet
        String query = "SELECT * FROM theme";
        ResultSet rs = _stmt.executeQuery(query);

        // Parcours du résultat
        while (rs.next()) {
            System.out.println(rs.getString("id") + "\t\t" + rs.getString("theme"));
        }

    }

    private static void DisplayAuteurs(Statement _stmt) throws SQLException {

        // Exécution d'une requête de lecture
        // et récupération du résultat dans un objet ResultSet
        String query = "SELECT * FROM auteur LIMIT 10";
        ResultSet rs = _stmt.executeQuery(query);

        // Parcours du résultat
        while (rs.next()) {
            System.out.println(
                rs.getString("id") + "\t\t" +
                rs.getString("nom") + "\t\t" +
                rs.getString("prenom") + "\t\t" +
                rs.getString("date_naissance") + "\t\t" +
                rs.getString("nationalite"));
        }

    }

    private static void DisplayAuteur(Statement _stmt, int _id) throws SQLException {

        // Exécution d'une requête de lecture
        // et récupération du résultat dans un objet ResultSet
        String query = "SELECT * FROM auteur WHERE id=" + _id;
        ResultSet rs = _stmt.executeQuery(query);

        // Parcours du résultat
        while (rs.next()) {
            System.out.println(
                rs.getString("id") + "\t\t" +
                rs.getString("nom") + "\t\t" +
                rs.getString("prenom") + "\t\t" +
                rs.getString("date_naissance") + "\t\t" +
                rs.getString("nationalite"));
        }

    }

    private static void DisplayExemplaire(Statement _stmt, String _rayon, String _etat) throws SQLException{

        // Exécution d'une requête de lecture
        // et récupération du résultat dans un objet ResultSet

        String query = "SELECT * FROM exemplaire INNER JOIN livre ON livre.id = exemplaire.livre_id INNER JOIN auteur ON auteur.id = livre.auteur_id WHERE rayon = 'RAYON-38' AND etat = 'neuf'";
        //String query = "SELECT * FROM Exemplaire WHERE rayon = " + _rayon + " AND etat = " + _etat;
        ResultSet rs = _stmt.executeQuery(query);

        // Parcours du résultat
        while (rs.next()) {
            System.out.println(
                rs.getString("livre.titre") + "\t\t\t" +
                rs.getString("auteur.prenom") + "\t\t" +
                rs.getString("auteur.nom") + "\t\t" +
                rs.getString("etat") + "\t\t" +
                rs.getString("livre_id") + "\t\t" +
                rs.getString("rayon") + "\t\t" +
                rs.getString("date_acquisition"));
        }

    }

}