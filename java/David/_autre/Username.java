package HelloWorld;
import java.util.Scanner;

public class Username {

    static Scanner input = new Scanner(System.in);

     public static void main(String[] args) {
        String userName = "Luffy";
        String boatName = "Voguemary";

        userName = ChooseName();
        System.out.println(userName + " prend la mer seul sur son bateau, le " + boatName + ", une grande aventure l'attend !");
    }

    static String ChooseName(){
        String _defaultName = "Luffy";
        System.out.println("Votre nom est " + _defaultName + ", voulez-vous le changer ? [o/n]");
        String _choice = input.nextLine().toLowerCase();
        if(_choice.equals("o")){
            System.out.println("Quelle est le nom que vous voulez ?");
            _defaultName = input.nextLine();
            _defaultName = _defaultName.substring(0,1).toUpperCase() + _defaultName.substring(1).toLowerCase(); 
        }else if(_choice.equals("n")){
            System.out.println("Vous conservez le nom " + _defaultName);
        }else{
            System.out.println("Entrée incorrect.");
            _defaultName = ChooseName();
            return _defaultName;
        }
        return ConfirmName(_defaultName);
    }

    static String ConfirmName(String _userName){
        System.out.println("Vous ne pourrez plus changer de nom durant votre aventure, confirmez-vous le nom " + _userName + " [o/n]");
        String choice = input.nextLine().toLowerCase();
        if(choice.equals("o")){
            System.out.println("Entrée validée.");
        }else if(choice.equals("n")){
            System.out.println("Pseudo refusé, veuillez re-entrer votre pseudo.");
            _userName = ChooseName();
        }else{
            System.out.println("Entrée incorrect, veuillez recommencer.");
            _userName = ConfirmName(_userName);
        }
        return _userName;
    }


}