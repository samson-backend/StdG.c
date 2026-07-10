// This is a CLASS (Blueprint)
public class Student {
    // INSTANCE VARIABLES (attributes)
    String name;
    int age;
    double grade;

    // CONSTRUCTOR (creates the object)
    public Student(String studentName, int studentAge, double studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    // METHOD (behavior)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // GETTER METHOD (access data)
    public double getGrade() {
        return grade;
    }

}