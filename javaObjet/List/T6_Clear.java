import java.util.*;

public class T6_Clear {

/**
 * Cours sur les listes, l'effacement complet d'une liste avec Clear.
 */

    public static void main(String[] args) {

        // Declaration.

        List<String> myList = new LinkedList<String>();

        // Add.

        myList.add("chat");

        myList.add("chien");

        // Print initial.

        System.out.println("\nPrint initial.\n");

        System.out.println("Ma liste contient :\n");

        Fonctions.PrintList(myList);

        // Utilisation de Clear.

        myList.clear();

        // Print après le Clear.

        System.out.println("\nPrint après le Clear.\n");

        System.out.println("Ma liste contient :\n");

        Fonctions.PrintList(myList);

    }

}