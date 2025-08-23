public class GradeDemo {
    public static void main(String[] args) {
        int marks = 68; // try 90, 75, 50, 49, 40

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else {
            if (marks >= 40) {
                System.out.println("Fail (Re-test eligible)");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
