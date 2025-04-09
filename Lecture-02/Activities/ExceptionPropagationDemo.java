import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionPropagationDemo {

    // Method that propagates the exception
    public static void readFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file); // May throw FileNotFoundException
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        try {
            readFile("nonexistentfile.txt"); // File does not exist, causing an exception
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
