import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 3.0;
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
