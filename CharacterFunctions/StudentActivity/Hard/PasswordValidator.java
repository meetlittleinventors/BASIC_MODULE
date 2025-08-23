public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Hello123";  // try different cases

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpace = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (Character.isWhitespace(ch)) {
                hasSpace = true;
            }
        }

        if (hasUpper && hasDigit && !hasSpace) {
            System.out.println("Valid Password ");
        } else {
            System.out.println("Invalid Password ");
        }
    }
}
