public class SumDigits {
    static int sumDigits(int n) {
        if (n == 0) return 0;            // base case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }
}
