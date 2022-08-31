package HelloWorld;

import java.util.Scanner;

public class c4e1_QuelleHeure_BKP {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Quelle heure est-il ? (hh)");
        int hour = input.nextInt();
        
        System.out.println("Quelle heure est-il ? (mm)");
        int min = input.nextInt();
        
        if (CheckTime(hour, 24) == 1){
            System.out.println("Erreur : L'heure encodée est supérieure à 24");
        } else if(CheckTime(hour, 24) == 2){
            System.out.println("Erreur : L'heure encodée est inférieur à 0");
        }
        
        if(CheckTime(min, 60) == 1){
            System.out.println("Erreur : Les minutes encodées sont supérieures à 60");
        } else if(CheckTime(min, 60) == 2){
            System.out.println("Erreur : Les minutes encodées sont inférieur à 0");
        }
        
        if(CheckTime(hour, 24) == 0 && CheckTime(min, 60) == 0){
            System.out.println("Il est " + hour + "h" + min);
        }
        
        System.out.println("Bonne journée");
        
    }
    
    static int CheckTime(int _timeIn, int _time){
        
        int _index = 0;
        
        // 0 = l'entrée est correct
        // 1 = l'entrée est supérieur au maximum
        // 2 = l'entrée est inférieur au minimum
        
        if (_timeIn >= _time){
            _index = 1;            
        } else if (_timeIn < 0) {
            _index = 2;            
        } else {
            _index = 0;
        }
        return _index;
    }
}