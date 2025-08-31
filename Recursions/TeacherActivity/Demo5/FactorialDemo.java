class FactorialDemo {
    static int factorial(int n) {
        if (n == 1) return 1;  // base case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }
}
