package HelloWorld;

import java.util.Scanner;

public class c2e3_Scanner {

    public static void main(String[] args) {

        Scanner favAnimal = new Scanner(System.in);

        System.out.println("what's your favorite animal ?");
        String result = favAnimal.nextLine();
        favAnimal.close();
        System.out.printf("your favorite animal is " + result);
        
    }
}