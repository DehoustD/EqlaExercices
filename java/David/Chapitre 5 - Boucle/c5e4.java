import java.util.Scanner;

public class c5e4 {

    static Scanner input = new Scanner(System.in);
    static int step = 0;
    static int mult = 1;

    public static void main(String[] args) {

        boolean isLooping = true;

        System.out.println(
                "Vous vous apprêtez à rentrer dans le rêve d'une personne, attention le temps sera ralenti si vous entre dedans.\nTapez \"go\" pour rentrer dans le rêve :");

        while (isLooping) {

            switch (CheckInput()) {
                case 1:
                    GoIn();
                    break;
                case 2:
                if (step > 0) {
                    GoOut();
                } else {
                    System.out.println("Vous êtes déjà revenu dans la réalité");
                }
                    break;
                case 3:
                    isLooping = false;
                    break;

                default:
                    break;
            }
        }
        if (step == 0) {
            System.out.println("Vous n'avez même pas osé rentrer dans le premier rêve");
        } else {
            System.out.println(
                    "Vous décidez de ne pas continuer votre chemin, votre voyage s'arrête là.\nLe temps était "
                            + mult
                            + " fois plus lent là où vous étiez\nC'était sûrement un bon choix de s'arrêter là.\nAttention, quand on stop la boucle, nous ne sommes pas sorti du rêve, le temps reste ralentit.\nEn sortirons-nous un jour ?");
        }
    }

    static int CheckInput() {
        String _r = input.nextLine();
        if (_r.equals("go")) {
            return 1;
        } else if (_r.equals("back")) {
            return 2;
        } else {
            return 3;
        }
    }

    static void GoIn() {
        //mult = mult * 2;
        mult *= 2;
        step++;

        System.out.println(
                "Bvvvzouit chplklklklk JDONG\nVous rentrez dans le rêve de la personne, vous êtes à l'étape "
                        + step + ", le temps se ralenti, il est maintenant " + mult
                        + " fois plus lent.\nVous êtes dans le rêve de la personne");
        int i = 1;
        while (i < step) {
            System.out.println("se trouvant dans le rêve de la personne");
            i++;
            try {
                Thread.sleep(mult * 100);
            } catch (Exception e) {
            }
        }
        System.out.println("qui se trouvait devant vous à la base.\n");
    }

    static void GoOut() {
        mult = mult / 2;
        step--;

        System.out.println(
                "Bvvvzouit chplklklklk JDONG\nVous rentrez dans le rêve de la personne, vous êtes à l'étape "
                        + step + ", le temps se ralenti, il est maintenant " + mult
                        + " fois plus lent.\nVous êtes dans le rêve de la personne");
        int i = 1;
        while (i < step) {
            System.out.println("se trouvant dans le rêve de la personne");
            i++;
            try {
                Thread.sleep(mult * 100);
            } catch (Exception e) {
            }
        }
        System.out.println("qui se trouvait devant vous à la base.\n");
    }
}
