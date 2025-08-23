public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) return 0;    // base case
        if (n == 1) return 1;    // base case
        return fib(n - 1) + fib(n - 2);  // recursive calls
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
