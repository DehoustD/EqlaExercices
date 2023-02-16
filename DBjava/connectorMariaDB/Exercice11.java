import java.sql.*;

public class Exercice11 {
    public static void main(String[] args) {

        System.out.println("\n--- Display Themes ---\n");

        DisplayThemes();

        System.out.println("\n--- Display Auteurs ---\n");

        DisplayAuteurs();

        System.out.println("\n--- Display Auteur ---\n");

        DisplayAuteur(2);

        System.out.println("\n--- Display Exemplaire ---\n");

        DisplayExemplaire("RAYON-38", "neuf");

    }

    private static void DisplayThemes() {

        try (DB dataBase = new DB()) {

            Connection con = dataBase.getConnection();

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM theme";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("id") + "\t\t" + rs.getString("theme"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void DisplayAuteurs() {

        try (DB dataBase = new DB()) {

            Connection con = dataBase.getConnection();

            Statement stmt = con.createStatement();

            String query = "SELECT * FROM auteur LIMIT 10";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + "\t\t" +
                                rs.getString("nom") + "\t\t" +
                                rs.getString("prenom") + "\t\t" +
                                rs.getString("date_naissance") + "\t\t" +
                                rs.getString("nationalite"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void DisplayAuteur(int _id) {

        try (DB dataBase = new DB()) {

            Connection con = dataBase.getConnection();

            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM auteur WHERE id=?");
            pstmt.setInt(1, _id);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getString("id") + "\t\t" +
                    rs.getString("nom") + "\t\t" +
                    rs.getString("prenom") + "\t\t" +
                    rs.getString("date_naissance") + "\t\t" +
                    rs.getString("nationalite"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static void DisplayExemplaire(String _rayon, String _etat) {

        try (DB dataBase = new DB()) {

            Connection con = dataBase.getConnection();

            PreparedStatement pstmt = con.prepareStatement(
                "SELECT * " +
                "FROM exemplaire " +
                "INNER JOIN livre ON livre.id = exemplaire.livre_id " +
                "INNER JOIN auteur ON auteur.id = livre.auteur_id " +
                "WHERE rayon = ? AND etat = ?");

            pstmt.setString(1, _rayon);
            pstmt.setString(2, _etat );

            ResultSet rs = pstmt.executeQuery();

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

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}