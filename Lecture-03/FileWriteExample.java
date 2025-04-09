import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hi i add this text from file writer");
            fw.close();
            System.out.println("\n" + "filewriter has added sucessfully.");
        } catch (IOException e) {
            System.err.println("An Error Occured!");

        }

    }
}