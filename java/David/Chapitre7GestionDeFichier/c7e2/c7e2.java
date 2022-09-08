import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class c7e2 {

    public static void main(String[] args) throws IOException {

        FileWriter myFileWriter = new FileWriter("recette.txt");
        BufferedWriter writer = new BufferedWriter(myFileWriter);

        String[] recipe = { "ing1", "ing2", "ing3" };

        for (int i = 0; i < recipe.length; i++) {
            writer.write(recipe[i]);
            writer.newLine();
        }
        writer.close();
    }
}