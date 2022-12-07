public class Person {

    // Propriétés

    private String name;
    private int age;
    private float height;
    private float weight;
    private float imc;

    // Méthodes > Constructeur

    public Person(String _name, int _age, float _height, float _weight) {

        name = _name;
        age = _age;
        height = _height;
        weight = _weight;
        imc = IMCCalculation(_height, _weight);

    }

    // faire les getters et les setters, attention ! le poid doit etre ou en kg, ou en lbs

    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
    public float GetHeight(String _dataUnit){
        if(_dataUnit.equals("m")){
            return height;
        } else if(_dataUnit.equals("cm")){
            return height*100;
        }
        return height; // default
    }
    public float GetWeight(String _dataUnit){
        if(_dataUnit.equals("kg")){
            return weight;
        } else if(_dataUnit.equals("lbs")){
            return weight * 2.20462f;
        }
        return weight; // default
    }
    public float GetImc(){
        return imc;
    }

    public void SetName(String _name){
        name = _name;
    }
    public void SetAge(String _age){
        name = _age;
    }
    public void SetHeight(float _newHeight){
        height = _newHeight;
        imc = IMCCalculation(height, weight);
    }
    public void SetWeight(float _weight){
        weight = _weight;
    }

    private float IMCCalculation(float _height, float _weight) {
        return _weight / (float) Math.pow(_height, 2);
    }

    public static void main(String[] args) {

        Person johnny = new Person("Johnny", 45, 1.82f, 80.0f);
        Person sebastien = new Person("Sebastien", 40, 1.85f, 85.0f);
        Person bruno = new Person("Bruno", 43, 1.75f, 80.0f);
        Person simon = new Person("Simon", 25, 1.65f, 70.0f);
        Person david = new Person("David", 34, 1.82f, 100.0f);

        // System.out.println("Nom : " + johnny.name + ", age : " + johnny.age + ", taille : " + johnny.height + ", IMC : " + johnny.imc);
        // System.out.println("Nom : " + sebastien.name + ", age : " + sebastien.age + ", taille : " + sebastien.height + ", IMC : " + sebastien.imc);
        // System.out.println("Nom : " + bruno.name + ", age : " + bruno.age + ", taille : " + bruno.height + ", IMC : " + bruno.imc);
        // System.out.println("Nom : " + simon.name + ", age : " + simon.age + ", taille : " + simon.height + ", IMC : " + simon.imc);
        // System.out.println("Nom : " + david.name + ", age : " + david.age + ", taille : " + david.height + ", IMC : " + david.imc);

        System.out.println(johnny.GetImc());
        johnny.SetHeight(1.95f);
        System.out.println(johnny.GetImc());

    }

}