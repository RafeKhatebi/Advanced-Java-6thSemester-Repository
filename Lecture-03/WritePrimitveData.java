import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitveData {

    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("strem.bin"));
            dos.writeInt(100);
            dos.writeDouble(32.0);
            dos.writeChar(32);
            System.out.println("Data written to file.");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
            e.printStackTrace();
        }

    }
}