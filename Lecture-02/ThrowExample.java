public class ThrowExample {
    public static void main(String[] args) {
        int age = -5;

        try {
            validage(age);
            System.out.println("Age is valid");

        } catch (IllegalArgumentException e) {
            System.err.println("Error Age is not valid.");
        }
    }

    private static void validage(int age) {
        if (age < 0)
            throw new IllegalArgumentException("Age can not be negative");
    }

}