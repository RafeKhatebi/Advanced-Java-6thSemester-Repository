import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("stream.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i); // Convert bytes to characters
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}