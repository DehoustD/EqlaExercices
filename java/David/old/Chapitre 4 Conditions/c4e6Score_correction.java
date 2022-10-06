import java.util.Scanner;

public class c4e6Score_correction {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("entrer le nom de la première personne");
        String firstUser = input.nextLine();
        System.out.println("entrer le score de " + firstUser);
        int firstScore = input.nextInt();
        input.nextLine();

        System.out.println("entrer le nom de la seconde personne");
        String secondUser = input.nextLine();
        System.out.println("entrer le score de " + secondUser);
        int secondScore = input.nextInt();
        input.nextLine();

        String tempUser;
        int tempScore;

        if (firstScore < secondScore) {

            tempUser = firstUser;
            firstUser = secondUser;
            secondUser = tempUser;

            tempScore = firstScore;
            firstScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println("entrer le nom de la troisième personne");
        String thirdUser = input.nextLine();
        System.out.println("entrer le score de " + thirdUser);
        int thirdScore = input.nextInt();
        input.nextLine();

        if(thirdScore > secondScore){

            tempUser = thirdUser;
            thirdUser = secondUser;
            secondUser = tempUser;

            tempScore = thirdScore;
            thirdScore = secondScore;
            secondScore = tempScore;
        }
        
        if (firstScore < secondScore) {

            tempUser = firstUser;
            firstUser = secondUser;
            secondUser = tempUser;

            tempScore = firstScore;
            firstScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println(
        "La première personne est " + firstUser + " avec un score de " + firstScore +
        "la seconde personne est " + secondUser + " avec un score de " + secondScore
        );

/*
        System.out.println("entrer le nom de la quatrième personne");
        String fourthUser = input.nextLine();
        System.out.println("entrer le score de " + fourthUser);
        int fourthScore = input.nextInt();
        input.nextLine();
*/
        input.close();
    }
}