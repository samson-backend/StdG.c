import java.util.ArrayList;

public class Ex24ArrayListLoop{
    public static void main(String[] args) {

        // Create ArrayList of students
        ArrayList<String> students = new ArrayList<>();
        students.add("Dawit");
        students.add("Saron");
        students.add("Fikir");
        students.add("Tigist");
        students.add("Abebe");

        System.out.println("=== METHOD 1: Traditional For-Loop ===");

        // Loop through each student
        for(int i = 0; i < students.size(); i++) {
            String currentStudent = students.get(i);
            System.out.println("Student #" + (i+1) + ": " + currentStudent);
        }

        System.out.println("\n=== METHOD 2: For-Each Loop (Easier!) ===");

        // For-each loop (Simpler syntax)
        int number = 1;
        for(String student : students) {
            System.out.println("Student #" + number + ": " + student);
            number++;
        }

        System.out.println("\n=== PRACTICAL: Calculate Average Grade ===");

        // ArrayList of grades
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(85.0);
        grades.add(92.0);
        grades.add(78.0);
        grades.add(90.0);
        grades.add(88.0);

        double sum = 0;

        // Loop through grades to add them up
        for(int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }

        double average = sum / grades.size();
        System.out.println("Total students: " + grades.size());
        System.out.println("Sum of grades: " + sum);
        System.out.println("Average grade: " + average);
    }
}