import java.util.Scanner;
public class Easy1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        sc.close();
    }
}
