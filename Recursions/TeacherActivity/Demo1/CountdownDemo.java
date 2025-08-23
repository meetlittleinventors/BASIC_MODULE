public class CountdownDemo {
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blast Off!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        countdown(5);
    }
}
