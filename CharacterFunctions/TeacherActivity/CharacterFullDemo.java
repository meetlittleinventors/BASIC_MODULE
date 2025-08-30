public class CharacterFullDemo {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'm';
        char c3 = '9';
        char c4 = ' ';
        
        // --- Check character types ---
        System.out.println(c1 + " isLetter: " + Character.isLetter(c1));
        System.out.println(c3 + " isDigit: " + Character.isDigit(c3));
        System.out.println(c3 + " isLetterOrDigit: " + Character.isLetterOrDigit(c3));
        System.out.println("'" + c4 + "'" + " isWhitespace: " + Character.isWhitespace(c4));
        
        // --- Check case ---
        System.out.println(c1 + " isUpperCase: " + Character.isUpperCase(c1));
        System.out.println(c2 + " isLowerCase: " + Character.isLowerCase(c2));
        
        // --- Convert case ---
        System.out.println(c2 + " toUpperCase: " + Character.toUpperCase(c2));
        System.out.println(c1 + " toLowerCase: " + Character.toLowerCase(c1));
        
        // --- Convert data types ---
        String s = Character.toString(c1);
        System.out.println(c1 + " toString: " + s);
        
        int digitValue = Character.getNumericValue(c3);
        System.out.println(c3 + " to number: " + digitValue);
        
        char fromNumber = Character.forDigit(10, 16); // 10 in hex -> 'a'
        System.out.println("Number 10 to char in hex: " + fromNumber);
    }
}
