import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int max = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest number is: " + max);
    }
}
