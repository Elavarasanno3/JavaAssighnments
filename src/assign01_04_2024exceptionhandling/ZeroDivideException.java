package assign01_04_2024exceptionhandling;

public class ZeroDivideException {
    public static void main(String[] args) {
        try {
            int result = divide(4, 2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int result = divide(4, 0);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            int result = divide(40,4 );
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    public static int divide(int dividend,int diviser){

        if(diviser == 0){
            throw new ArithmeticException("Division by zero");
        }
        return dividend/diviser;
    }
}
