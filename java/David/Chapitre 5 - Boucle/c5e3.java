import java.util.Scanner;

public class c5e3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String input2 = "";

        while (!input2.equals("y")) {
            System.out.println("Veuillez tapper sur la touche \"y\"");
            input2 = input.nextLine();
        }
        input.close();
    }
}