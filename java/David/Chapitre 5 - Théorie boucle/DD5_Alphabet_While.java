public class DD5_Alphabet_While {

    public static void main(String[] args) {

        char letter = 'z'+1;
        while (letter > 'a'){
            letter--;
            System.out.println(letter + "- Hello boucle While");
        }
        
        System.out.println("\nJe ne savais pas si il fallait que l'énumération se fasse dans l'ordre ou pas, alors dans le doute, j'ai fait les deux.\n");
        
        char l = 'a'-1;
        while (l < 'z') {
            l++;
            System.out.println(l + "- Hello boucle While");
        }

        System.out.println("\nj'ai essayé avec des majuscules parce que science\n");

        char lettre = 'a'-1;
        while (lettre < 'z') {
            lettre++;
            System.out.println(Character.toString(lettre).toUpperCase() + "- Hello boucle While");
        }
    }
}