import java.util.Arrays;
import java.util.Scanner;

public class c3e7calculette {

    public static float scanResult1 = 0.0f;
    public static float scanResult2 = 0.0f;

    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------- Récupération des chiffres via scanner.

        System.out.println("entrer un premier chiffre");

        Scanner scan1 = new Scanner(System.in);
        float scanResult1 = scan1.nextFloat();
        
        System.out.println("entrer un second chiffre");

        Scanner scan2 = new Scanner(System.in);
        float scanResult2 = scan2.nextFloat();

        scan1.close();
        scan2.close();
        
        //--------------------------------------------------------------------------------------------- Appel des fonctions mathématiques, et récupération en variable.

        float addResult = NumberAddition(scanResult1, scanResult2);
        float multResult = NumberMult(scanResult1, scanResult2);
        float sousResult = NumberSous(scanResult1, scanResult2);
        float divResult = NumberDiv(scanResult1, scanResult2);
        float squarreResult [] = NumberSquarre(scanResult1, scanResult2);

        //--------------------------------------------------------------------------------------------- Appel de la fonction d'affichage des résultats

        ShowAllStuff(addResult, multResult, sousResult, divResult, squarreResult);
    }

    static void ShowAllStuff(float result1, float result2, float result3, float result4, float [] result5){
        System.out.println("addition = " + scanResult1 + " + " + scanResult2 + " = " + result1 + "\nmultiplication = " + result2 + "\nsoustraction = " + result3 +  "\ndivision = " + result4 + "\nCube" + Arrays.toString(result5));
    }

    static float NumberAddition(float nbr1, float nbr2){
        return (nbr1 + nbr2);
    }
    static float NumberMult(float nbr1, float nbr2){
        return (nbr1 * nbr2);
    }
    static float NumberSous(float nbr1, float nbr2){
        return (nbr1 - nbr2);
    }
    static float NumberDiv(float nbr1, float nbr2){
        return (nbr1 / nbr2);
    }
    static float [] NumberSquarre(float nbr1, float nbr2){
        float f1 = nbr1 * nbr1;
        float f2 = nbr2 * nbr2;
        return new float[] {f1,f2};
    }
}