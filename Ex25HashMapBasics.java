import java.util.HashMap; // Import the HashMap tool

public class Ex25HashMapBasics {
    public static void main(String[] args) {

        // Create a HashMap (Key = String, Value = Double)
        // Think: Dish Name -> Price
        HashMap<String, Double> menu = new HashMap<>();

        // Add items (Key, Value)
        menu.put("Doro Wat", 250.0);
        menu.put("Kitfo", 300.0);
        menu.put("Tibs", 200.0);
        menu.put("Shiro", 150.0);

        // Get a specific item (Instant lookup!)
        double priceOfKitfo = menu.get("Kitfo");
        System.out.println("Price of Kitfo: " + priceOfKitfo + " Berr");

        // Update an item (Change the price)
        menu.put("Tibs", 220.0); // Tibs got more expensive!
        System.out.println("New price of Tibs: " + menu.get("Tibs"));

        // Remove an item (Dish is sold out)
        menu.remove("Shiro");

        // Check if item exists
        if(menu.containsKey("Doro Wat")) {
            System.out.println("Yes, we have Doro Wat!");
        }

        // Loop throgh the entire menu
        System.out.println("\n=== TODAY'S MENU ===");
        for(String dish : menu.keySet()) {
            System.out.println(dish + ": " + menu.get(dish) + " Birr"); 
        }



    
    }
}