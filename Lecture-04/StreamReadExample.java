import java.nio.file.*;
import java.util.stream.Stream;

public class StreamReadExample {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(" C:\\example\\ example.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }
    }
}