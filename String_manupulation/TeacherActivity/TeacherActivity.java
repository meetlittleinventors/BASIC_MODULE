// STRING MANIPULATION - Teacher Activity
public class TeacherActivity {
    public static void main(String[] args) {
        String text = "Hello Java";

        // 1. Length of string
        System.out.println("Length: " + text.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + text.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + text.toLowerCase());

        // 4. Substring
        System.out.println("Substring(0,5): " + text.substring(0, 5));

        // 5. Character at index
        System.out.println("Char at 1: " + text.charAt(1));

        // 6. Compare strings
        String s1 = "Java";
        String s2 = "JAVA";
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s2));

        // 7. Concatenation
        String combined = s1.concat(" Programming");
        System.out.println("Concatenated: " + combined);
    }
}
