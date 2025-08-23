public class FibonacciDemo {
    static int fib(int n) {
        if (n <= 1) return n;           // base case
        return fib(n - 1) + fib(n - 2); // recursive case
    }

    public static void main(String[] args) {
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
