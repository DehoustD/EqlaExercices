public class c5e6 {
    public static void main(String[] args) {

        int selector = 0;
        String title1 = "Programme avec \"continue\"";
        String title2 = "Programme sans \"continue\"";
        String title3 = "Programme tout con";
        String title4 = "Programme avec Modulo";

        do {
            selector = prj_user
                    .AskInt("\nCe programme permet d'afficher tous les nombres impaires compris entre 1 à 10\n\n[1 = "
                            + title1
                            + "]\n[2 = " + title2 + "]\n[3 = " + title3 + "]\n[4 = " + title4 + "]\n\nVotre choix : ");
            switch (selector) {
                case 1:
                    Programme1(title1);
                    break;
                case 2:
                    Programme2(title2);
                    break;
                case 3:
                    Programme3(title3);
                    break;
                case 4:
                    Programme4(title4);
                    break;
                default:
                    System.out.println("\nErreur");
                    break;
            }

        } while (!(selector == 1 || selector == 2 || selector == 3 || selector == 4));
    }

    static void Programme1(String _title) {
        System.out.println("\n" + _title + "\n");
        int x = 0;
        for (int i = 0; i <= 10; i++) {

            if (i == x) {
                x = x + 2;
                continue;
            }
            System.out.println(i);
        }
        System.out.println(
                "\nCode :\n------\n\nint x = 1;\n\nfor (int i = 0; i <= 10; i++) {\n\n   if (i == x) {\n     x = x + 2;\n     continue;\n   }\n   System.out.println(i);\n}\n");
    }

    static void Programme2(String _title) {
        System.out.println("\n" + _title + "\n");
        int x = 0;
        for (int i = 0; i <= 10; i++) {

            if (i == x) {
                x = x + 2;
            } else {
                System.out.println(i);
            }
        }
        System.out.println(
                "\nCode :\n------\n\nint x = 0;\n\nfor (int i = 0; i <= 10; i++) {\n\n   if (i == x) {\n     x = x + 2;\n   } else {\n     System.out.println(i);\n   }\n}");
    }

    static void Programme3(String _title) {
        System.out.println("\n" + _title + "\n");
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("\nCode :\n------\n\nfor (int i = 1; i <= 10; i+=2) {\n   System.out.println(i);\n}");
    }

    static void Programme4(String _title) {
        System.out.println("\n" + _title + "\n");

        for (int i = 0; i <= 10; i++) {
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
    }
}