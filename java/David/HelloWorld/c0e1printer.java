package HelloWorld;

import java.util.Scanner;

public class c0e1printer {

    public static void main(String[] args) {

        boolean colorPrint = false;

        System.out.println("imprimer en noir et blanc [yes/no]");
        Scanner printChoice = new Scanner(System.in);
        String printChoiceResult = printChoice.nextLine();
        printChoice.close();

        if(printChoiceResult.equals("yes")){
            colorPrint = false;
        }
        if(printChoiceResult.equals("no")){
            colorPrint = true;
        }
        Printer(colorPrint);
    }

    static void Printer(boolean colorPrint){
        if (colorPrint) {
            System.out.println("Imprimer en couleur");
        } else {
            System.out.println("imprimer en noir et blanc");
        }
    }
}