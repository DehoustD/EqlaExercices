import java.util.Scanner;

public class c8e1 {

    static Scanner uInput = new Scanner(System.in);

    public static void main(String[] args) {

        String[] film = { "Jurassic Park", "Seigneur des Anneaux", "La Ligne Verte", "Les Simpsons : Le Film", "Old Boy" };

        ShowArray(film);

        while (AskYesOrNo("Voulez vous intervertir deux film ?")) {

            int position1 = AskInt("position une ?") - 1;
            int position2 = AskInt("position deux ?") - 1;

            String temp = film[position1];
            film[position1] = film[position2];
            film[position2] = temp;

            System.out.println("");

            ShowArray(film);

        }

    }

    public static void ShowArray(String[] _array){

        for (int i = 0; i < _array.length; i++) {
            System.out.println(_array[i]);
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

    public static boolean AskYesOrNo(String _Question) {

        String _Responce = "";
        
        while (true) {
            System.out.print("\n" + _Question + " (o/n)\nVotre Réponse : ");
            _Responce = uInput.nextLine().toUpperCase();

            switch (_Responce) {
                case "O":
                    return true;
                case "N":
                    return false;
                default:
                    System.err.println("Erreur, votre réponse doit être \"o\" ou \"n\"");
                    continue;
            }
        }
    }
}