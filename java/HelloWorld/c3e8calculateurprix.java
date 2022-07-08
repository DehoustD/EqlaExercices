package HelloWorld;
import java.util.Scanner;

public class c3e8calculateurprix {

    public static void main(String[] args) {
        ShowResult();
    }

    static double GetNumber(){
        System.out.println("wright a number (Euro)");
        Scanner scan = new Scanner(System.in);
        double scannedDouble = scan.nextDouble();

        scan.close();
        return scannedDouble;
    }

    static double Conversion(double _dbl, double _mult){
        return _dbl * _mult;    
    }
    static double Taxe(double _dbl, double _percent, int _reduc){
        return _dbl + _dbl * _percent / 100 - _reduc;
    }

    static void ShowResult(){

        int _reduc = 10;
        double _dbl = GetNumber();

        System.out.println("\n" + _dbl + " Euros\n" +
        Conversion(_dbl, 1.19) + " Dollars\n" +
        Conversion(_dbl, 3395) + " Tugrik\n" +
        "\n" +
        Taxe(_dbl, 7.5, _reduc) + " Dollars\n" +
        Taxe(_dbl, 21, _reduc) + " Euros\n" +
        Taxe(_dbl, 10, _reduc) + " Tugrik\n"
        );
    }
}