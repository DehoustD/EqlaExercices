package HelloWorld;
import java.util.Scanner;

public class c4e6Score {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // prénom et score du joueur 1

        System.out.println("Entrez le prénom de la première personne :");
        String playerName1 = input.nextLine();
        System.out.println("Entrez le score de " + playerName1);
        int playerScore1 = input.nextInt();
        input.nextLine();

        // prénom et score du joueur 2

        System.out.println("Entrez le prénom de la deuxième personne :");
        String playerName2 = input.nextLine();
        System.out.println("Entrez le score de " + playerName2);
        int playerScore2 = input.nextInt();
        input.nextLine();

        // prénom et score du joueur 3

        System.out.println("Entrez le prénom de la troisième personne :");
        String playerName3 = input.nextLine();
        System.out.println("Entrez le score de " + playerName3);
        int playerScore3 = input.nextInt();
        input.nextLine();

        // prénom et score du joueur 4

        System.out.println("Entrez le prénom de la quatrième personne :");
        String playerName4 = input.nextLine();
        System.out.println("Entrez le score de " + playerName4);
        int playerScore4 = input.nextInt();
        input.nextLine();



        int firstPlayerScore = 0;
        int secondPlayerScore = 0;
        int thirdPlayerScore = 0;
        int fourthPlayerScore = 0;
        
        String firstPlayerName = "NO_NAME";
        String secondPlayerName = "NO_NAME";
        String thirdPlayerName = "NO_NAME";
        String fourthPlayerName = "NO_NAME";


        // 2 joueurs

        if(playerScore1 > playerScore2){
            firstPlayerName = playerName1;
            firstPlayerScore = playerScore1;
            secondPlayerName = playerName2;
            secondPlayerScore = playerScore2;
        } else {
            firstPlayerName = playerName2;
            firstPlayerScore = playerScore2;
            secondPlayerName = playerName1;
            secondPlayerScore = playerScore1;
        }

        // 3 joueurs

        if (playerScore3 > firstPlayerScore){

            thirdPlayerName = secondPlayerName;
            thirdPlayerScore = secondPlayerScore;
            secondPlayerName = firstPlayerName;
            secondPlayerScore = firstPlayerScore;
            firstPlayerName = playerName3;
            firstPlayerScore = playerScore3;

        } else if (playerScore3 > secondPlayerScore){

            thirdPlayerName = secondPlayerName;
            thirdPlayerScore = secondPlayerScore;
            secondPlayerName = playerName3;
            secondPlayerScore = playerScore3;

        } else {

            thirdPlayerName = playerName3;
            thirdPlayerScore = playerScore3;
        }

        // 4 joueurs

        if (playerScore4 > firstPlayerScore){

            fourthPlayerName = thirdPlayerName;
            fourthPlayerScore = thirdPlayerScore;
            thirdPlayerName = secondPlayerName;
            thirdPlayerScore = secondPlayerScore;
            secondPlayerName = firstPlayerName;
            secondPlayerScore = firstPlayerScore;
            firstPlayerName = playerName4;
            firstPlayerScore = playerScore4;
        
        } else if (playerScore4 > secondPlayerScore){

            fourthPlayerName = thirdPlayerName;
            fourthPlayerScore = thirdPlayerScore;
            thirdPlayerName = secondPlayerName;
            thirdPlayerScore = secondPlayerScore;
            secondPlayerName = playerName4;
            secondPlayerScore = playerScore4;

        } else if (playerScore4 > thirdPlayerScore){

            fourthPlayerName = thirdPlayerName;
            fourthPlayerScore = thirdPlayerScore;
            thirdPlayerName = playerName4;
            thirdPlayerScore = playerScore4;

        } else {

            fourthPlayerName = playerName4;
            fourthPlayerScore = playerScore4;
        }


        System.out.println(
            "\nLa personne haut score est " + firstPlayerName + ", avec " + firstPlayerScore + " de score" +
            "\nEn deuxième vient " + secondPlayerName + ", avec " + secondPlayerScore + " de score" +
            "\nEn troisième position il y a " + thirdPlayerName + ", avec " + thirdPlayerScore + " de score" +
            "\nEnfin, en dernier il reste " + fourthPlayerName + ", avec " + fourthPlayerScore + " de score"
            );
    }
}
