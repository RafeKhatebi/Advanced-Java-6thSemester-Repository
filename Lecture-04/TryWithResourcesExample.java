import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            System.out.println("Reader" + br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}