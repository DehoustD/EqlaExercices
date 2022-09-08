public class Print_ellements_tableau {

    public static void main(String[] args) {
        String[] monTableauDeString = {"machin" , "truc" , "bidule" };

        //Print les éléments d'un tableau, méthode simple :

        System.out.println(monTableauDeString[0]);
        System.out.println(monTableauDeString[1]);
        System.out.println(monTableauDeString[2]);

        //Print les éléments d'un tableau, méthode avec une boucle for :

        for (int i = 0; i < monTableauDeString.length; i++) {
            System.out.println(monTableauDeString[i]);
        }
    }
}