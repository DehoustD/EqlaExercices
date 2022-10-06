public class c4e6indice2 {
    //Hello
    public static void main(String[] args) {
        String firstGlass = "coca";
        String secondGlass = "eau";

        String temp = firstGlass;

        firstGlass = secondGlass;
        secondGlass = temp;

        System.out.println(firstGlass);
        System.out.println(secondGlass);
    }
}
