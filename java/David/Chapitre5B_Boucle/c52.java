import java.util.Scanner;

public class c52 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String responce = "";
        String wordToDetect = "bordel";

        System.out.println("veuillez entrez une phrase");

        responce = input.nextLine();

        int wordTiDetectIndex = responce.indexOf(wordToDetect);       

        if (responce.contains(wordToDetect)) {

            System.out.println("bordel detecté");

            System.out.println(wordTiDetectIndex);

            // il faut trouver comment remplacer le mot bordel dans la reponse par une censure.
            System.out.println(responce);
            
        } else {

            System.out.println("Pas de gros mots détectés.");
            
        }
        
    }

}