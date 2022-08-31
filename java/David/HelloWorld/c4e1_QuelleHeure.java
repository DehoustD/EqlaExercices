package HelloWorld;
import java.util.Scanner;

public class c4e1_QuelleHeure {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quelle heure est-il ? (hh)");
        int hour = input.nextInt();

        System.out.println("Quelle heure est-il ? (mm)");
        int min = input.nextInt();

        boolean isHourCorrect = CheckTime(hour, 24, "Heure");
        boolean isMinutCorrect = CheckTime(min, 60,"Minutes");

        if(isHourCorrect && isMinutCorrect){
            System.out.println("Il est " + hour + "h" + min);
        }
        System.out.println("Bonne journée");
    }

    static boolean CheckTime(int _timeIn, int _timeLimit,String _data){
        // true = l'entrée est correct
        // false = entrée incorrecte

        if (_timeIn >= _timeLimit){
           System.out.println("Erreur : Les " + _data + " encodées sont supérieur à " + _timeLimit);
           return false;         
        } else if (_timeIn < 0) {
            System.out.println("Erreur : Les " + _data + " encodées sont inférieur à 0");
            return false;         
        } else {
            return true;
        }
    }
}