import java.util.Scanner;

public class c5e5_correctionTableau {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float[] scores = new float[0];

        while (AskNewNotes()) {
            scores = GrowFloatArray(scores);

        }
    }

    // fonctions

    public static boolean AskNewNotes() {

        String _validation;
        System.out.println("note suivante ? [o/n]");

        _validation = input.nextLine();

        if (_validation.toLowerCase().equals("o")) {
            return true;
        } else {
            return false;
        }

    }

    public static float[] GrowFloatArray(float[] _arrayToGrow) {

        float[] _newArray = new float[_arrayToGrow.length + 1];

        for (int i = 0; i < _arrayToGrow.length; i++) {
            _newArray[i] = _arrayToGrow[i];
        }

        return _newArray;
    }
}
