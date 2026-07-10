public class Arrays101Basics {
    public static void main(String[] args) {

        // Declare an array
        String[] students = {"Abebe", "Bekele", "Challa", "Dawit"};

        // Access elements (0-based index!)
        System.out.println("First student: " + students[0]);
        System.out.println("Second student: " + students[1]);

        // Get array length
        System.out.println("Total students: " + students.length);

        // Loop through array
        for(int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i=i) + ": " + students[i]);
        }
    }
}