public class Methods101 {

    // Method that prints a greeting
    public static void sayHello() {
        System.out.println("Hello, Samson!");
    }

    // Method that prints a parameter
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that RETURMS a value
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Main method
    public static void main(String[] args) {
        // Call the method
        sayHello();
        greetPerson("Bekele");

        int result = addNumbers(5, 3);
        System.out.println("5 + 4 = " + result);
    }


}