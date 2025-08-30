public class GradeDemo {
    public static void main(String[] args) {
        int marks = 42;  // try changing to 92, 76, 51, 42, 30

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
            if (marks >= 40) {
                System.out.println("Re-test eligible");
            }
        }
    }
}
