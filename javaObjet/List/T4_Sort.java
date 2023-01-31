import java.util.*;

/**
 * Cours sur les listes, le triage par ordre alphabétique et son inverse.
 */

public class T4_Sort {

    public static void main(String[] args) {

        // Declaration.

        List<String> myList = new LinkedList<String>();

        // Ajout d'éléments avec la fonction Add.

        myList.add("chat");

        myList.add("faucon");

        myList.add("ecureuil");

        myList.add("aigle");

        myList.add("dauphin");

        // Print de la liste dans l'ordre initial.

        System.out.println("\nPrint de la liste dans l'ordre initial.\n");

        Fonctions.PrintList(myList);

        // Triage de la list avec la fonction Sort - ordre alphabétique.

        Collections.sort(myList);

        System.out.println("\nTriage de la liste avec la fonction Sort - ordre alphabétique.\n");

        Fonctions.PrintList(myList);

        // Triage de la list avec la fonction Sort - ordre alphabétique inverse.

        Collections.sort(myList, Collections.reverseOrder());

        System.out.println("\nTriage de la liste avec la fonction Sort - ordre alphabétique inverse.\n");

        Fonctions.PrintList(myList);

        // Le fonctionnement est identique pour une liste de int.

    }

}
