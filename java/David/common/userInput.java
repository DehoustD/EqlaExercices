package common;

import java.util.Scanner;

public class userInput {

    static Scanner input = new Scanner(System.in);

    public static boolean AskYesOrNo(String _Question) {
        String _Responce = "";
        while (true) {
            System.out.print("\n" + _Question + " (o/n)\nVotre Réponse : ");
            _Responce = input.nextLine().toUpperCase();

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

            if (input.hasNextFloat()) {
                _Responce = input.nextFloat();
                input.nextLine();
                return _Responce;
            } else {
                System.err.println("Erreur, veuillez entrer un chiffre.");
                input.nextLine();
            }
        }
    }
}