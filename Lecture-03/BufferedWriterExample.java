import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("buffersWriter.txt"));
            bw.write("Hi baby");
            bw.close();
            System.err.println("Adding was sucessfully.");

        } catch (IOException e) {
            System.err.println("An Error Occured!");
            e.printStackTrace();
        }
    }

}