import java.util.Scanner;

public class uInput {

    public static Scanner uInput = new Scanner(System.in);

    // public int Askint(String _question, int rangeMin, int rangeMax){
    //     System.out.println(_question + "\nVotre réponse : ");
    //     return uInput.nextInt();
    // }

    // public int Askint(String _question){
    //     System.out.println(_question + " [1 = oui , 2 = non]\nVotre réponse : ");
    //     return uInput.nextInt();
    // }

    public boolean AskYesOrNo(String _question){
        System.out.println(_question + " [1 = oui , 2 = non]\nVotre réponse : ");

        int reponse = uInput.nextInt();

        if (reponse == 1) {

            return true;
            
        } else {

            return false;
            
        }

    }
    
}
