import java.util.Scanner;
public class HomeHard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        double avg = (m1 + m2 + m3) / 3.0;

        if(avg >= 60)
            System.out.println("Pass with First Division");
        else if(avg >= 40 && avg < 60)
            System.out.println("Pass");
        else
            System.out.println("Fail");

        sc.close();
    }
}
