import java.util.ArrayList;

public class StrArray {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Ali");
        str.add("kami");
        str.add("baba");
        str.forEach(
                n -> System.out.println(n)

        );

    }
}