import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitveData {

    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("stream.bin"));
            int a = dis.readInt();
            System.out.println("Numbers : " + a);
            dis.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("While codeing" + e.getMessage());

        }
    }
}