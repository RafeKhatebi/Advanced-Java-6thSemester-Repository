public class MultiCatchExceptionExample {
    public static void main(String[] args) {
        try {
            float result = division(10, 0);
            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {
            System.err.println("Error ArithmeticException occured! ");

        } catch (Exception e) {
            System.err.println("Error Exception occured! " + e.getMessage());
        }
        // Code after the try-catch block
        System.out.println("Program continues after exception handling");
    }

    private static float division(int i, int j) {
        return i / j;
    }
}
