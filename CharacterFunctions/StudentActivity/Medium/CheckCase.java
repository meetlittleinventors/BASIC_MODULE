public class CheckCase {
    public static void main(String[] args) {
        char ch = 'm';
        if(Character.isUpperCase(ch)) {
            System.out.println(ch + " is Uppercase");
        } else if(Character.isLowerCase(ch)) {
            System.out.println(ch + " is Lowercase");
        } else {
            System.out.println(ch + " is neither Uppercase nor Lowercase");
        }
    }
}
