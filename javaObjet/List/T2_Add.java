import java.util.*;

/**
 * Cours sur les listes, l'ajout d'une entrée.
 */
public class T2_Add {

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

        // Exemple de print.

        Fonctions.PrintList(myList);

        Fonctions.PrintList(myArrayList);

    }

}