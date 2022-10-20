import java.util.Scanner;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

/**
 * Projet
 */
public class Projet {

    static Scanner input=new Scanner(System.in);
        public static void main(String[] args) {
        enterGame();
    }
    public static boolean enterGame() {
        System.out.println("présentation du jeu. o/n");
        if (input.nextLine().equals("o")) {
            System.out.println("Alors, bienvenue!");
            return  true;
        }
        else {
            System.out.println("Alors, au-revoir!");
            return false;
            
        }
    }
    public static void question (String _question) {
System.out.println("my question");
String userAnswer=input.nextLine();
if (userAnswer.equals("answer")) {
    System.out.println("exact");
    
}
        
        
    }
}