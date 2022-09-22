import java.util.Scanner;

public class c5e4_correction {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int dreamStep = 0;
        int timeMult = 1;

        AskUserToEnterDream();
    }

    public static void AskUserToEnterDream() throws InterruptedException {

        Thread.sleep(1000);

        System.out.print(
                "\nVous vous apprêtez à rentrer dans le rêve d'une personne, attention le temps sera ralenti si vous entre dedans.\nTapez \"go\" pour rentrer dans le rêve : ");

        String _userAnswer = input.nextLine();

        Thread.sleep(1000);
        if (_userAnswer.toLowerCase().equals("go")) {
            System.out.println("vous entrez rêve");
        } else {
            System.out.println("Vous n'avez même pas osé rentrer dans le premier rêve");
        }
    }

    public static void ShowEnteringDreamResult(int _dreamStep, int _timeMult) throws InterruptedException {

        Thread.sleep(1000 * _timeMult);
        System.out.println("Bvvvzouit chplklklklk JDONG");
        Thread.sleep(1000 * _timeMult);
        System.out.println("Vous rentrez dans le rêve de la personne, vous êtes à l'étape "
        + _dreamStep + ", le temps se ralenti, il est maintenant " + _timeMult
        + " fois plus lent.\nVous êtes dans le rêve de la personne");
        
    }
}