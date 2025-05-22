import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try {
            BufferedReader brf = new BufferedReader(new FileReader("test.txt"));
            System.out.println("Reader" + brf.readLine());
            brf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}