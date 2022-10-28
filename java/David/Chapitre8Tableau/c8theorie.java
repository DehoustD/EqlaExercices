import java.util.Arrays;
import java.util.Collections;

public class c8theorie {

    public static void main(String[] args) {
        Theorie5();
    }

    static void Theorie1() {

        int[] ages = { 28, 23, 34, 40, 43 };
        String[] videoGames = { "Mario", "Sonic", "Zelda" };

        System.out.println(ages[2] + " " + videoGames[0]);

        videoGames[0] = "Asteroid";

        System.out.println(ages[2] + " " + videoGames[0]);

    }

    static void Theorie2() {

        String[] videoGames =
        { "Pokemon", "Zelda", "Ark", "Sonic", "Mario", "Spyro", "Pong", "Asteroid", "Gex", "Chrono Cross" };

        for (int i = 0; i < videoGames.length; i++) {
            System.out.println("n° " + (i + 1) + " : " + videoGames[i]);
        }
    }

    static void Theorie3() {

        int[] ages = { 28, 23, 34, 40, 43 };
        String[] videoGames =
        { "Pokemon", "Zelda", "Ark", "Sonic", "Mario", "Spyro", "Pong", "Asteroid", "Gex", "Chrono Cross" };

        Arrays.sort(videoGames);

        for (int i = 0; i < videoGames.length; i++) {
            System.out.println("n° " + (i + 1) + " : " + videoGames[i]);
        }

        Arrays.sort(ages);

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

    }

    static void Theorie4() {

        Integer[] ages = { 28, 23, 34, 40, 43 };
        String[] videoGames =
        { "Pokemon", "Zelda", "Ark", "Sonic", "Mario", "Spyro", "Pong", "Asteroid", "Gex", "Chrono Cross" };

        Arrays.sort(videoGames,Collections.reverseOrder());

        for (int i = 0; i < videoGames.length; i++) {
            System.out.println("n° " + (i + 1) + " : " + videoGames[i]);
        }

        Arrays.sort(ages, Collections.reverseOrder());

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }

    static void Theorie5() {

        int[][] numbers = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20} };

        //System.out.println(numbers[2][1]);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }

        System.out.println("\n\n");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[j][i]);
            }
        }

        // System.out.println("\n\n");

        // System.out.println(numbers[0][0]);
        // System.out.println(numbers[1][0]);
        // System.out.println(numbers[2][0]);
        // System.out.println(numbers[3][0]);

        // System.out.println(numbers[0][1]);
        // System.out.println(numbers[1][1]);
        // System.out.println(numbers[2][1]);
        // System.out.println(numbers[3][1]);

        // System.out.println(numbers[0][2]);
        // System.out.println(numbers[1][2]);
        // System.out.println(numbers[2][2]);
        // System.out.println(numbers[3][2]);

    }
}