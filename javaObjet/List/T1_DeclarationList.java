import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Cours sur les listes, les déclarations.
 */

public class T1_DeclarationList {

    public static void main(String[] args) {

        // Plus rapide pour manipuler les données (tri, ajout, suppression,...).

        // Vide de base.

        List<String> myList = new LinkedList<String>();

        // Plus lent pour manipuler les données, meilleurs pour juste stocker des valeurs.

        // Reserve de l'espace mémoire pour 10 elements.

        List<Integer> myArrayList = new ArrayList<Integer>();

        // Exemple de print.

        System.out.println(myList.get(0));

        System.out.println(myArrayList.get(0));

    }

}
