import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // 2) Arithmetic Operators
        if (b != 0) {
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Division/Modulus by zero not allowed!");
        }

        // 3) Assignment Operators
        int c = a;
        c += 5;
        System.out.println("c after += 5: " + c);

        // 4) Relational Operators
        System.out.println("a > b : " + (a > b));
        System.out.println("a == b : " + (a == b));

        // 5) Logical Operators
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));

        // 6) Unary Operators
        int d = 5;
        System.out.println("++d = " + (++d));
        System.out.println("d-- = " + (d--));

        // 7) Bitwise Operators
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));

        // 8) Ternary Operator
        String result = (a >= b) ? "a is greater or equal" : "b is greater";
        System.out.println("Ternary Result: " + result);
    }
}
