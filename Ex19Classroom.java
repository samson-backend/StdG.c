import java.util.ArrayList;

public class Ex19Classroom {
    // Simple Student Class inside the same file for practice
    static class Student {
        String name;
        double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        // Create the list
        ArrayList<Student> classList = new ArrayList<>();

        // Add students
        classList.add(new Student("Abebe", 85.0));
        classList.add(new Student("Bekele", 92.5));
        classList.add(new Student("Chala", 78.0));

        // Loop through and print
        System.out.println("--- Class Roster ---");
        for(int i = 0; i < classList.size(); i++){
            Student s = classList.get(i); // Get the object
            System.out.println(s.name + " scored: " + s.grade);
        }
    }
}
