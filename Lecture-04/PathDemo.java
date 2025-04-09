import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        // main point is here.
        Path path = Paths.get("C:\\example\\info.txt");
        System.out.println("File Name" + path.getFileName());
        System.out.println("Root Name" + path.getRoot());
        System.out.println("Patrent Name" + path.getParent());
        System.out.println("Class Name" + path.getClass());
        System.out.println("File System Name" + path.getFileSystem());
        System.out.println("Name Count" + path.getNameCount());

    }
}