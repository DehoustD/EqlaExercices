import java.util.*;

public class T4_Remove {

/**
 * Cours sur les listes, le retrait d'une entrée avec remove.
 */

    public static void main(String[] args) {

        // Declaration.

        List<String> myList = new LinkedList<String>();

        List<Integer> myArrayList = new ArrayList<Integer>();

        // Ajout d'éléments avec la fonction Add.

        // Fonctionne de la même manière pour les deux type de listes.

        // Exemple pour la liste de String.

        myList.add("chat");

        myList.add("chien");

        // Exemple pour la liste de int.

        myArrayList.add(5);

        myArrayList.add(10);

        // Print initial.

        System.out.println("\nPrint initial.\n");

        Fonctions.PrintList(myList);

        Fonctions.PrintList(myArrayList);

        // Utilisation de remove;

        myList.remove("chien");

        myArrayList.remove(0);

        // Print après les removes.

        System.out.println("\nPrint après les removes.\n");

        Fonctions.PrintList(myList);

        Fonctions.PrintList(myArrayList);

    }

}