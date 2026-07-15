import java.io.*;
import java.util.ArrayList;

public class Ex26FileIO {
    public static void main(String[] args) {

        // === WRITING TO A FILE ===
        try {
            // Create a file writer
            FileWriter writer = new FileWriter("students.txt");

            // Write data
            writer.write("Dawit: 85\n");
            writer.write("Saron: 93\n");
            writer.write("Fikir: 78\n");

            // Close the file (IMPORTANT!)
            writer.close();

            System.out.println("✓ Data saved to students.txt");
        
        } catch (IOException e) {
            System.out.println("ERROR saving file: " + e.getMessage());
        }

        // === READING FROM A FILE ===
        try {
            // Create a file reader
            File file = new File("students.txt");
            BufferedReader reader = new BufferedReader (new FileReader(file));

            String line;
            System.out.println("\n=== STUDENT GRADES ===");

            // Read line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        
        } catch (IOException e) {
            System.out.println("ERROR reading file: " + e.getMessage());
        }
    }
}