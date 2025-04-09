
import java.io.*;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"));
            Person p = (Person) ois.readObject();
            ois.close();
            System.out.println("Name: " + p.name + ", Age: " + p.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
