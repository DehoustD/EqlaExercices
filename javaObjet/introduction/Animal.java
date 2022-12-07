public class Animal {
    // Proprietes
private  String name;
private  String sex;
private  String food;
private  String ecosystem;
private  String espece;
    private  int age;
    private  int sleepHours;
    private boolean exotic;
    private  boolean sterelized;

// constructeur
public Animal (String _name, String _sex, String _food, String _ecosystem, String _espece, int _age, int _sleepHours, boolean _exotic, boolean _sterelized) {
name=_name;
    sex=_sex;
    food=_food;
    ecosystem=_ecosystem;
    espece=_espece;
    age=_age;
    sleepHours=_sleepHours;
    exotic=_exotic;
    sterelized=_sterelized;
}

// getters

    public String GetName() {
        return name;
    }

    public String GetSex() {
        return sex;
    }

    public String GetFood() {
        return food;
    }

    public String GetEcosystem() {
        return ecosystem;
    }

    public String GetEspece() {
        return espece;
    }

    public int GetAge() {
        return age;
    }

    public int GetSleepHours() {
        return sleepHours;
    }

    public boolean GetExotic() {
        return exotic;
    }
    public boolean GetSterelized() {
        return sterelized;
    }

    // setters;


    public void SetName(String name) {
        name = _name;
    }

    public void SetSex(String sex) {
        sex = _sex;
    }

    public void SetFood(String food) {
        food = _food;
    }

    public void SetEcosystem(String ecosystem) {
    ecosystem = _ecosystem;
    }

    public void SetEspece(String espece) {
        espece = _espece;
    }

    public void SetAge(int age) {
    age = _age;
    }

    public void SetSleepHours(int sleepHours) {
        sleepHours = _sleepHours;
    }

    public void SetExotic(boolean exotic) {
        exotic = _exotic;
    }

    public void SetSterelized(boolean sterelized) {
        sterelized = _sterelized;
    }

    // methodes

    private void Sleep (String _espece, int _sleepHours) {
        System.out.println("Votre " + _espece + " a besoin de " + _sleepHours + " heurs de sommeil.");
    }

    private void Eat (String  _sex, String _food) {
    switch (_sex) {
        case "m" :
            System.out.println("Il mange " + _food + ".");
        case "f" :
            System.out.println("Elle mange " + _food + ".");
        default :
            System.out.println("ça mange " + _food + ".");
    }


    }
    public static void main(String[] args) {
    Animal cat=New Animal("Cat", )
    }
}