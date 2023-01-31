import java.util.*;

/**
 * Cours sur les listes, l'ajout d'une entrée à un index précis.
 */
public class T3_AddIndex {

    public static void main(String[] args) {

        // Declaration.

        List<String> myList = new LinkedList<String>();

        List<Integer> myArrayList = new ArrayList<Integer>();

        // Ajout d'éléments avec la fonction Add.

        myList.add("chat");

        myList.add("chien");

        myArrayList.add(5);

        myArrayList.add(10);

        // Ajout d'éléments à un certain index.

        // Exemple pour la liste de String.

        // Ajout de la valeur "lion" à l'index 0. Dans ce cas ci, "lion" sera la première entrée, les autres déjà existantes se déplacerons après.

        myList.add(0, "lion");

        // Ajout de la valeur "tigre" à l'index 1. Dans ce cas ci, "tigre" se retrouvera après la première entrée, et les secondes se déplacerons après.

        myList.add(1, "tigre");



        // Exemple pour la liste de int.

        // ajout de la valeur 18 à l'index 0. Dans ce cas ci, les nombres déjà existant se décalerons tous d'un index après 0.

        myArrayList.add(0, 18);

        // Exemple de print.

        Fonctions.PrintList(myList);

        Fonctions.PrintList(myArrayList);

    }

}