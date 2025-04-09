import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class NIODemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("test.txt");
        if (Files.exists(path)) {
            System.out.println("File is exist!");

        }
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);

    }   
}