class FibonacciRecursion {
    static int fibonacci(int n) {
        if (n <= 1) return n; // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int terms = 6;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
