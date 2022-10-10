import java.util.Arrays;

public class Print_ellements_tableau {

    public static void main(String[] args) {

        String[] monTableauDeString = { "machin", "truc", "bidule" };

        // Print les éléments d'un tableau, méthode simple :

        System.out.println(monTableauDeString[0]);

        System.out.println(monTableauDeString[1]);

        System.out.println(monTableauDeString[2]);

        // Print les éléments d'un tableau, méthode avec une boucle for :

        for (int i = 0; i < monTableauDeString.length; i++) {

            System.out.println(monTableauDeString[i]);

        }

        int[] monTableauDeInt = {1, 2, 3, 4, 5, 6 };

        System.out.println(Arrays.toString(monTableauDeInt));

        // le terme "Arrays" nécessite l'import "import java.util.Arrays"

    }
}