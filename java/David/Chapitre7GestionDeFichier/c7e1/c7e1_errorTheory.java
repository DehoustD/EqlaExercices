package Chapitre7GestionDeFichier.c7e1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class c7e1_errorTheory {

    public static void main(String[] args) throws IOException {

        try {
            FileReader myFileReader = new FileReader("poem.txt");
            myFileReader.close();
        } catch (FileNotFoundException s) {
            System.out.println(s);
            System.out.println("un truc");
        }
    }
}