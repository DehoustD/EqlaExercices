package Chapitre7GestionDeFichier.c7e1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class c7e1 {

    public static void main(String[] args) throws IOException {

        FileReader myFileReader = new FileReader("poeme.txt");
        BufferedReader reader = new BufferedReader(myFileReader);

        String line = "";

        while (line != null) {
            try {
                line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            myFileReader.close();
        }
    }
}