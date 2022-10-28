import java.util.Scanner;

public class c5e2 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String responce = "";
        String wordToDetect = "bordel";

        System.out.println("veuillez entrez une phrase");
        responce = input.nextLine();       

        if (responce.contains(wordToDetect)) {

            System.out.println("bordel detecté");
            responce = responce.replace("bordel", "******");
            
        } else {

            System.out.println("Pas de gros mots détectés.");
            
        }

        System.out.println(responce);
        
    }

}