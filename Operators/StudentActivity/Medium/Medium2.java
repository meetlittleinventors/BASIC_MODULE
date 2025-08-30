import java.util.Scanner;

public class Medium2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 3 subjects: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();

        int avg = (m1 + m2 + m3) / 3;

        if(avg >= 60)
            System.out.println("Pass with First Division");
        else if(avg >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
