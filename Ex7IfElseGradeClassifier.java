public class Ex7IfElseGradeClassifier {
    public static void main(String[] args) {
        int[] scores = {85, 72, 65, 92, 88};

        for(int score : scores) {
            if(score >= 90) {
                System.out.println("Score: " + score + " - Grade: A");
            } else if(score >= 80 ) {
                System.out.println("Score: " + score + " - Grade: B");
            } else {
                System.out.println("Score: " + score + " - Grade: C");
            }
        }
    }
}