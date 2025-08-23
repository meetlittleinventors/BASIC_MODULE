public class CharDemo {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '9';
        char ch3 = ' ';
        
        // Step 1: Check if letter
        System.out.println(Character.isLetter(ch1));
        
        // Step 2: Check if digit
        System.out.println(Character.isDigit(ch2));
        
        // Step 3: Check whitespace
        System.out.println(Character.isWhitespace(ch3));
        
        // Step 4: Convert to lowercase
        System.out.println(Character.toLowerCase(ch1));
    }
}
