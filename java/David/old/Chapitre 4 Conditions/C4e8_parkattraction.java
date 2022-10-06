import java.util.Scanner;

public class C4e8_parkattraction {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(
                "Merci de remplir le formulaire suivant afin de déterminer les attractions qui seront autorisées ou non.");
        int age = EnterAge();
        String sex = ChooseSex();
        boolean enceinte = false;
        if (sex.equals("une femme")) {
            enceinte = Enceinte();
        }
        String nationality = EnterNationality();
        int size = EnterSize();
        String convertedSize = (ConvertSize(size));
        float weight = EnterWeight();
        String astro = EnterAstro();
        input.nextLine();

        Information(age, sex, enceinte, nationality, size, weight, astro, convertedSize);

        ShowAll(age, sex, enceinte, nationality, size, weight, astro);
        System.out.println(
                "\nNous vous souhaitons une journée pleine d'amusement au sein de notre parc !\nN'oubliez pas que grâce à votre âge, vous pouvez gagner une photo dédicassée de notre formateur en Java.\nBonne chance !");
    }

    static int EnterAge() {
        System.out.println("Entrez votre âge");
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }

    static String ChooseSex() {
        System.out.println("Indiquez si vous êtes un homme ou une femme \nh pour homme \nf pour femme");
        String choice = input.nextLine();
        String _sex = "";
        if (choice.equals("h")) {
            _sex = "un homme";
        } else if (choice.equals("f")) {
            _sex = "une femme";

        } else {
            System.out.println("Erreur, veuillez réessayer.");
            _sex = ChooseSex();
        }
        return _sex;
    }

    static boolean Enceinte() {
        System.out.println("Indiquez si vous êtes enceinte [o/n]");
        String choice = input.nextLine();

        if (choice.equals("o")) {
            return true;
        }
        if (choice.equals("n")) {
            return false;
        } else {
            System.out.println("Erreur");
            return Enceinte();
        }
    }

    static String EnterNationality() {
        System.out.println("Indiquez votre nationnalité");
        String _choice = input.next();
        return _choice;
    }

    static int EnterSize() {
        System.out.println("Entrez votre taille en cm (190 pour 1 M 90)");
        int choice = input.nextInt();
        return choice;
    }
    static String ConvertSize(int _taille){
        String _tailleToString = "" + (float) _taille/100;
        if(_taille < 100){
            System.out.println(_taille + " cm.");
        } else if (_taille > 280){
            System.out.println("Vous mentez, tout simplement.");
        } else {
            System.out.println("vous mesurez " + _taille/100 + "m" + _tailleToString.substring(2));
        }
        return _taille/100 + "m" + _tailleToString.substring(2);
    }

    static float EnterWeight() {
        System.out.println("Entrez votre poids");
        float choice = input.nextFloat();
        return choice;
    }

    static String EnterAstro() {
        System.out.println(
                "Indiquez votre signe astrologique \n 1 - bélier \n 2 - taureau \n 3 - gémeaux \n 4 - cancer \n 5 - lion \n 6 - vierge \n 7 - balance \n 8 - scorpion \n 9 - sagittaire \n 10 - capricorne \n 11 - verseau \n 12 - poisson");
        int choice = input.nextInt();
        String _astro = "";
        switch (choice) {
            case 1:
                _astro = "bélier";
                break;
            case 2:
                _astro = "taureau";
                break;
            case 3:
                _astro = "gémeaux";
                break;
            case 4:
                _astro = "cancer";
                break;
            case 5:
                _astro = "lion";
                break;
            case 6:
                _astro = "vierge";
                break;
            case 7:
                _astro = "balance";
                break;
            case 8:
                _astro = "scorpion";
                break;
            case 9:
                _astro = "sagittaire";
                break;
            case 10:
                _astro = "capricorne";
                break;
            case 11:
                _astro = "verseau";
                break;
            case 12:
                _astro = "poisson";
                break;
            default:
                System.out.println("entrée incorrecte, veuillez recommencer");
                _astro = EnterAstro();
                break;
        }
        return _astro;
    }

    static void Information(int age, String sex, boolean enceinte, String nationality, int size, float weight, String astro, String convertedSize) {

        String strEnceinte = "";
        if (enceinte) {
            strEnceinte = " enceinte";
        }

        System.out.println("\nVoici les informations que vous avez communiquées : \n vous avez " + age
                + " ans. \n Vous êtes "
                + sex + strEnceinte
                + ". \n Votre nationnalité est " + nationality
                + ". \n Vous mesurez " + convertedSize
                + " et vous pesez " + weight
                + "Kg.\n Votre signe astrologique est " + astro
                + ". \n\nConfirmez-vous ces informations ? [o/n]");
        String choice = input.nextLine();

        // si on ne tappe pas o ou n, ca concidere false et non pas une erreur

        boolean confirmation = choice.equals("o");

        //////////

        while (!confirmation) {
            System.out.println(
                    "Que souhaitez-vous modifier ? \n 0 pour valider et continuer,\n 1 pour l'âge,\n 2 pour le sexe,\n 3 pour la nationalité,\n 4 pour la taille,\n 5 pour le poid,\n 6 pour le signe astrologique.");
            choice = input.nextLine();
            int switchMinValue = 0;
            int switchMaxValue = 6;
            switch (choice) {
                case "0":
                    confirmation = true;
                    break;
                case "1":
                    age = EnterAge();
                    break;
                case "2":
                    sex = ChooseSex();
                    if (sex.equals("une femme")) {
                        enceinte = Enceinte();
                    }
                    break;
                case "3":
                    nationality = EnterNationality();
                    break;
                case "4":
                    size = EnterSize();
                    break;
                case "5":
                    weight = EnterWeight();
                    break;
                case "6":
                    astro = EnterAstro();
                    break;
                default:
                    System.out.println("Erreur, veuillez entrer une valeur comprise entre " + switchMinValue + " et "
                            + switchMaxValue + ".");
                    break;
            }
        }
        System.out.println("Nous vous confirmons l'enregistrement de vos informations.\nVoici la liste des attractions auquels vous avez accès :\n");
    }

    static boolean ShowGrandSplash(int _age, String _sexe, boolean _enceinte, String _natio, int _taille, float _poids, String _astro) {
        if (_age > 45 || (_sexe.equals("une femme") && _taille > 160)
                || (_age > 18 && (_astro.equals("cancer") || _astro.equals("balance") || _astro.equals("poisson")))) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowRiviere(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if (_natio.equals("Allemand") || (_sexe.equals("une femme") && _age > 12 && _taille > 150) || _astro.equals("capricorne")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowGrandHuit(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if ((_sexe.equals("une femme") && _age < 10 && _taille < 130) || (_sexe.equals("un homme") && _astro.equals("gémeaux"))) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowAutoTampo(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if (_age > 89 && _age < 120 && _sexe.equals("un homme")
                && (_natio.equals("Italien") || _natio.equals("Japonais") || _natio.equals("Allemand"))
                || _natio.equals("Autrichien") || _age < 17 || (_age >= 25 && _age <= 35 && _sexe.equals("une femme"))) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowCarrousel(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if ((_age > 18 && _taille < 140) || _sexe.equals("un homme")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowChaiseVolante(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if ((_age > 45 && _sexe.equals("une femme")) || _taille < 150) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowTrampoRDN(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if ((_age > 25 && _sexe.equals("un homme") && _taille > 180 && _poids > 80 && _poids < 100
                && (_astro.equals("lion") || _astro.equals("sagittaire"))) || _sexe.equals("une femme")) {
            return true;
        } else {
            return false;
        }
    }

    static boolean ShowChenille(int _age, String _sexe, String _natio, int _taille, float _poids, String _astro) {
        if (_natio.equals("Nigérien") && _age > 14 && _taille > 150) {
            return true;
        } else {
            return false;
        }
    }

    static void ShowAll(int _age, String _sexe, boolean _enceinte, String _natio, int _taille, float _poids,
            String _astro) {

        if (ShowGrandSplash(_age, _sexe, _enceinte, _natio, _taille, _poids, _astro)) {
            System.out.println("Grand Splash");
        }
        if (ShowRiviere(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Rivière Sauvage");
        }
        if (ShowGrandHuit(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Grand Huit");
        }
        if (ShowAutoTampo(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Auto Tamponneuse");
        }
        if (ShowCarrousel(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Carrousel");
        }
        if (ShowChaiseVolante(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Chaise Volante");
        }
        if (ShowTrampoRDN(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("Trampoline la Reine des Neiges");
        }
        if (ShowChenille(_age, _sexe, _natio, _taille, _poids, _astro)) {
            System.out.println("La Chenille");
        }
    }
}