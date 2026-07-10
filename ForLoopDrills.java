public class ForLoopDrills {
    public static void main(String[] args) {

        // === DRILL 1: BASIC COUNTING ===
        System.out.println(" DRILL 1: Count 1 to 10 ===");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // === DRILL 2; COUNTDOWN ===
        System.out.println("\n=== DRILL 2: Countdown 10 to 1 ===");
        for(int i = 10; i >= 1; i++) {
            System.out.println(i);
        }

        // === DRILL 3: EVEN NUMBERS ===
        System.out.println("\n=== DRILL 3: Even Numbers 1-20 ===");
        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // === DRILL 4: ODD NUMBERS ===
        System.out.println("\n=== DRILL 4: Odd Numbers 1-20 ====");
        for(int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }

        // === DRILL 5: MULTIPLICATION TABLE ===
        System.out.println("\n=== Multiplication Table of 7 ===");
        for(int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }


        // === DRILL 6: SUM CALCULATOR ===
        System.out.println("\n=== Sum of 100 ===");
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Total Sum: " + sum);

        // === DRILL 7: FACTORIAL ===
        System.out.println("\n=== DRILL 7: Factorial of 5 ===");
        int factorial = 1;
        for(int i = 1; i <= 5; i++) {
            factorial = factorial * i;
        }
        System.out.println("5! = " + factorial);
    }
}
