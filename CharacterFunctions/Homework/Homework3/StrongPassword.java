public class StrongPassword {
    public static void main(String[] args) {
        String password = "Hello@123";

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasSpace = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isLowerCase(ch)) hasLower = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if ("@#$%&*!".indexOf(ch) != -1) hasSpecial = true; // check for special char
            if (Character.isWhitespace(ch)) hasSpace = true;
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial && !hasSpace) {
            System.out.println("Strong Password ");
        } else {
            System.out.println("Weak Password ");
        }
    }
}
