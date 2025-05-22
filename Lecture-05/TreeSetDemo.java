import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<String> words = new TreeSet<>();
        words.add("Apple");
        words.add("Orange");
        words.add("cherry");
        System.out.println("Alphabatical order : " + words);
        int size = words.size();
        // words.addFirst("Bannana");
        // words.addLast("peach");
        words.remove("Apple");
        System.out.println(size);
        // words.subSet("p", "P");
        System.out.println(words);

    }
}