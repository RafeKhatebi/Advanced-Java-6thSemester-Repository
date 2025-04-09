import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("file.txt");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());

        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());

            }

        }
        System.out.println("Program continues after file handling");
    }

}
