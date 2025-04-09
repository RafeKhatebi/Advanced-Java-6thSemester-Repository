import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            readFile("ex.txt");
        } catch (FileNotFoundException e) {
            System.err.println(" File not found: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
    }
}