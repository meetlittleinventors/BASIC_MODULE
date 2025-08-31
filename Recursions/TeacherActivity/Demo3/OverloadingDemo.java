class OverloadingDemo {
    static void display(int x) {
        System.out.println("Integer: " + x);
    }

    static void display(double y) {
        System.out.println("Double: " + y);
    }

    static void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        display(10);
        display(5.5);
        display("Hello");
    }
}
