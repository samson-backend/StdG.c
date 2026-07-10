public class Drill11ArraySumCalculator {
    public static void main(String[] args) {
        int[] sales = {500, 300, 750, 200, 400};
        int total = 0;

        for(int i = 0; i < sales.length; i++) {
            total = total + sales[i];
        }
        System.out.println("Total Sales: " + total + " Birr");
        System.out.println("Average: " + (total / sales.length));
    }
}