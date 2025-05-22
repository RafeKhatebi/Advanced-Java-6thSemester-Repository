import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> views = new LinkedHashMap<String, Integer>();
        views.put("iPhone", 1);
        views.put("MacBook", 2);
        views.put("AirPods", 3);
        // Access MacBook to make it most recent
        views.get("MacBook");
        // Add new product (triggers removal)
        views.put("iPad", 4);
        System.out.println("Recent products: " + views.keySet());
        // Output: [AirPods, MacBook, iPad]
    }
}