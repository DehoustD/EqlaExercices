import java.util.Scanner;

public class c8e2 {

    static Scanner uInput = new Scanner(System.in);
    public static void main(String[] args) {

        int noteMax = 10;
        String newNote = "";
        float[] notes = {};

        System.out.println("Bonjour, veuillez spécifier votre note maximale");
        noteMax = uInput.nextInt();
        uInput.nextLine();

        do {

            newNote = AskNote("Veuillez entrez une note (tapez stop pour terminer)");

            if (CheckIfNumeric(newNote)) {

                float newNoteParsed = Float.parseFloat(newNote);

                if (newNoteParsed < 0 || newNoteParsed > noteMax) {

                    System.out.println("Votre note doit être supérieure à 0 et inférieure à la note maximale (" + noteMax + ").");

                } else {

                    System.out.println("Vous avez entré " + newNoteParsed + "/" + noteMax + ".\n");

                    notes = ArrayAdd(notes, newNoteParsed);

                    ShowArrayFloat(notes);

                }

            } else if (!(newNote.toUpperCase().equals("STOP"))) {

                System.out.println("Erreur, veuillez entrer un chiffre ou nombre en guise de note.");

            }

        } while (!(newNote.toUpperCase().equals("STOP")));

        if (CalculAverage(notes, noteMax) >= 80) {

            System.out.println("Le contrôle est réussis.");

        } else {

            System.out.println("le contrôle doit être annulé.");

        }

        System.out.println("\nAu revoir.");

    }

    public static String AskNote(String _question){

        System.out.println(_question);

        String _responce = uInput.nextLine();

        return _responce;

    }

    public static boolean CheckIfNumeric(String _string){

        try {

            Float.parseFloat(_string);

            return true;

        } catch (Exception e) {

            return false;

        }

    }

    public static float[] ArrayAdd(float[] _array, float _valueToAdd){

        float[] _newArray = new float[_array.length + 1];

        if (_array.length > 0) {

            for (int i = 0; i < _newArray.length - 1; i++) {

                _newArray[i] = _array[i];

            }

            _newArray[_newArray.length - 1] = _valueToAdd;

        } else {

            _newArray[0] = _valueToAdd;

        }

        return _newArray;

    }

    public static void ShowArrayFloat(float[] _array){

        for (int i = 0; i < _array.length; i++) {

            System.out.println(_array[i]);

        }

    }

    public static float CalculAverage(float[] _array, int _noteMax) {

        float _sum = 0.0f;
        float _percent = 0.0f;

        for (int i = 0; i < _array.length; i++) {

            _sum += _array[i];
            // équivalent de : _sum = _sum + _array[i];

        }

        _percent = (_sum / _array.length) / _noteMax * 100;

        System.out.println(_percent + "%");

        return _percent;

    }

}