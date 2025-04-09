import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number !");
            int i = sc.nextInt();
            System.out.println("You enterd " + i);

        } catch (java.util.InputMismatchException e) {
            System.err.println(" Error: Invalid input.Please Enter a Number");

        }
    }

}
