import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        System.out.println("Uppercase: " + input.toUpperCase());
        sc.close();
    }
}
