import java.util.*;

public class T4_Remove {

/**
 * Cours sur les listes, le retrait d'une entrée avec remove.
 */

    public static void main(String[] args) {

        // Declaration.

        List<String> myList = new LinkedList<String>();

        // Add.

        myList.add("chat");

        myList.add("chien");

        myList.add("autruche");

        // Print initial.

        System.out.println("\nPrint initial.\n");

        Fonctions.PrintList(myList);

        // Utilisation de remove via la valeur du String.

        myList.remove("autruche");

        // Utilisation de remove via l'index d'une valeur de la liste.

        myList.remove(1);

        // Print après les removes.

        System.out.println("\nPrint après les removes.\n");

        Fonctions.PrintList(myList);

    }

}