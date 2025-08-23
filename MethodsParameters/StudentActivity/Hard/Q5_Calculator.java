public class Q5_Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("Add = " + add(x, y));
        System.out.println("Subtract = " + subtract(x, y));
        System.out.println("Multiply = " + multiply(x, y));
        System.out.println("Divide = " + divide(x, y));
    }
}
