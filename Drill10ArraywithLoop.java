public class Drill10ArraywithLoop {
    public static void main(String[] args) {
        int[] prices = {100, 250, 75, 300, 150};

        for(int i = 0; i < prices.length; i++) {
            System.out.println("Price " + (i+1) + prices[i] + " Birr");
        }
    }
}