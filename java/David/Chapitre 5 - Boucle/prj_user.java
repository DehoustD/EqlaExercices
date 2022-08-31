import java.util.Scanner;

public class prj_user {
    public static Scanner input = new Scanner(System.in);

    public static float AskFloat(String _Question) {
        System.out.print(_Question);

        float _responce = 0;
        boolean _isLooping = true;

        while (_isLooping) {

            if (input.hasNextFloat()) {
                _responce = input.nextFloat();
                _isLooping = false;
                input.nextLine();
            } else {
                input.nextLine();
                System.out.println("\nErreur, seul les chiffres sont accepté.\n" + _Question);
            }
        }
        return _responce;
    }

    public static int AskInt(String _Question) {
        System.out.print(_Question);

        int _responce = 0;
        boolean _isLooping = true;

        while (_isLooping) {

            if (input.hasNextFloat()) {
                _responce = input.nextInt();
                _isLooping = false;
                input.nextLine();
            } else {
                input.nextLine();
                System.out.println("\nErreur, seul les chiffres sont accepté.\n" + _Question);
            }
        }
        return _responce;
    }
}