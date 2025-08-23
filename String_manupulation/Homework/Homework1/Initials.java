import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        
        String[] parts = name.split(" ");
        String initials = "";
        for (String part : parts) {
            initials += part.charAt(0) + ".";
        }
        System.out.println("Initials: " + initials);
        sc.close();
    }
}
