package HelloWorld;

import java.util.Scanner;

public class c3e1_Function_3en1 {

    public static void main(String[] args) {
        MyFunction();
        // shift + alt + arrow up = duplicate
    }

    static void MyFunction(){
        System.out.println("Hello world !");
        String myName = "dehoust";
        System.out.println("my name is " + myName);
        System.out.println("what's your name ?");
        Scanner userName = new Scanner(System.in);
        String userNameResult = userName.nextLine();
        userName.close();
        System.out.println("your name is " + userNameResult);
        System.out.println("\007");
    }
}