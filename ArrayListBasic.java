import java.util.ArrayList; // Import this

public class ArrayListBasic {
    public static void main(String[] args) {

        // Creat ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Avocado");

        // Access elements
        System.out.println("First fruit: " + fruits.get(0));

        // Get size
        System.out.println("Total fruits: " + fruits.size());

        // Loop through ArrayList
        for(int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }


        // Remove element
        fruits.remove("Mango");

        // Check if contains
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Has Banana? " + hasBanana);

    }
}