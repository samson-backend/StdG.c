import java.util.ArrayList;
public class Ex20TopStudent {

    static class Student{
        String name;
        double grade;
        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }
    public static void mian(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Samson", 95.0));
        students.add(new Student("Dawit", 88.0));
        students.add(new Student("Elias", 99.0));

        // Assume the first student is the top one
        Student topStudent = students.get(0);

        // Check everyone else
        for(int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            if(current.grade > topStudent.grade) {
                topStudent = current; //Found a new leader!
            }
        }

        System.out.println("Top Student is: " + topStudent.name);
        System.out.println("With a grade of: " + topStudent.grade);
    }
}
