// Medium 3 – Boolean Example
import java.util.Scanner;

public class BooleanCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean isAdult = (age >= 18);
        System.out.println("Is Adult? " + isAdult);
    }
}
