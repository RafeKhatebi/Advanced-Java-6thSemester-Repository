interface DoubleConsumer {
    void accept(double x);
}

public class IntPrinter implements DoubleConsumer {
    @Override
    public void accept(double x) {
        System.out.print(x);
    }

    public static void main(String[] args) {

    }

    DoubleConsumer cons1 = new IntPrinter();
    DoubleConsumer cons2 = x -> {
        System.out.print(x);
    };
    DoubleConsumer cons3 = System.out::print;
}
