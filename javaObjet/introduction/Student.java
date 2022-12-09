public class Student extends Person {
    
    private int studentNumber;
    private float average;
    private String favoriteSubject;

    public Student (String _name, int _age, float _height, float _weight, Animal _pet, int _studentNumber, float _average, String _favoriteSubject){

        // on va chercher les propriété du parent.
        super(_name, _age, _height, _weight, _pet);
        // ----
        studentNumber = _studentNumber;
        average = _average;
        favoriteSubject = _favoriteSubject;
    }

    //#region Getters 
    public int GetStudentNumber(){
        return studentNumber;
    }
    public float GetAverage(){
        return average;
    }
    public String getFavoriteSubject(){
        return favoriteSubject;
    }
    //#endregion
    //#region Setters 
    public void SetStudentNumber(int _studentNumber){
        studentNumber = _studentNumber;
    }
    public void SetAverage(float _average){
        average = _average;
    }
    public void SetFavoriteSubject(String _favoriteSubject){
        favoriteSubject = _favoriteSubject;
    }
    //#endregion


    public float AverageWeightPerYear(){
        return weight / (float)age;
    }

}
