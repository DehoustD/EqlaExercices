import java.util.Scanner;

public class c5e3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String responce = "";

        System.out.println("Tappez une phrase.");
        responce = input.nextLine();

        if (responce.equals("")) {

            responce = "Je suis un chat !";
            System.out.println("vous n'avez rien répondu, votre réponse sera : Je suis un chat !");
            
        }

        responce = responce.replace("j", "z");
        responce = responce.replace("J", "Z");
        responce = responce.replace("ch", "z");
        responce = responce.replace("Ch", "Z");

        System.out.println(responce);

        input.close();

    }
    
}
