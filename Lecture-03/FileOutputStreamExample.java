import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("stream.txt");
            String str = " Hi This will add in stream.txt";
            fos.write(str.getBytes());
            fos.close();
            System.out.println("Binary data written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}