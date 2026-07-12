import java.util.ArrayList; // Import the ArrayList tool

public class Ex23ArrayListBasics {
    public static void main(String[] args) {

        // Create an ArrayList (empty buffet line)
        ArrayList<String> Students = new ArrayList<>();

        // Add items (put dishes on the guffet)
        Students.add("Dawit");
        Students.add("Saron");
        Students.add("Fikir");
        Students.add("Tigist");
        Students.add("Abebe");

        // Show the menu
        System.out.println("Students: " + Students);

        // Add more items later (expand the buffet)
        Students.add("Shiro");

        // Remove an item (dish ran out!)
        Students.remove("Tibs");
        
        // Get specific item (what's in position 1? )
        String student = Students.get(4);
        System.out.println("Student #1: " + student);

        // How many items? (how many dishes?)
        System.out.println("Total students: " + Students.size());

        // Show final menu
        System.out.println("Final menu: " + Students);

    }
}
