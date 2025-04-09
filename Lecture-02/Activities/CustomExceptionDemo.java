// Custom exception class
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// Main class to demonstrate custom exception
public class CustomExceptionDemo {
    public static void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Error: Salary cannot be negative. Provided salary: " + salary);
        } else {
            System.out.println("Salary is valid: " + salary);
        }
    }

    public static void main(String[] args) {
        try {
            validateSalary(-5000); // Negative salary to trigger the exception
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
