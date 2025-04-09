import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFileExample {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        String addText = " Sodais Khatebi  Jalil Ahmad ";
        Files.writeString(path, addText, StandardOpenOption.APPEND);

    }
}