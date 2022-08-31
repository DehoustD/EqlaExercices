import java.util.Scanner;

public class tabledemultiplication1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Bonjour, je vais vous afficher les tables de multiplication de *1 à *10. \n Entrez le chiffre avec lequel je dois commencer, celui avec lequel je dois terminer et le pas entre ces deux bornes.\n");
        boolean again = true;
        while (again) {
            int nbr1 = AskQuestion(
                    "Quelle est la première valeur à partir de laquelle je dois commencer à faire les tables de multiplication ?");
            int nbr2 = AskQuestion(
                    "Quelle est la dernière valeur avec laquelle je dois terminer de faire les tables de multiplications ?");
            int pas = IntervalChoice();
            int display = DisplayFunction();
            MultiplicationTable(nbr1, nbr2, pas, display);
            System.out.println("Souhaitez-vous recommencer ? [y/n]");
            String choice = input.nextLine();
            if (choice.equals("y")) {
                again = true;
                System.out.println("C'est reparti !");
            } else if (choice.equals("n")) {
                again = false;
                System.out.println("Au revoir");
            } else {
                System.out.println("Erreur");
            }
        }
    }

    static int AskQuestion(String _question) {
        System.out.println(_question);
        int choice = input.nextInt();
        if (choice < 1) {
            System.out.println("Erreur, veuillez réessayer.");
            AskQuestion(_question);
        } else if (choice > 10) {
            return 10;
        }
        return choice;
    }

    static int IntervalChoice() {
        System.out.println(
                "Quel est le pas entre chaque valeur ?\n entrez 1 pour tous les chiffres ;\n entrez 2 pour un chiffre sur deux ;\n entrez 3 pour un chiffre sur trois ;");
        int choice = input.nextInt();
        if (choice < 1 || choice > 3) {
            System.out.println("Erreur, veuillez recommencer.");
            IntervalChoice();
        }
        return choice;
    }

    static int DisplayFunction() {
        System.out.println(
                "Comment souhaitez-vous afficher les tables de multiplication ?\n Entrez 1 pour les afficher horizontalement ;\n entrez 2 pour les afficher verticalement ;");
        int choice = input.nextInt();
        input.nextLine();
        if (choice < 1 || choice > 2) {
            System.out.println("Erreur, veuillez recommencer.");
            DisplayFunction();

        } else {
            System.out.println("Voici le résultat :");
        }
        return choice;
    }

    static void MultiplicationTable(int nbr1, int nbr2, int pas, int display) {
        if (display == 1) {
            for (int i = nbr1; i <= nbr2; i = i + pas) {
                for (int j = 1; j <= 10; j++) {
                    if(j==nbr1){
                        System.out.print(+ (i * j));
                    } else {
                        System.out.print( " - " + i * j);
                    }
                    
                }
                System.out.print("\n");
            }
        } else if (display == 2) {
            for (int i = 1; i <= nbr2; i++) {
                for (int j = nbr1; j <= nbr2; j = j + pas) {
                    //if(j < nbr1 + pas){
                    if(j == nbr1){
                        System.out.print(j * i);
                    } else {
                        System.out.print("-" + j * i);
                    }
                }
                System.out.print("\n");
            }
        }
    }
}