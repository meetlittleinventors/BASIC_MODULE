import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("First character: " + name.charAt(0));
        sc.close();
    }
}
