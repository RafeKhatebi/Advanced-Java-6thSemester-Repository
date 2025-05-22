import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(); // Create a HashSet
        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, will not be added again
        System.out.println(set); // Print the HashSet
        // Acessing size of elements.
        int sizeHashSet = set.size();
        System.out.println("The size is = " + sizeHashSet);
        // delete any elements
        // set.remove(2);
        // Iteration
        for (String fruit : set) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println(set);
        set.contains("Apple");
        System.out.println(set.contains("Bananana"));

    }

}
