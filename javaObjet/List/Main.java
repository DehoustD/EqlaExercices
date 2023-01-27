import java.util.*;
/**
 * Cours sur les listes
 */
public class Main {

    public static void main(String[] args) {

        // Plus rapide pour manipuler les données (tri, ajout, supression,...).
        // Vide de base.
        List<String> myList = new LinkedList<String>();

        // Plus lent pour manipuler les données, meilleurs pour juste stocker des valeurs.
        // reserve de l'espace mémoire pour 10 elements.
        List<Integer> myArrayList = new ArrayList<Integer>();


        myList.add("chien");
        myList.add("chat");
        myList.add("panda");
        myList.add("cacatoes");
        myList.add("crapaud");
        myList.add("libellule");
        myList.add("tigre");
        myList.add(1, "lezard");
        myList.set(2, "buffalo");

        // Ordre alphabétique.
        Collections.sort(myList);
        // Ordre alphabétique inverse.
        Collections.sort(myList, Collections.reverseOrder());

        //myList.remove("chien");
        myList.remove(0);
        
        PrintList(myList);

        myArrayList.add(5);
        myArrayList.add(73);
        myArrayList.add(0, 18);

        // Croissant.
        Collections.sort(myArrayList);
        // Decroissant.
        Collections.sort(myArrayList, Collections.reverseOrder());
        
        PrintList(myArrayList);

        myArrayList.clear();

        if (myArrayList.isEmpty()) {

            System.out.println("le tableau est vide");
            
        } else {

            System.out.println("le tableau contient : " + myArrayList.size() + " elements.");

        }

        // l'index fromIndex est inclusif, le toIndex est exclussif,
        // pour la ligne si dessous, la liste va de 2 à 3.
        List<String> petiteListeAnimaux = myList.subList(2, 4);

        PrintList(petiteListeAnimaux);

    }

    public static <T>void PrintList(List<T> _listToPrint){

        for (int i = 0; i < _listToPrint.size(); i++) {
            
            System.out.println(_listToPrint.get(i));
        
        }

    }

}