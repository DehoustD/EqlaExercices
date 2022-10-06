import java.util.Scanner;

public class c3e2_Function_etonne {

    public static void main(String[] args) {

        //-------------------------------------------------1
        MyFunction("\nfunction call 1 : Hello");

        //-------------------------------------------------2
        String nameString = "Name";
        MyFunction("function call 2 : " + nameString);
        
        //-------------------------------------------------3
        System.out.println("What's your name ?");
        Scanner userName = new Scanner(System.in);
        MyFunction("\nfunction call 3 : " + userName.nextLine());    
        
        //-------------------------------------------------4
        System.out.println("What's your forename ?");
        String userNameResult = userName.nextLine();
        MyFunction("\nfunction call 4 : " + userNameResult);
        userName.close();
    }

    static void MyFunction(String myString){
        System.out.println(myString + " !\n");
    }
}