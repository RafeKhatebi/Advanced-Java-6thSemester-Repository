import java.util.ArrayList;

class Test {
    public static void main(String args[]) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        // in here it'll just print once each of them.
        arrL.forEach(n -> System.out.println(n));
        // in here it will 2 and 4  
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}
