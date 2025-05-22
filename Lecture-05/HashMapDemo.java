import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creation
        Map<String, Integer> map = new HashMap<>();
        map.put("Ali", 22);
        map.put("Sam", 32);
        map.get("sam");
        System.out.println(map);
        map.containsKey("Ali");
        int size = map.size();
        System.out.println(size);
        map.remove("Ali");
        // map.remove("Ali");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
