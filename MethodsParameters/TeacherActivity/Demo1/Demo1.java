public class Demo1 {
    static void increment(int x) { x = x + 1; }
    public static void main(String[] args) {
        int a = 5;
        increment(a);
        System.out.println("a = " + a);
    }
}
