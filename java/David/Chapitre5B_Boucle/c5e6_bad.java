import java.util.Scanner;

public class c5e6_bad {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("tappez une phrase.");
        //String responce = input.nextLine();

        String responce = "Le Chat De Là Bas, Il Est Là !";
        //String responce = "AEIOUY";

        int spaceCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        //char tempChar = 0;
        int tempChar = 0;

        System.out.println(responce);

        for (int i = 0; i < responce.length(); i++) {

            tempChar = responce.charAt(i);
            System.out.println(tempChar);

            if (tempChar == 32) {
                spaceCount++;
                System.out.println("      espace ++");
            }

            if (tempChar > 64 && tempChar < 91) {
                upperCaseCount++;
                System.out.println("      maj ++");
                if (tempChar == 65 || tempChar == 69 || tempChar == 73 || tempChar == 79 || tempChar == 85 || tempChar == 89) {
                    vowelCount++;
                    System.out.println("      voyelle ++");
                } else {
                    consonantCount++;
                    System.out.println("      consonne ++");
                }
            }

            if (tempChar > 96 && tempChar < 123) {
                lowerCaseCount++;
                System.out.println("      min ++");
                if (tempChar == 97 || tempChar == 101 || tempChar == 105 || tempChar == 111 || tempChar == 117 || tempChar == 121) {
                    vowelCount++;
                    System.out.println("      voyelle ++");
                } else {
                    consonantCount++;
                    System.out.println("      consonne ++");
                }
            }
        }

        System.out.println("\nNombre de majuscules = " + upperCaseCount);
        System.out.println("\nNombre de minuscules = " + lowerCaseCount);
        System.out.println("\nNombre d'espaces = " + spaceCount);
        System.out.println("\nNombre de voyelles = " + vowelCount);
        System.out.println("\nNombre de consonnes = " + consonantCount);
        
        input.close();
    }
}