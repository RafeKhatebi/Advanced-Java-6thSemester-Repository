import java.util.ArrayList;

public class MyArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
        // Accessing elements
        String getValue = list.get(1);// Accessing the 2nd element
        System.out.println("The 2nd element is: " + getValue);
        // Modifying elements
        list.set(2, "Blueberry"); // Changing the 2nd element to "Blueberry"
        System.out.println("After modification: " + list);
        // Removing elements
        list.remove(0); // Removing the 1st element
        System.out.println("After removal: " + list);
        // Size of the ArrayList
        int sizeOfList = list.size();
        System.out.println("Size of the list: " + sizeOfList);
        // Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
        // Iterating through the ArrayList
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println(list);
        // Clearing the ArrayList
        list.clear();
        System.out.println("After clearing: " + list);
        // Checking if the list is empty after clearing
        isEmpty = list.isEmpty();
        System.out.println("Is the list empty after clearing? " + isEmpty);

    }
}
