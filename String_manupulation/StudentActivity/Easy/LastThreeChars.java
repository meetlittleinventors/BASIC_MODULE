public class LastThreeChars {
    public static void main(String[] args) {
        String text = "HelloWorld";
        String last3 = text.substring(text.length() - 3);
        System.out.println("Last 3 characters: " + last3);
    }
}
