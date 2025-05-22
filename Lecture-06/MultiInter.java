interface function1 {
    int sum(int a, int b);
}

interface function2 {
    void teach(String teaching);
}

public class MultiInter {
    public static void main(String[] args) {
        function1 f1 = (a, b) -> (a + b);
        function2 f2 = (name) -> System.out.println(name);   
        f1.sum(12,12);
        f2.teach("Ali");
}

}
