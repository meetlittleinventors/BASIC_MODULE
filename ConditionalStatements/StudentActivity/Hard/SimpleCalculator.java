public class SimpleCalculator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char operator = '*'; // try +, -, /, %

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Cannot modulo by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
