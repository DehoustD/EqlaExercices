public class c5e7 {
    public static void main(String[] args) {

        String phrase = "Ce turbulent qui turbule... il devrait aller turbuler ailleurs !";

        System.out.println(phrase);

        for (int i = 0; i < phrase.length()-1; i++) {

            System.out.println(phrase.charAt(i));

            if (i > 0 || i > phrase.length()) {

                if (phrase.charAt(i+1) == 32 || phrase.charAt(i-1) == 32) {

                    System.out.println("\nespace\n");
                    
                }
                
            }
            
        }

    }

    public String WordProcess(String _phrase, int _indexMot){

        

        return "";
    }
}
