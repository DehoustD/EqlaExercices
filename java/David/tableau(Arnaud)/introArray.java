import java.util.Scanner;

/**
 * introArray
 */
public class introArray {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        //Bonus

        String[] names = new String[0];
        //--------
        float[] scores = new float[0];
        Start(names,scores);
    }

    public static void Start(String[] _names, float[] _scores) {
        while(AskNewNote())
        {
            _scores = GrowFloatArray(_scores);
            //bonus
            _names = GrowStringArray(_names);
            //--------
            AddNewStudent(_names, _scores);
        }
        //bonus

        ShowStudentListAndScores(_scores, _names);

        //-----------
		
        CalculateAndShowAverage(_scores);
    }

    public static boolean AskNewNote() {
        String _validation;

        System.out.println("Do you want to add a student ? (y/n)");
        _validation = userInput.nextLine();

        if (_validation.toLowerCase().equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public static void AddNewStudent(String[]_names, float[]_scores) {
        String _newName;
        float _newScore;
        //bonus
        System.out.println("What's The name of the new Student ?");
        _newName = userInput.nextLine();
        //---------
        System.out.println("What's The score of " + _newName);
        _newScore = userInput.nextFloat();
        userInput.nextLine();
        //bonus
        _names[_names.length-1] = _newName;
        //---------
        _scores[_scores.length-1] = _newScore;
    }

    public static void CalculateAndShowAverage(float[] _scores)
    {
        float _average = 0;
        for (int i = 0; i < _scores.length; i++) {
            _average+=_scores[i];
        }
        System.out.println("The Average of the Classroom is : " + _average/_scores.length + ". Average was calculated over " + _scores.length + " students.");
    }
    
    public static float[] GrowFloatArray(float[] _arrayToGrow)
    {
        float[] _newArray = new float[_arrayToGrow.length+1];
        for (int i = 0; i < _arrayToGrow.length; i++) {
            _newArray[i] = _arrayToGrow[i];
        }
        return _newArray;
    }
    //Bonus    
    public static String[] GrowStringArray(String[] _arrayToGrow)
    {
        String[] _newArray = new String[_arrayToGrow.length+1];
        for (int i = 0; i < _arrayToGrow.length; i++) {
            _newArray[i] = _arrayToGrow[i];
        }
        return _newArray;
    }

    public static void ShowStudentListAndScores(float[] _scores, String[] _names)
    {
        for (int i = 0; i < _names.length; i++) {
            System.out.println("Student : " + _names[i] + " has a score of : " + _scores[i]);
        }
    }

    //---------------
}