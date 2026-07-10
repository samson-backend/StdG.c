public class Drill17MethodwithReturnValue {
    public static int calculateArea(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        int area1 = calculateArea(5, 10);
        int area2 = calculateArea(7, 8);

        System.out.println("Area 1: " + area1);
        System.out.println("Area 2: " + area2);
        System.out.println("Total: " + (area1 + area2));
    }

}