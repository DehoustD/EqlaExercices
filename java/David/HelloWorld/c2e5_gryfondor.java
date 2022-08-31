package HelloWorld;

import java.util.Scanner;

public class c2e5_gryfondor {

    public static void main(String[] args) {

        Scanner PoudlardHouse = new Scanner(System.in);

        System.out.println("quelle est votre maison de Poudlard ?");
        String result = PoudlardHouse.nextLine();
        PoudlardHouse.close();
        System.out.printf("Tu veux aller à " + result.toUpperCase() + " ?! Mais tu es un sale moldu, les grands mages parlent couramment le Java !");
    }
}