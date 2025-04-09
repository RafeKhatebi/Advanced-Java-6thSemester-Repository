import java.io.File;

public class FileCheckExample {

    public static void main(String[] args) {
        File file = new File("file.txt");
        if (file.exists()) {
            System.out.println("File is exist \n");
            // System.out.println("Abosloute Path \n" + file.getAbsolutePath());
            System.out.println("Name" + file.getName() + "\n");
            System.out.println("Length of file" + file.length() + "\n");

        } else {
            System.out.println("File idoes not exist");

        }
    }
}