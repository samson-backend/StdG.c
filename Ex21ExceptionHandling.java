public class Ex21ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Cannot divide by zero!");
        }

        System.out.println("Program continues ....");
    }
}
    
