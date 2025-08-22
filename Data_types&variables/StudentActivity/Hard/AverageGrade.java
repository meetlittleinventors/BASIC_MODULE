// Hard – Average Marks & Grade
import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks in Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks in Subject 3: ");
        int m3 = sc.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average = " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else if (avg >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
