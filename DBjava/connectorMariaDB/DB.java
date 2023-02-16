import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB implements AutoCloseable {
    private String DB_URL = "jdbc:mariadb://localhost:3306/";
    private String USER = "new_user";
    private String PASS = "password1";
    private Connection con;

    //#region Constructeur par défaut: on se connecte à la base de données biblio4_prof
    public DB() {
        this("biblio4_prof");
    }
    //#endregion Constructeur par défaut: on se connecte à la base de données biblio4_prof

    //#region Constructeur pour une base de données quelconque
    public DB(String db_name) {
        try {
            DB_URL += db_name;
            con = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Impossible de se connecter à la base de données:" + e.getMessage());
        }
    }
    //#endregion Constructeur pour une base de données quelconque

    //#region Getters.

    public String getDB_URL() {
        return DB_URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS() {
        return PASS;
    }

    public Connection getConnection() {
        return con;
    }

    //#endregion Getters.

    @Override
    public void close() throws Exception {
        if (con != null) {
            con.close();
        }
    }

}