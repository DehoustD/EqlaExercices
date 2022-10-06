import java.util.Scanner;

public class c4e3RpgClasse {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {

        System.out.println("Quelle classe voulez vous choisir :\n1 - Guerrier \n2 - Archer\n3 - Clerc\n4 - Sorcier");
        ExecuteOrRetry();
    }

    static boolean NumberIsValid (int _nbr){
        //if (_nbr == 1 || _nbr == 2 || _nbr == 3 || _nbr == 4){
        if(_nbr >= 1 && _nbr <=4){
            return true;
        } else {
            return false;
        }
    }

    static void ExecuteOrRetry(){

        // vérifie si l'entrée de l'utilisateur est un nombre entier
        if(input.hasNextInt()){
            int _numberSelected = input.nextInt();

            // Appel la fonction pour vérifié si le chiffre est compris entre 1, 2, 3 ou 4
            if(NumberIsValid(_numberSelected)){
                ShowSelectedClass(_numberSelected);
            } else {
                System.out.println("\nentrée non-valide, veuillez recommencer\n\nQuelle classe voulez vous choisir :\n1 - Guerrier \n2 - Archer\n3 - Clerc\n4 - Sorcier");
                ExecuteOrRetry();
            }
        } else {
            System.out.println("Entrée non-valide, seul les entiers sont accepté");
            input.nextLine();
            ExecuteOrRetry();
        }
    }

    static void ShowSelectedClass (int _selectedClassIndex){
        
        if(_selectedClassIndex == 1){
            System.out.println("\nGuerrier, solide mais faible à distance");
        } else if (_selectedClassIndex == 2){
            System.out.println("\nArcher, bon pour le combat à distance mais plus faible au corps à corps");
        } else if (_selectedClassIndex == 3){
            System.out.println("\nClerc, habilité de soigner");
        } else {
            System.out.println("\nSorcier, utilise la magie à des fins diverses");
        }
    }

}