public class Q1_PassByValue {
    static void increment(int n) {
        n = n + 1;
        System.out.println("Inside method: n = " + n);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before method call: x = " + x);
        increment(x);
        System.out.println("After method call: x = " + x);
    }
}
