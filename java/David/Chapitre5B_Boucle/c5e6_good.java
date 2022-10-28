public class c5e6_good {

    public static void main(String[] args) {
        String vowels = "aeiouy";
        String consonent = "bcdfghjklmnpqrstvwxz";

        int spaceCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        String responce = "Le Chat De Là Bas, Il Est Là !";
        String lowerResponce = responce.toLowerCase();
        String upperResponce = responce.toUpperCase();

        for (int i = 0; i < responce.length(); i++) {
            if (responce.charAt(i)==" ".charAt(0)) {
                spaceCount++;
            }
            else if(responce.charAt(i)!=lowerResponce.charAt(i)){
                upperCaseCount++;
            }
            else if(responce.charAt(i)!=upperResponce.charAt(i)){
                lowerCaseCount++;
            }
            for (int j = 0; j < vowels.length(); j++) {
                if (lowerResponce.charAt(i)==vowels.charAt(j)) {
                    vowelCount++;
                }
            }
            for (int j = 0; j < consonent.length(); j++) {
                if (lowerResponce.charAt(i)==consonent.charAt(j)) {
                    consonantCount++;
                }
            }
        }

        System.out.println(responce);

         System.out.println("\nNombre de majuscules = " + upperCaseCount);
         System.out.println("\nNombre de minuscules = " + lowerCaseCount);
         System.out.println("\nNombre d'espaces = " + spaceCount);
         System.out.println("\nNombre de voyelles = " + vowelCount);
         System.out.println("\nNombre de consonnes = " + consonantCount);
    }
}
