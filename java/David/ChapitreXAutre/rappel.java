package ChapitreXAutre;

import common.userInput;

public class rappel {

    public static void main(String[] args) {

        float height = 0.0f;
        float weight = 0.0f;

        float heightMin = 0.5f;
        float heightMax = 2.6f;
        float weightMin = 25.0f;
        float weightMax = 700.0f;

        // fr = IMC / en = BMI for Body Mass Index.
        float imc = 0.0f;
        // [0] = maigre/lean [1] = normal/normal [2] = gros/fat
        float imcAll[] = { 20.0f, 25.0f, 30.0f };

        while (userInput.AskYesOrNo("Voulez vous calculer un IMC ?")) {

            //factoriser la demande de taille et de poids

            //demande de la taille.
            do {
                height = userInput.AskFloat("Veuillez entrer votre taille en mètre (x,xx).");
                if (height < heightMin || height > heightMax) {
                    System.out.println(height + "m est une taille particulièrement improbable pour un adulte.");
                }
            } while (height < heightMin || height > heightMax);
            System.out.println("Vous mesurez " + height + " mètre");

            //demande du poids.
            do {
                weight = userInput.AskFloat("Veuillez entrer votre poids en kilogramme.");
                if (weight < weightMin || weight > weightMax) {
                    System.out.println(weight + "kg est un poids particulièrement improbable pour un adulte.");
                }
            } while (weight < weightMin || weight > weightMax);
            System.out.println("Vous pesez " + weight + " kilo");

            //calcul de l'imc
            imc = IMCCalculation(height, weight);
            System.out.println("\nVotre IMC est : " + imc);

            //rapport et conseil
            IMCEvaluation(imcAll, imc);
            System.out.println(IMCRectification(imcAll, imc, height, weight));
        }
        System.out.println("Au revoir.");
    }

    static float IMCCalculation(float _taille, float _poids) {
        return _poids / (float) Math.pow(_taille, 2);
    }

    static void IMCEvaluation(float[] _imcAll, float _imc) {
        if (_imc < _imcAll[0]) {
            System.out.println("Votre poids est insuffisant");
        } else if (_imc <= _imcAll[1]) {
            System.out.println("Vous avez un poids normal");
        } else if (_imc <= _imcAll[2]) {
            System.out.println("Vous êtes en surpoids");
        } else {
            System.out.println("Vous êtes Obése");
        }
    }

    static String IMCRectification(float[] _imcAll, float _imc, float _taille, float _poids) {

        float _idealMin = 20 * (float) Math.pow(_taille, 2);
        float _idealMax = 25 * (float) Math.pow(_taille, 2);
        float _weightRectification = 0.0f;

        if (_imc <= _imcAll[0]) {
            _weightRectification = _idealMin - _poids;
            return "Votre poids idéal est compris entre " + _idealMin + " et " + _idealMax + ".\nVous devriez idéalement prendre au moins " + _weightRectification + "kg.";

        } else if (_imc >= _imcAll[1]) {
            _weightRectification = _poids - _idealMax;
            return "Votre poids idéal est compris entre " + _idealMin + " et " + _idealMax + ".\nVous devriez idéalement perdre au moins " + _weightRectification + "kg.";

        } else {
            return "Votre poids idéal est compris entre " + _idealMin + " et " + _idealMax + ".\nVous avez un poids adapté.";
        }
    }
}