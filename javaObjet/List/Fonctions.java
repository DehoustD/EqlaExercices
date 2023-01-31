import java.util.List;

/**
 * Cours sur les listes - les fonctions utiles.
 */
public class Fonctions {

    /**
     * Cette fonction sert à afficher le contenu d'une liste que l'on renseigne en paramètre.
     * Le 'T' entre chevrons permet d'accepter plusieurs type de List,
     * aussi bien des 'int' que des 'String'.
     */
    public static <T> void PrintList(List<T> _listToPrint) {

        for (int i = 0; i < _listToPrint.size(); i++) {

            System.out.println(_listToPrint.get(i));

        }

    }

}