public class DD2_While {

    public static void main(String[] args) {

        int i = 27;
        while (i > 1) {
            i--;
            System.out.println(i + "- Hello boucle While");
        }

        System.out.println(
                "\nJe ne savais pas si il fallait que l'énumération se fasse dans l'ordre ou pas, alors dans le doute, j'ai fait les deux.\n");

        int index = 0;
        while (index < 26) {
            index++;
            System.out.println(index + "- Hello boucle While");
        }
    }
}