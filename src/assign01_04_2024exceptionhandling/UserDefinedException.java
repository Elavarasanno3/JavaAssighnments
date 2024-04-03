package assign01_04_2024exceptionhandling;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            // Simulate a condition that triggers the custom exception
            int age = -5;
            if (age < 0) {
                throw new CustomException("Age cannot be negative");
            }
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
