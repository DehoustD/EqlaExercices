import java.sql.*;

public class Auteur {

    private Integer id = null;
    private String nom = null;
    private String prenom = null;
    private Integer birthday = null;
    private String nationality = null;

    public Auteur(Integer _id, String _nom, String _prenom, Integer _birthday, String _nationality) {
        id = _id;
        nom = _nom;
        prenom = _prenom;
        birthday = _birthday;
        nationality = _nationality;
    }

    //#region Getters

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public String getNationality() {
        return nationality;
    }

    //#endregion Getters

    //#region Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //#endregion Setters


    @Override
    public String toString() {
        return
        "id : " + id +
        "\nnom : " + nom +
        "\nprenom : " + prenom +
        "\ndate de naissance : " + birthday +
        "\nnationalité : " + nationality
        ;
    }

    // Methods.



    public void updateAuteur (Auteur _auteur){



    }

}