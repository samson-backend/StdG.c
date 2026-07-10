public class StudentGradeManager {
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for(int grade : grades) {
            sum = sum + grade;
        }
        return (double)sum / grades.length;
    }

    public static String getGradeStatus(double average) {
        if(average >= 90) {
            return "Excellent";
        } else if(average >= 70) {
            return "Good";
        } else if(average >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        int[] studentGrades = {85, 92, 78, 90, 88};

        double avg = calculateAverage(studentGrades);
        String status = getGradeStatus(avg);

        System.out.println("Average Grade: " + avg);
        System.out.println("Status: " + status);
    }

}