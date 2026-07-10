// Main class to test it
public class OOPExample {
    public static void main(String[] args) {
        // Create OBJECTS (instances)
        Student student1 = new Student("Abebe", 20, 85.5);
        Student student2 = new Student("Bekele", 22, 92.0);

        //Use the objects
        student1.displayInfo();
        System.out.println("Grade: " + student1.getGrade());

        student2.displayInfo();
    }
}
