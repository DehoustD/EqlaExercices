import java.text.DecimalFormat;

public class c5e5 {
    public static void main(String[] args) {

        int studentsNbr = 1; // le nombre d'élèves.
        int max = 0; // la note maximale.
        int index = 0;

        float flatScore = 0.0f; // le nombre de points de tous les élèves en brut.
        float average = 0.0f; // la moyenne de la classe.

        String plural = ""; // permet de mettre au pluriel certains mots en cas de besoin.
        String[] studentsNames = {""};

        System.out.println("\nBienvenue,\nce logiciel permet de calculer la moyenne des élèves de votre classe.\n");

        max = (int) prj_user.AskFloat("Entrez votre note maximale.\nNote maximale : ");
        flatScore = prj_user.AskFloat("Entrez la première note :\nNotes : ");
        studentsNames[0] = prj_user.AskString("Entrez le premier nom");

        System.out.println("\nVous avez " + studentsNbr + " élève" + plural + " avec une note de : " + flatScore + "/" + max);

        while (prj_user.AskFloat("Continuer ? [1 = oui / autre touche = non]\nVotre réponse : ") == 1) {

            float newEntry = 0.0f; // nouvelle note

            studentsNbr++;
            plural = "s";
            
            do {
                // entrée du nom de l'élève
                studentsNames[index] = prj_user.AskString("\nEntrez le nom de votre " + studentsNbr +  "ème élève :\nNom : ");

                // entrée de la note de l'élève
                newEntry = prj_user.AskFloat("\nEntrez la note de votre " + studentsNbr + "ème élève :\nNotes : ");
                if (newEntry > max) {
                    System.out.println("Attention : la note que vous venez d'entrer (" + newEntry + ") est supérieure à votre note Maximale (" + max + ").");
                }
                if (newEntry < 0){
                    System.out.println("Attention : ce logiciel en prend pas en charge les notes inferrieure à zéro.");
                }
                index++;
            } while (newEntry > max || newEntry < 0);

            flatScore = flatScore + newEntry;
            average = ((flatScore / max) * 100) / studentsNbr;
            System.out.println("\nVous avez " + studentsNbr + " élève" + plural + " avec une moyenne de : " + new DecimalFormat("#.##").format(average) + "%");
            // Math.round(mavaleur*100)/100
            // avec 3.33333 : 3.3333*100 = 333.33 => arrondi => 333 => division par 100 =>
            // 3.33
            for (int i = 0; i < studentsNames.length; i++) {
                System.out.println(studentsNames[i]);
            }
        }
        System.out.println("\nAu revoir.");
    }
}