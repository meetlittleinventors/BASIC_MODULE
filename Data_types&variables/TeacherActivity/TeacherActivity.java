import java.util.Scanner;

public class TeacherActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // 1) Length
        int len = text.length();
        System.out.println("Length: " + len);

        // 2) First & last character (guard for empty)
        if (len > 0) {
            System.out.println("First char: " + text.charAt(0));
            System.out.println("Last char: " + text.charAt(len - 1));
        } else {
            System.out.println("First char: (none)");
            System.out.println("Last char: (none)");
        }

        // 3) Uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // 4) Safe substring (first up to 5 chars)
        int end = Math.min(5, len);
        System.out.println("First up to 5 chars: " + text.substring(0, end));

        // 5) Reverse using charAt
        String reversed = "";
        for (int i = len - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        // 6) Palindrome (ignore spaces & case)
        String normalized = text.toLowerCase().replace(" ", "");
        String revNorm = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            revNorm += normalized.charAt(i);
        }
        boolean isPalindrome = normalized.equals(revNorm);
        System.out.println("Palindrome (ignore spaces & case): " + isPalindrome);

        sc.close();
    }
}
