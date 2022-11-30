package common;

import java.util.Scanner;

public class userInput {

    static Scanner uInput = new Scanner(System.in);

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

    public static float AskFloat(String _Question) {
        float _Responce = 0.0f;
        while (true) {
            System.out.print("\n" + _Question + "\nVotre Réponse : ");

            if (uInput.hasNextFloat()) {
                _Responce = uInput.nextFloat();
                uInput.nextLine();
                return _Responce;
            } else {
                System.err.println("Erreur, veuillez entrer un chiffre.");
                uInput.nextLine();
            }
        }
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

    public static String AskString(String _Question) {

        System.out.println("\n" + _Question + "\nVotre Réponse : ");
    
        return uInput.nextLine();
    
    }

}