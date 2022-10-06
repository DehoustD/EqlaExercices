import java.util.Scanner;

public class c5e4_correction {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        int dreamStep = 0;
        int timeMult = 1;
        int millis = 200; // délais des différents Thread.sleep

        while (AskUserToEnterDream(millis, dreamStep, timeMult)) {
            dreamStep++;
            timeMult *= 2;
            ShowEnteringDreamResult(millis, dreamStep, timeMult);
        }
    }

    public static boolean AskUserToEnterDream(int _millis, int _dreamStep, int _timeMult) throws InterruptedException {

        Thread.sleep(_millis * _timeMult);
        System.out.print(
                "\nVous vous apprêtez à rentrer dans le rêve d'une personne, attention le temps sera ralenti si vous entrez dedans.\nTapez \"go\" pour rentrer dans le rêve : ");
        String _userAnswer = input.nextLine();
        Thread.sleep(_millis * _timeMult);
        if (_userAnswer.toLowerCase().equals("go")) {
            System.out.println("vous entrez rêve");
            return true;
        } else {
            System.out.println("Vous n'avez pas osé rentrer dans le rêve " + (_dreamStep + 1) + ".");
            return false;
        }
    }

    public static void ShowEnteringDreamResult(int _millis, int _dreamStep, int _timeMult) throws InterruptedException {

        Thread.sleep(_millis * _timeMult);
        System.out.println("Bvvvzouit chplklklklk JDONG");
        Thread.sleep(_millis * _timeMult);
        System.out.println("Vous rentrez dans le rêve de la personne, vous êtes à l'étape "
                + _dreamStep + ", le temps se ralenti, il est maintenant " + _timeMult
                + " fois plus lent.\nVous êtes dans le rêve de la personne");

        for (int i = 0; i < _dreamStep - 1; i++) {
            Thread.sleep(_millis * _timeMult);
            System.out.println("se trouvant dans le rêve de la personne");
        }
        Thread.sleep(_millis * _timeMult);
        System.out.println("qui se trouvait devant vous à la base.");
    }
}