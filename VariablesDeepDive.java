public class VariablesDeepDive {
    public static void main(String[] args) {

        // ===== PRIMITIVE DATA TYPES =====

        // 1. int - Whole numbers
        int age = 26;
        int yearsAsChef = 5;
        int studentsInClass = 45;

        // 2. double - Decimal numbers
        double price = 19.99;
        double temperature = 36.6;
        double pi = 3.14159;

        // 3. char - Single character (use SINGLE quotes!)
        char grade = 'A';
        char initial = 'S';
        char yesNo = 'Y';

        // 4. boolean - True or False
        boolean isEmployed = true;
        boolean isStudent = false;
        boolean hasLicense = true;

        // 5. String - Text (use DOUBLE quotes!)
        String name = "Samson Eshetu";
        String city = "Addis Ababa";
        String previousJob = "Chef";

        // ===== PRINTING VARIABLES =====
        System.out.println("===== MY PROFILE =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Previous Job: " + previousJob);
        System.out.println("Years as Chef: " + yearsAsChef);
        System.out.println("Current Grade: " + grade);
        System.out.println("Is Learning Java: " + isEmployed);
        System.out.println("======================");

        // ===== MATH WITH VARIABLES =====
        int birthYear = 2026 - age;
        System.out.println("\nEstimated Birth Year: " + birthYear);

        double totalPrice = price * 3;
        System.out.println("Price for 3 items: " + totalPrice);

        // ===== CHANGING VARIABLE VALUES =====
        age = 27;  // You had a birthday!
        System.out.println("\nNew Age: " + age);

        // ===== COMBINING TEXT AND NUMBERS =====
        String message = "Hello, I'm " + name + " and I'm " + age + " years old.";
        System.out.println("\n" + message);
    }
}