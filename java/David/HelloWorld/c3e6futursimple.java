package HelloWorld;

import java.util.Scanner;

public class c3e6futursimple {
    public static void main(String[] args) {
        System.out.println("Dans 17 ans, vous aurez " + AgeAddition() + " ans");
    }
    static int AgeAddition(){

        System.out.println("Quel age avez vous ?");

        Scanner ageUtilisateur = new Scanner(System.in);
        int ageResult = ageUtilisateur.nextInt();
        ageUtilisateur.close();

        return (ageResult+17);
    }
}