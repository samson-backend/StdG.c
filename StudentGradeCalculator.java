public class StudentGradeCalculator {
    static void main(String[]args) {
        // Calculate average grade
        int[] grades = {85, 92, 78, 90, 88};

        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

        double average = (double)sum / grades.length;

        System.out.println("Average grade: " + average);

        if(average >= 90) {
            System.out.println("Grade: A - Execellent!");
        } else if(average >= 80) {
            System.out.println("Grade: B - Good job!");
        } else {
            System.out.println("Grade: c - keep practicing!");
        }
    }

    }
