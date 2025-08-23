public class CountDigits {
    public static void main(String[] args) {
        String str = "Java12345";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
