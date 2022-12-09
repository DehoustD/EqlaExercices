// plug-in used : #region

public class Person {

    // Propriétés

    protected String name;
    protected int age;
    protected float height;
    protected float weight;
    protected float imc;
    protected Animal pet;

    // Méthodes > Constructeur

    public Person(String _name, int _age, float _height, float _weight, Animal _pet) {

        name = _name;
        age = _age;
        height = _height;
        weight = _weight;
        imc = IMCCalculation(_height, _weight);
        pet = _pet;

    }

    /* #region getter */
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
    public Animal GetAnimal(){
        return pet;
    }
    /* #endregion getter */
    /* #region setter */
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
    public void SetAnimal(Animal _pet){
        pet = _pet;
    }
    /* #endregion setter */
    
    // overide magique.

    @Override
    public String toString(){
        return name + " a " + age + ", il mesure " + height + " m et pèse " + weight + " kg, son imc est donc de " + GetImc() + " et il a un " + pet.GetEspece() + ".";
    }

    @Override
    public boolean equals(Object _p) {
        if (_p == null) {
            return false;
        }
        if (_p.getClass() != getClass()) {
            return false;
        }
        Person _person = (Person)_p;

        if(name.equals(_person.name) && age == _person.age && height == _person.height && weight == _person.weight && pet.equals(_person.pet)){
            return true;
        }
            return false;
    }


    private float IMCCalculation(float _height, float _weight) {
        return _weight / (float) Math.pow(_height, 2);
    }
}