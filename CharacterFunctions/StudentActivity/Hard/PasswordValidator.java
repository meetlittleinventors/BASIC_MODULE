public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Abc123"; // Example password
        
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasWhitespace = false;
        
        // Check each character
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isWhitespace(c)) {
                hasWhitespace = true;
            }
        }
        
        // Check length rule (extension)
        boolean validLength = password.length() >= 6;
        
        // Validate password
        if (hasUpper && hasDigit && !hasWhitespace && validLength) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
