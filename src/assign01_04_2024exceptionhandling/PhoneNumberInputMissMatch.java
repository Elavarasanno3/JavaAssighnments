package assign01_04_2024exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInputMissMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your phone number: ");

        try {
            // Read the input as a long value to handle long phone numbers
            long phoneNumber = scanner.nextLong();
            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter only numbers for the phone number.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
