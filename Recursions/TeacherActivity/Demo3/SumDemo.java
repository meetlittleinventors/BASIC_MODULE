public class SumDemo {
    static int sum(int n) {
        if (n == 0) return 0;      // base case
        return n + sum(n - 1);     // recursive case
    }

    public static void main(String[] args) {
        System.out.println("Sum of first 5 numbers = " + sum(5));
    }
}
