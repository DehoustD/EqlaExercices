package common;

import java.util.Scanner;

public class userInput {

    static Scanner input = new Scanner(System.in);

    public static int AskYesOrNo(String _Question) {

        while (true) {

            System.out.print("\n" + _Question + "\nVotre Réponse : ");
            String _Responce = input.nextLine().toUpperCase();

            switch (_Responce) {
                case "O":
                    return 0;
                case "N":
                    return 1;
                default:
                    System.err.println("Erreur, votre réponse doit être \"o\" ou \"n\"");
                    continue;
            }
        }
    }
}