import java.util.Scanner;

public class guess {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int minimum = 0;
        int minimumNew = 0;

        int maximum = 0;
        int maximumNew = 0;

        int guess = 0;

        int clientResponce = 0;
        int tentative = 0;
        int error = 0;

        boolean loop = true;

        if (AskYesOrNo("Bonjour,\nnous allons jouer à un petit jeu !\nJe vais penser à un nombre, votre but est de le deviner en le moins d'essais possible, voulez-vous jouer ? (y/n)").equals("y")) {

            minimum = AskForNum("Alors c'est parti. Quelle est la valeur minimum à laquelle je peux penser ?");
            do {
                maximum = AskForNum("Ok, et quelle est la valeur maximum à laquelle je peux penser ?");
            } while (maximum <= minimum);

            do {
                guess = Rng(minimum, maximum);

                System.out.println("\n-temporaire- la réponse est : " + guess); // a degager

                minimumNew = minimum;
                maximumNew = maximum;

                clientResponce = AskForNum("Ok, je pense donc à un nombre entre " + minimum + " et " + maximum
                        + ", à votre avis, lequel ?");

                do {
                    tentative++;

                    if (clientResponce < minimumNew) {
                        clientResponce = AskForNum(
                                "Ne me prenez pas pour un idiot, cette valeur est trop petite pour entrer dans les bornes !\nRecommencez, je veux un nombre entre "
                                        + minimumNew + " et " + maximumNew + ":");
                        error++;
                        continue;
                    }

                    if (clientResponce > maximumNew) {
                        clientResponce = AskForNum(
                                "Ne me prenez pas pour un idiot, cette valeur est trop grande pour entrer dans les bornes !\nRecommencez, je veux un nombre entre "
                                        + minimumNew + " et " + maximumNew + ":");
                        error++;
                        continue;
                    }

                    if (clientResponce < guess) {
                        minimumNew = clientResponce;
                        clientResponce = AskForNum(
                                "C'est plus ! Vous cherchez donc un nombre entre " + minimumNew + " et "
                                        + maximumNew + ".");
                        continue;
                    }

                    if (clientResponce > guess) {
                        maximumNew = clientResponce;
                        clientResponce = AskForNum(
                                "C'est moins ! Vous cherchez donc un nombre entre " + minimumNew + " et "
                                        + maximumNew + ".");
                        continue;
                    }

                } while (clientResponce != guess);

                String playAgain = AskYesOrNo("Bravo, c'était la bonne réponse,\nvous avez mis " + tentative
                        + " essais à trouver et vous avez fait " + error
                        + " erreurs !\nVoulez-vous rejouer ? (y/n)");

                tentative = 0;
                error = 0;

                if (playAgain.equals("y")) {

                    int sameNum = 0;

                    while (!(sameNum == 1 || sameNum == 2)) {
                        sameNum = AskForNum("Voulez vous rejouer avec les même bornes (1) ou des nouvelles (2)");
                        switch (sameNum) {
                            case 1:

                                guess = -1;
                                clientResponce = -1;

                                break;
                            case 2:

                                minimum = AskForNum("Très bien, entrez la nouvelle borne inférieure :");
                                do {
                                    maximum = AskForNum("Quelle est la nouvelle borne supérieur :");
                                } while (maximum <= minimum);

                                guess = -1;
                                clientResponce = -1;

                                break;
                            default:
                                System.out.println("Erreur, veuillez tapper 1 ou 2");
                                break;
                        }
                    }

                } else {
                    System.out.println("Bonne journée et à bientôt.");
                    loop = false;
                }

            } while (loop);

        } else {
            System.out.println("\nBonne journée et à bientôt");
        }
    }

    static int AskForNum(String _q) {

        int _r = 0;

        System.out.print("\n" + _q + "\nVotre réponse : ");

        while (!(input.hasNextInt())) {
            System.out.println("\nErreur, votre réponse doit être un chiffre ou nombre entier (pas de virgule).");
            input.nextLine();
        }

        _r = input.nextInt();
        input.nextLine();
        return _r;
    }

    static String AskYesOrNo(String _q) {
        System.out.print("\n" + _q + "\nVotre réponse : ");
        String _r = input.nextLine();

        while (!(_r.equals("y") || _r.equals("n"))) {
            System.out.println("\nErreurs, votre réponse doit être \"y\" ou \"n\".");
            _r = input.nextLine();
        }

        return _r;
    }

    static int Rng(int _min, int _max) {
        return (int) (Math.random() * (_max - _min) + _min);
    }
}