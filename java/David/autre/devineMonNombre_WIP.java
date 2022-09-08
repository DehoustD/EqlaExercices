import java.util.Scanner;

public class devineMonNombre_WIP {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        int numberToGuess = CreateRandomNumber();

        System.out.println("Devine un chiffre entre 0 et 5 !");
        int numberTry = UserEnterANumber();

        for (int i = 0; i < 3; i++) {

            if(i > 0){
                gameTry(numberTry, numberToGuess);
                if (gameTry(numberTry, numberToGuess) == true){
                    break;
                }
                //gameTry(numberTry, numberToGuess);
                if(i <= 0){
                    System.out.println("Perdu ! c'était " + numberToGuess + " ;)");
                }
            }
        }
    }

    static int CreateRandomNumber(){
        int _random = (int)(Math.random() * 5 + 1);
        return _random;
    }

    static int UserEnterANumber(){
        int _nbr = input.nextInt();
        return _nbr;
    }

    static boolean gameTry(int _numberTry, int _numberToGuess){
        if (_numberTry == _numberToGuess){
            System.out.println("Bravo ! c'est bien ca :)");
            return true;
        } else {
            System.out.println("Nope, essaie encore !");
            return false;
        }
    }
}