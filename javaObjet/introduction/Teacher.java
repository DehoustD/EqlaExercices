public class Teacher extends Person {

// teacher >child> person
// - cursus
// - salary
// - studentArray
// method
// studentSuccesPercent (exemple : 50% des eleves ont réussis) 

    private String cursus;
    private float salary;
    private String[] studentArray;
    private boolean[] studentWhoSucceed;

    public Teacher(String _name, int _age, float _height, float _weight, Animal _pet, String _cursus, float _salary, String[] _studentArray, boolean[] _studentWhoSucceed) {
        
        // on va chercher les propriété du parent.
        super(_name, _age, _height, _weight, _pet);
        // ----
        cursus = _cursus;
        salary = _salary;
        studentArray = _studentArray;
        studentWhoSucceed = _studentWhoSucceed;
    }

//#region Getters
    public String GetCursus(){
        return cursus;
    }
    public float GetSalary(){
        return salary;
    }
    public String[] GetStudentArray(){
        return studentArray;
    }
    public boolean[] GetStudentWhoSucceed(){
        return studentWhoSucceed;
    }
//#endregion

//#region Setters
    public void SetCursus(String _cursus){
        cursus = _cursus;
    }
    public void SetSalary(float _salary){
        salary = _salary;
    }
    public void SetStudentArray(String _studentArray[]){
        studentArray = _studentArray;
    }
    public void SetStudentWhoSucceed(boolean[] _studentWhoSucceed){
        studentWhoSucceed = _studentWhoSucceed;
    }
//#endregion

// methods

public void StudentWhoSucceedPercent(){

    int _succes = 0;
    
    for (int i = 0; i < studentArray.length; i++) {
        if(studentWhoSucceed[i] = true){
            _succes++;
        }
    }

    System.out.println(_succes + " succes");

    System.out.println(_succes / studentArray.length * 100 + "%");

}














}