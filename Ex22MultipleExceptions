public class Ex22MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Crash!
        } catch (ArithmeticException e) {
            System.out.println("Math error!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index doesn't exist!");
        } finally {
            System.out.println("This always runs!");
        }
    }
}