import java.util.Scanner;

public class DD_vacationWork {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean looping = false;
        boolean firstTime = true;

        int max = 0;
        int shapeIndex = 0;

        do {
            if (firstTime) {
                max = AskIntInRange(
                        "\nBonjour,\nvous allez pouvoir choisir d'afficher certains patterns que je connais, j'en connais 6 au total.\nIls sont des représentations graphiques de suite de nombre.\nCela dit, pour fonctionner, j'ai besoin que vous me disiez jusqu'où je dois aller,\n\nentrez un nombre entre 3 et 10.",
                        3, 10);
                input.nextLine();

                shapeIndex = AskIntInRange(
                        "\nOk, quel pattern voulez vous exécuter ?\n\n1) Le rectangle\n2) Le triangle\n3) Le triangle inverse\n4) La pyramide\n5) La pyramide de nombre\n6) La pyramide de suite",
                        1, 6);
                input.nextLine();

                ShowPattern(shapeIndex, max);

                firstTime = false;

                looping = AskYN("\nVoulez vous recommencer ? (y/n) ");

            } else {

                if (AskYN("\nC'est reparti,\nvoulez vous changer la limite ? (y/n) ")) {
                    max = AskIntInRange("\nOk, jusque combien voulez vous aller cette fois (entre 3 et 10) ?", 3, 10);
                    input.nextLine();
                }
                shapeIndex = AskIntInRange(
                        "\nOk, quel pattern voulez vous exécuter ?\n\n1) Le rectangle\n2) Le triangle\n3) Le triangle inverse\n4) La pyramide\n5) La pyramide de nombre\n6) La pyramide de suite",
                        1, 6);
                input.nextLine();

                ShowPattern(shapeIndex, max);

                looping = AskYN("\nVoulez vous recommencer ? (y/n) ");
            }

        } while (looping);

        System.out.println("\nBonne journée !");
    }

    // affiche un texte en introduction, et retourne un int compris entre une valeur min et max.
    static int AskIntInRange(String _text, int _min, int _max) {

        System.out.println(_text);
        System.out.print("votre réponse : ");

        int _response;

        if (input.hasNextInt()) {
            _response = input.nextInt();
            if (_response >= _min && _response <= _max) {
                return _response;
            } else {
                input.nextLine();
                return AskIntInRange("\nERREUR,\nveuillez entrer un nombre entre " + _min + " et " + _max + ".", _min,
                        _max);
            }
        } else {
            input.nextLine();
            return AskIntInRange(
                    "\nERREUR :\nVous avez peut-être marqué votre réponse en lettre,\nveuillez entrer un nombre entre "
                            + _min + " et " + _max + ".",
                    _min, _max);
        }
    }

    // Pose une question, attend un oui ou un non.
    static boolean AskYN(String _question) {
        System.out.print(_question);
        String _response = input.nextLine().toUpperCase();
        switch (_response) {
            case "Y":
                return true;
            case "N":
                return false;
            default:
                System.out.println("Erreur :\nVotre réponse doit être y ou n,\n   y pour oui.\n   n pour non.\n");
                return AskYN(_question);
        }
    }

    // affiche un patern sous forme de String en fonction de la variable index.
    static void ShowPattern(int _index, int _max) {

        switch (_index) {
            case 1:
                System.out.println("\nVoici le pattern \"rectangle\" de 1 à " + _max + " :\n");
                CreateRectangle(_max);
                break;
            case 2:
                System.out.println("\nVoici le pattern : \"triangle\" de 1 à " + _max + " :\n");
                CreateTriangle(_max);
                break;
            case 3:
                System.out.println("\nVoici le pattern : \"triangle inverse\" de 1 à " + _max + " :\n");
                CreateTriangleInverse(_max);
                break;
            case 4:
                System.out.println("\nVoici le pattern : \"pyramide\" de 1 à " + _max + " :\n");
                CreatePyramide(_max);
                break;
            case 5:
                System.out.println("\nVoici le pattern : \"pyramide de nombre\" de 1 à " + _max + " :\n");
                CreatePyramideNbr(_max);
                break;
            case 6:
                System.out.println("\nVoici le pattern : \"pyramide de suite\" de 1 à " + _max + " :\n");
                CreatePyramideSuite(_max);
                break;
            default:
                System.out.println(
                        "\n\n ! ERREUR(dev) : static void ShowPattern(), index incorrect (1-6) != " + _index + "\n\n");
                break;
        }
    }


    // création des différents patterns
    static void CreateRectangle(int _max) {
        for (int vert = 0; vert < _max; vert++) {
            for (int hori = 0; hori < 10; hori++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void CreateTriangle(int _max) {
        for (int vert = 0; vert < _max; vert++) {
            for (int hori = 0; hori < (vert + 1); hori++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void CreateTriangleInverse(int _max) {
        for (int vert = 0; vert < _max; vert++) {
            for (int hori = 1; hori < (_max - vert); hori++) {
                System.out.print(" ");
            }
            for (int hori = 0; hori < (vert + 1); hori++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void CreatePyramide(int _max) {

        for (int vert = 0; vert < _max; vert++) {
            for (int hori = 1; hori < (_max - vert); hori++) {
                System.out.print(" ");
            }
            for (int hori = 0; hori < (vert + 1); hori++) {
                System.out.print("*");
            }
            for (int hori = 1; hori < (vert + 1); hori++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void CreatePyramideNbr(int _max) {
        for (int vert = 0; vert < _max; vert++) {
            for (int hori = 1; hori < (_max - vert); hori++) {
                System.out.print(" ");
            }
            for (int hori = 0; hori < (vert + 1); hori++) {
                System.out.print(vert + 1);
            }
            for (int hori = 1; hori < (vert + 1); hori++) {
                System.out.print(vert + 1);
            }
            System.out.print("\n");
        }
    }
    static void CreatePyramideSuite(int _max) {
        for (int vert = 0; vert < _max; vert++) {

            for (int hori = 1; hori < (_max - vert); hori++) {
                System.out.print(" ");
            }
            for (int hori = 0; hori < (vert + 1); hori++) {
                System.out.print((vert + 1) - hori);
            }
            for (int hori = 1; hori < (vert + 1); hori++) {
                System.out.print(hori + 1);
            }
            System.out.print("\n");
        }
    }
}