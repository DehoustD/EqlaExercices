import java.util.Scanner;

public class c8e3 {

    static Scanner uInput = new Scanner(System.in);

    public static void main(String[] args) {

        // p minuscule désigne "player".

        String[] pNames = { "Plumya", "NavyJenkins", "Lolman", "Kermit", "SpherEater" };
        int[] pScores = { 750, 600, 450, 370, 200 };

        int currentMinIndex = 0;
        int currentMaxIndex = 4;

        String pName = AskString("Entrez votre nom / pseudo");
        int pScore = AskInt("Entrez votre score.");

        // On determine la position du score dans le tableau.
        int newScorePosition = DefineNewScorePosition(pScores, pScore);

        // temp
        System.out.println(newScorePosition + "\n");

        pNames = ArrayAddPlayerAtCorrectPosition(pNames, pName, newScorePosition);
        pScores = ArrayAddScoreAtCorrectPosition(pScores, pScore, newScorePosition);

        // On affiche les noms et les scores des joueurs en renseignant un index minimum et maximum.
        ShowScoresTable(pScores, pNames, currentMinIndex, currentMaxIndex);

    }

    public static void ShowScoresTable(int[] _scores, String[] _pNames, int _minIndex, int _MaxIndex) {

        for (int i = _minIndex; i <= _MaxIndex; i++) {

            System.out.println(_pNames[i] + " : " + _scores[i]);

        }

    }

    public static int AskInt(String _Question) {

        int _Responce = 0;

        while (true) {

            System.out.print("\n" + _Question + "\nVotre Réponse : ");

            if (uInput.hasNextInt()) {

                _Responce = uInput.nextInt();

                uInput.nextLine();

                return _Responce;

            } else {

                System.err.println("Erreur, veuillez entrer un chiffre.");

                uInput.nextLine();

            }
        }
    }

    public static String AskString(String _Question) {

        System.out.println("\n" + _Question + "\nVotre Réponse : ");

        return uInput.nextLine();

    }

    public static int DefineNewScorePosition(int[] _pScores, int _pScore) {

        for (int i = 0; i < _pScores.length; i++) {

            if (_pScore > _pScores[i]) {

                return i;

            }

        }

        return _pScores.length;

    }

    public static int[] ArrayAddScoreAtCorrectPosition(int[] _array, int _valueToAdd, int _position) {

        int[] _newArray = new int[_array.length + 1];

        for (int i = 0; i < _newArray.length - 1; i++) {

            if (i < _position) {

                _newArray[i] = _array[i];

            } else if (i == _position) {

                _newArray[i] = _valueToAdd;

            } else {

                _newArray[i] = _array[i - 1];

            }

        }

        return _newArray;

    }

    public static String[] ArrayAddPlayerAtCorrectPosition(String[] _array, String _valueToAdd, int _position) {

        String[] _newArray = new String[_array.length + 1];

        for (int i = 0; i < _newArray.length - 1; i++) {

            if (i < _position) {

                _newArray[i] = _array[i];

            } else if (i == _position) {

                _newArray[i] = _valueToAdd;

            } else {

                _newArray[i] = _array[i - 1];

            }

        }

        return _newArray;

    }

}