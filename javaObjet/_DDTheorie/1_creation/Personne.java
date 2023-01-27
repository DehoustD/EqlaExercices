/**
 * Personne
 */
public class Personne {

    // Propriétés.

    protected String name;
    protected int age;

    // Méthodes > Constructeur

    public Personne(String _name, int _age) {

        name = _name;
        age = _age;

    }

    // Getters.

    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }

    // Setters.

    public void SetName(String _name){
        name = _name;
    }
    public void SetAge(String _age){
        name = _age;
    }

    // Overide magique.

    // toString.

    @Override
    public String toString(){
        return
        "\nNom : " + name +
        "\nAge : " + age
        ; 
    }

    @Override
    public boolean equals(Object _p) {

        // si l'objet renseigné en paramètre est null.
        if (_p == null) {
            return false;
        }

        
        if (_p.getClass() != getClass()) {
            return false;
        }
        Personne _personne = (Personne)_p;

        if(name.equals(_personne.name) && age == _personne.age){
            return true;
        }
            return false;
    }

}