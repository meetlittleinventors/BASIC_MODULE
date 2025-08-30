public class Easy1 {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical
        System.out.println("(a > 5 && b < 5): " + (a > 5 && b < 5));

        // Assignment
        int c = a;
        c += 5;
        System.out.println("Assignment (c += 5): " + c);

        // Unary
        int d = 5;
        System.out.println("Pre-increment: " + (++d));
        System.out.println("Post-decrement: " + (d--));

        // Bitwise
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));

        // Ternary
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println("Ternary result: " + result);
    }
}
