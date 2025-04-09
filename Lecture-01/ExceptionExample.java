class ExceptionExample {
    public static void main(String[] args) {

        try {
            int result = division(10, 2);
            System.out.println("Result is  =  " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero");

        }
    }

    private static int division(int i, int j) {
        return i / j;

    }
}