public class UsernameValidationExample {
    public static void main(String[] args) {
        try {
            validateUsername("user@name"); // Simulating an invalid username
            System.out.println("Username is valid");
        } catch (InvalidUsernameException e) {
            System.err.println("Invalid username: " + e.getMessage());
        }
    }

    private static void validateUsername(String username) throws InvalidUsernameException {
        if (!isValidFormat(username)) {
            throw new InvalidUsernameException("Username does not meet the required format: " + username);
        }
        // Additional validation logic can be added here
        System.out.println("Username validation successful for: " + username);
    }

    private static boolean isValidFormat(String username) {
        // Simulate a simple validation logic for demonstration purposes
        return username.matches("[a-zA-Z]+");
    }
}
