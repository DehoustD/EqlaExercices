package HelloWorld;

public class c3e5factorisation2 {
    public static void main(String[] args) {
        AdditionSoustraction(5,4);
    }
    static void Addition(int nbr1, int nbr2){
        System.out.println(nbr1 + " + " + nbr2 + " = " + (nbr1 + nbr2));
    }
    static void Soustraction(int nbr1, int nbr2){
        System.out.println(nbr1 + " - " + nbr2 + " = " + (nbr1 - nbr2));
    }
    static void AdditionSoustraction(int nbr1, int nbr2){
        Addition(nbr1,nbr2);
        Soustraction(nbr1,nbr2);
    }
}