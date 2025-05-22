import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public static void main(String[] args) throws IOException {
        try {
            readFile("ex.txt");

        } catch (FileNotFoundException e) {
            System.err.println(" File not found: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        fileReader.close();
    }

}