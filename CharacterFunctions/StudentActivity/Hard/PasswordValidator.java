public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Java123";  // Test password

        boolean hasUpper = false, hasDigit = false, hasSpace = false;

        for(int i=0; i<password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)) hasUpper = true;
            if(Character.isDigit(ch)) hasDigit = true;
            if(Character.isWhitespace(ch)) hasSpace = true;
        }

        if(hasUpper && hasDigit && !hasSpace && password.length() >= 6) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
