import java.util.Scanner;

public class c8e4 {

    static Scanner uInput = new Scanner(System.in);

    public static void main(String[] args) {

        String[] topCuisine = {};
        final int top = 5;

        System.out.println("b'jour ! nous allons vous demander vos 5 plats préférés !");

        for (int i = 0; i < top ; i++) {

            String responce = AskString("Veuillez entrer le nom d'un plat !");

            topCuisine = ArrayAdd(topCuisine, responce);
            
        }

        System.out.println("Okay, voici donc votre top " + top + " !");

        ShowArray(topCuisine);

        System.out.println("\nNous allons afficher un top 3 maintenant");

        int elementToSupressId;

        for (int i = 0; i < 2; i++) {
            
            elementToSupressId = AskInt("Tapez le chiffre correspondant au plat 1 que vous ne désirez pas dans votre top " + (top - 2) + ".") - 1;

            topCuisine = ArrayClearID(topCuisine, elementToSupressId);

        }

        System.out.println("Voici donc votre top  " + (top - 2) + "!");

        ShowArray(topCuisine);

        System.out.println("----");

        ArrayClearEmptyId(topCuisine);

        ShowArray(topCuisine);
        
    }

    public static String AskString(String _Question) {

        System.out.println("\n" + _Question + "\nVotre Réponse : ");

        return uInput.nextLine();

    }

    public static int AskInt(String _Question) {
        int _Responce = 0;
        while (true) {
            System.out.print("\n" + _Question + "\nVotre Réponse : ");

            if (uInput.hasNextFloat()) {
                _Responce = uInput.nextInt();
                uInput.nextLine();
                return _Responce;
            } else {
                System.err.println("Erreur, veuillez entrer un chiffre.");
                uInput.nextLine();
            }
        }
    }

    public static void ShowArray (String[] _array){

        for (int i = 0; i < _array.length; i++) {
            
            System.out.println(_array[i]);

        }

    }

    public static String[] ArrayAdd(String[] _array, String _NewValue){

        String[] _newArray = new String[_array.length + 1];

        if (_array.length > 0) {

            for (int i = 0; i < _newArray.length - 1; i++) {

                _newArray[i] = _array[i];
                
            }
            
        }

        _newArray[_newArray.length - 1] = _NewValue;

        return _newArray;
    }

    public static String[] ArrayReduce(String[] _array){

        String[] _newArray = new String[_array.length - 1];

        for (int i = 0; i < _newArray.length; i++) {

            _newArray[i] = _array[i];
            
        }

        return _newArray;

    }

    public static String[] ArrayClearID(String[] _array, int _id){

        for (int i = 0; i < _array.length; i++) {
                
            if (i == _id) {

                _array[i] = null;
                
            }
            
        }

        return _array;

    }

    public static String[] ArrayClearEmptyId(String[] _array){

        int _nullCount = 0;

        String[] _newArray = {};

        for (int i = 0; i < _array.length - 1; i++) {

            if (_array[i] != null) {

                _newArray = ArrayAdd(_newArray, _array[i - _nullCount]);
                
            } else {

                _nullCount++;

            }
            
        }

        return _array;

    }

}