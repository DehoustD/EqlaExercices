import java.util.Scanner;

public class c4e5PseudoLenght {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        String pseudo = input.nextLine();

        if(pseudo.equals("Kraktu")){
            System.out.println("Espèce de voleur de pseudo !");
        } else if(pseudo.equals("Zamboyle")){
            System.out.println("Johnny sort de ce corps !");
        } else if(pseudo.length() < 7){
            System.out.println("pseudo trop court");
        } else {
            System.out.println("votre pseudo est " + pseudo);
        }
    }
}