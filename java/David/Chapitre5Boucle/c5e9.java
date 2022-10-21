public class c5e9 {

    public static void main(String[] args) throws InterruptedException {
        // e9a();
        // e9b();
        // e9c_print();
        // e9c_println();
        // e9d();
        e9e();

    }

    static int Rng(int _min, int _max) {
        return (int) (Math.random() * (_max - _min) + _min);
    }

    static void e9a() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    static void e9b() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World " + (i + 1));
        }
    }

    static void e9c_print() throws InterruptedException {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                Thread.sleep(300);
            }
            Thread.sleep(1000);
            System.out.print("\n");
        }
    }

    static void e9c_println() throws InterruptedException {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(".");
                Thread.sleep(300);
            }
            Thread.sleep(1000);
            System.out.println("");
        }
    }

    static void e9d() throws InterruptedException {

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 5; j++) {

                for (int k = 0; k < k + 1; k++) {
                    System.out.print("..");
                    Thread.sleep(300);
                }
                System.out.println("");
            }
            Thread.sleep(1000);
            System.out.print("\n");
        }
    }

    static void e9e() {

        int randomNum;
        int i = 0;

        do {
            randomNum = Rng(0, 11);
            i++;
            System.out.println("Sending data to server, attempt n° " + i + "." /*+ "   nbr aléatoire = " + randomNum*/);

        } while ((randomNum != 1) && i < 10);
 
        if (randomNum == 1) {
            System.out.println("Successfuly sent data.");
        } else {
            System.out.println("couldn't send data to serveur, try again.");
        }
    }

}