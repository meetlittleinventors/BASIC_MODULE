public class CharDemo {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '9';
        char ch3 = ' ';
        char ch4 = 'm';

        // Checking functions
        System.out.println("isLetter(A): " + Character.isLetter(ch1));
        System.out.println("isDigit(9): " + Character.isDigit(ch2));
        System.out.println("isWhitespace(' '): " + Character.isWhitespace(ch3));

        // Case checking
        System.out.println("isUpperCase(A): " + Character.isUpperCase(ch1));
        System.out.println("isLowerCase(m): " + Character.isLowerCase(ch4));

        // Case conversion
        System.out.println("toLowerCase(A): " + Character.toLowerCase(ch1));
        System.out.println("toUpperCase(m): " + Character.toUpperCase(ch4));

        // Conversion functions
        System.out.println("toString(A): " + Character.toString(ch1));
        System.out.println("getNumericValue('9'): " + Character.getNumericValue(ch2));
        System.out.println("forDigit(10, 16): " + Character.forDigit(10, 16));
    }
}
