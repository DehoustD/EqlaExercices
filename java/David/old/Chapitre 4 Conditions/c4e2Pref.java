import java.util.Scanner;

public class c4e2Pref {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int nbrToGuess = 5;

        System.out.println("Devine un nombre entre 1 et 10 !");

        if(guess() == nbrToGuess){
            System.out.println("correct");
        } else {
            System.out.println("incorrect, la réponse correct était " + nbrToGuess);
        }        
    }
    static int guess(){
        int _nbr = input.nextInt();
        return _nbr;
    }
}