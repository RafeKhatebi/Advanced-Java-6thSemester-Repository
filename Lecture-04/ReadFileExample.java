import java.nio.file.*;

public class ReadFileExample {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(" C:\\example\\ example.txt");
        String readText = Files.readString(path);
        System.out.println(readText);
    }
}
