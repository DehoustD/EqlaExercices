public class Teacher extends Person {

// teacher >child> person
// - cursus
// - salary
// - studentArray
// method
// studentSuccesPercent (exemple : 50% des eleves ont réussis) 

    private String cursus;
    private float salary;
    private Student[] students;

    //private String[] studentArray;
    //private boolean[] studentWhoSucceed;

    public Teacher(String _name, int _age, float _height, float _weight, Animal _pet, String _cursus, float _salary, Student[] _students) {
        
        // on va chercher les propriété du parent.
        super(_name, _age, _height, _weight, _pet);
        // ----
        cursus = _cursus;
        salary = _salary;
        students = _students;
    }

//#region Getters
    public String GetCursus(){
        return cursus;
    }
    public float GetSalary(){
        return salary;
    }
    public Student[] GetStudents(){
        return students;
    }
//#endregion

//#region Setters
    public void SetCursus(String _cursus){
        cursus = _cursus;
    }
    public void SetSalary(float _salary){
        salary = _salary;
    }
    public void SetStudents(Student[] _students){
        students = _students;
    }
//#endregion

// methods


public void StudentWhoSucceedPercent(){

    float _succes = 0.0f;
    
    for (int i = 0; i < students.length; i++) {
        if(students[i].GetAverage() >= 10){
            _succes++;
        }
    }

    System.out.println(_succes + " succes");

    System.out.println(_succes + "/" + students.length + " * 100 = ");

    System.out.println(_succes / (float)students.length * 100.0f + "%");

}














}