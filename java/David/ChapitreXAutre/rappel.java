package ChapitreXAutre;

import java.text.DecimalFormat;
import common.userInput;

public class rappel {

    static DecimalFormat format1 = new DecimalFormat("#.#");
    static DecimalFormat format2 = new DecimalFormat("#.##");

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

            //il faut factoriser la demande de taille et de poids

            //demande de la taille.
            do {
                height = userInput.AskFloat("Veuillez entrer votre taille en mètre (x,xx).");
                if (height < heightMin || height > heightMax) {
                    System.out.println(format2.format(height) + "m est une taille particulièrement improbable pour un adulte.");
                }
            } while (height < heightMin || height > heightMax);
            System.out.println("Vous mesurez " + format2.format(height) + " mètre");

            //demande du poids.
            do {
                weight = userInput.AskFloat("Veuillez entrer votre poids en kilogramme.");
                if (weight < weightMin || weight > weightMax) {
                    System.out.println(format1.format(weight) + "kg est un poids particulièrement improbable pour un adulte.");
                }
            } while (weight < weightMin || weight > weightMax);
            System.out.println("Vous pesez " + format1.format(weight) + " kilos");

            //calcul de l'imc
            imc = IMCCalculation(height, weight);
            System.out.println("\nVotre IMC est : " + format1.format(imc));

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
        float[] _weightRectificationPlus = {_idealMin - _poids, _idealMax - _poids};
        float[] _weightRectificationMinus = {_poids - _idealMin, _poids - _idealMax};

        if (_imc <= _imcAll[0]) {
            return "Votre poids idéal est compris entre " + format1.format(_idealMin) + " et " + format1.format(_idealMax) + ".\nVous devriez idéalement prendre entre " + format1.format(_weightRectificationPlus[0]) + " et " + format1.format(_weightRectificationPlus[1])  + "kg.";
        } else if (_imc >= _imcAll[1]) {
            return "Votre poids idéal est compris entre " + format1.format(_idealMin) + " et " + format1.format(_idealMax) + ".\nVous devriez idéalement perdre entre " + format1.format(_weightRectificationMinus[1]) + " et " + format1.format(_weightRectificationMinus[0]) + "kg.";
        } else {
            return "Votre poids idéal est compris entre " + format1.format(_idealMin) + " et " + format1.format(_idealMax) + ".\nVous avez un poids adapté.";
        }
    }
}