import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            int character;
            while ((character = fr.read()) != -1) {
                System.out.println((char) character);

            }
            fr.close();
        } catch (IOException e) {
            System.err.println("An error occured!");
        }
    }
}