import java.util.Scanner;
public class guess {

    static Scanner input = new Scanner(System.in);

    static int AskForNum(String _q)
    {
        System.out.println(_q);
        int _r = input.nextInt();
        input.nextLine();
        return _r;
    }

    static String AskYesOrNo(String _q)
    {
        System.out.println(_q);

        String _r = input.nextLine();
        if (_r.equals("y") || _r.equals("n"))
        {
            return _r;
        }
        else
        {
            System.out.println("erreurs !");
            return AskYesOrNo(_q);
        }
        
    }

    static int Rng (int _min, int _max)
    {
        return (int) (Math.random() * (_max - _min) + _min);
    }

    public static void main(String[] args) {

        int minimum = AskForNum("Alors c’est parti. Quelle est la valeur minimum à laquelle je peux penser ?");
        int maximum = AskForNum("Ok, et quelle est la valeur maximum à laquelle je peux penser ?");
        int guess = Rng(minimum, maximum);

        System.out.println(guess);// a degager

        int clientResponce = 0;
        int tentative = 0;
        int error = 0;
        boolean loop = true;

        clientResponce = AskForNum("Ok, je pense donc à un nombre entre " + minimum + " et " + maximum + ", à votre avis, lequel ?");

        do
        {
            do
            {
                if (clientResponce < minimum)
                {
                    clientResponce = AskForNum("Ne me prenez pas pour un idiot, cette valeur est trop petite pour entrer dans les bornes !\nRecommencez, je veux un nombre entre " + minimum + " et " + maximum + ":");
                    error++;
                }

                if (clientResponce > maximum)
                {
                    clientResponce = AskForNum("Ne me prenez pas pour un idiot, cette valeur est trop grande pour entrer dans les bornes !\nRecommencez, je veux un nombre entre " + minimum + " et " + maximum + ":");
                    error++;
                }

                if(clientResponce < guess)
                {
                    minimum = clientResponce;
                    clientResponce = AskForNum("C’est plus ! Vous cherchez donc un nombre entre " + minimum + " et " + maximum + ".");
                }
                
                if(clientResponce > guess)
                {
                    maximum = clientResponce;
                    clientResponce = AskForNum("C’est moins ! Vous cherchez donc un nombre entre " + minimum + " et " + maximum + ".");
                }

                tentative++;

            } while (clientResponce != guess);
        
        
            String playAgain = AskYesOrNo("Bravo, c’était la bonne réponse, vous avez mis " + tentative + " essais à trouvé et vous avez fait " + error + " erreurs ! Voulez-vous rejouer ? (y/n)");

            if (playAgain.equals("y"))
            {

                int sameNum = AskForNum("Voulez vous rejouer avec les même bornes (1) ou des nouvelles (2)");
                if (sameNum == 2)
                {
                    minimum = AskForNum("Très bien, entrez la nouvelle borne inférieure :");
                    maximum = AskForNum("Quelle est la nouvelle borne supérieurr :");
                }

            }
            else
            {
                System.out.println("Bonne journée et à bientôt.");
                loop = false;
            }
        } while (loop);
    }
}