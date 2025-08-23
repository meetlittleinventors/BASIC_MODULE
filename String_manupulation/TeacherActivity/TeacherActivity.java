import java.util.Scanner;

public class TeacherActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        int len = text.length();
        System.out.println("Length: " + len);

        // First & last character (guard for empty)
        if (len > 0) {
            System.out.println("First char: " + text.charAt(0));
            System.out.println("Last  char: " + text.charAt(len - 1));
        } else {
            System.out.println("First char: (none)");
            System.out.println("Last  char: (none)");
        }

        // Case conversion
        System.out.println("UPPER: " + text.toUpperCase());
        System.out.println("lower: " + text.toLowerCase());

        // Safe substring: first up to 5 chars
        int end = Math.min(5, len);
        System.out.println("First up to 5 chars: " + text.substring(0, end));

        // Contains (case-insensitive)
        System.out.print("Search a word: ");
        String needle = sc.nextLine().toLowerCase();
        boolean found = text.toLowerCase().contains(needle);
        System.out.println("Contains \"" + needle + "\"? " + found);

        // Reverse using loop + charAt
        String reversed = "";
        for (int i = len - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        // Optional: Palindrome (ignore spaces & case)
        // (Uncomment if you want to show quickly)
        // String norm = text.toLowerCase().replaceAll("\\s+", "");
        // String revNorm = "";
        // for (int i = norm.length() - 1; i >= 0; i--) revNorm += norm.charAt(i);
        // System.out.println("Palindrome? " + norm.equals(revNorm));

        sc.close();
    }
}
