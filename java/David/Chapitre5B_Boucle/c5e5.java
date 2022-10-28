import java.util.Scanner;

public class c5e5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("tappez une lettre.");

        int responce = input.nextLine().charAt(0);

        System.out.println(responce);

        input.close();        
    }
}