public class challenge1{
    public static void main(String[] args){

        // Challenge 1: Multiple of 5
        System.out.println("=== Multiple of 5 (1-50) ====");
        for(int i = 5; i <= 50; i += 5) {
            System.out.println(i);
        }

        // Challenge 2: Sum of Even Numbers
        System.out.println("\n=== Sum of Even Numbers (1-100) ===");
        int sum = 0;
        for(int i = 2; i <= 100; i += 2) {
            sum = sum + 1;
        }
        System.out.println("Sum: " + sum);


        //=== Challenge 3: Powers fo 2
        System.out.println("\n=== Powers of 2 ===");
        for(int i = 1; i <= 10; i++) {
            int power = (int)Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }

}



