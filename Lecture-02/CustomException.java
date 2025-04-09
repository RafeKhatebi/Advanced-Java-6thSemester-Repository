public class CustomException {

//      Write a program that throws a custom exception for invalid input (e.g.,negative salary)

public static void main(String[] args) {
    try {
        int salary = 1000;// simulating  an invalid payment method.
        if (salary < 0) {
            throw new NegativeSalaryException("Salary cannot be negative");
        }
    } catch (NegativeSalaryException e) {
        System.out.println(e.getMessage());
    }
}

}

// Custom exception class
class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}
