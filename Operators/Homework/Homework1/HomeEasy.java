import java.util.Scanner;
public class HomeEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Square = " + (n * n));
        System.out.println("Cube = " + (n * n * n));
        sc.close();
    }
}
