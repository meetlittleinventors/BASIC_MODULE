public class PowerFunction {
    static int power(int base, int exp) {
        if (exp == 0) return 1;          // base case
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }
}
