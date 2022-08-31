package HelloWorld;
import java.util.Scanner;

public class c3e8calculateurprixv2 {

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
    static double Taxe(double _dbl, double _percent){
        return _dbl + _dbl * _percent / 100;
    }
    static double Reduction(double _dbl, int _reduction){
        return _dbl - _reduction;
    }

    static void ShowResult(){

        int _reduc = 10;
        double _number = GetNumber();

        System.out.println("\n" + _number + " Euros\n" +
        Conversion(_number, 1.19) + " Dollars\n" +
        Conversion(_number, 3395) + " Tugrik\n" +
        "\n" +
        Taxe(_number, 7.5) + " Dollars\n" +
        Taxe(_number, 21) + " Euros\n" +
        Taxe(_number, 10) + " Tugrik\n" +
        "\n" +
        Reduction(Taxe(_number, 7.5), _reduc) + " Dollars\n" +
        Reduction(Taxe(_number, 21), _reduc) + " Euros\n" +
        Reduction(Taxe(_number, 10), _reduc) + " Tugrik\n"
        );
    }
}