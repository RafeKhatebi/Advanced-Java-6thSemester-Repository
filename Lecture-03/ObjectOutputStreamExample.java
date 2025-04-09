import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"));
            Person p = new Person("Alice", 25);
            oos.writeObject(p);
            oos.close();
            System.out.println("Object written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}