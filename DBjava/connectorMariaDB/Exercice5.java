import java.sql.*;

public class Exercice5 {
    public static void main(String[] args) {
        
        DisplayAuteurs();

    }

    private static void DisplayThemes(){

        try {
            // Chargement du pilote JDBC pour MySQL
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            
            // Etablissement de la connexion
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/biblio4_prof", "new_user", "password1");
            
            // Création d'un objet Statement pour exécuter une requête de lecture
            Statement stmt = con.createStatement();

            // Exécution d'une requête de lecture
            // et récupération du résultat dans un objet ResultSet
            String query = "SELECT * FROM theme";
            ResultSet rs = stmt.executeQuery(query);
            
            // Parcours du résultat
            while (rs.next()) {
                System.out.println(rs.getString("id") + "\t\t" + rs.getString("theme"));
            }

            // Fermeture de la connexion
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void DisplayAuteurs(){

        try {
            // Chargement du pilote JDBC pour MySQL
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            
            // Etablissement de la connexion
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/biblio4_prof", "new_user", "password1");
            
            // Création d'un objet Statement pour exécuter une requête de lecture
            Statement stmt = con.createStatement();

            // Exécution d'une requête de lecture
            // et récupération du résultat dans un objet ResultSet
            String query = "SELECT * FROM auteur";
            ResultSet rs = stmt.executeQuery(query);
            
            // Parcours du résultat
            while (rs.next()) {
                System.out.println(
                    rs.getString("id") + "\t\t" +
                    rs.getString("nom") + "\t\t" +
                    rs.getString("prenom") + "\t\t" +
                    rs.getString("date_naissance") + "\t\t" +
                    rs.getString("nationalite")                    
                    );
            }

            // Fermeture de la connexion
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}