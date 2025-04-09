import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionbyZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your 1st number ");
            int i = sc.nextInt();
            System.out.println("Enter your 2nd number ");
            int j = sc.nextInt();
            int result = division(10, 3);
            System.out.println("Result :" + result);
        } catch (InputMismatchException e) {
            System.err.println("Error : please enter a number ");

        } catch (ArithmeticException e) {
            System.err.println("okkay is it a number ?");

        }
    }

    private static int division(int i, int j) {
        return i / j;
    }

}