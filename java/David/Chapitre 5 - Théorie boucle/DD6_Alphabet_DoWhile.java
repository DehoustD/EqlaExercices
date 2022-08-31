public class DD6_Alphabet_DoWhile {

    public static void main(String[] args) {

        char letter = 'a'-1;
        do {
            letter++;
            System.out.println(letter + "- Hello boucle Do-While");
        } while (letter < 'z');
    }
}