public class FactorialDemo {
    static int factorial(int n) {
        if (n == 1) return 1;         // base case
        return n * factorial(n - 1);  // recursive case
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
    }
}
