public class CaseInsensitiveCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "HELLO";
        
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are NOT equal");
        }
    }
}
