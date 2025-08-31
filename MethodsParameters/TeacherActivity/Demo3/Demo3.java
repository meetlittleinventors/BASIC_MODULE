class Demo3 {
    static void show(int x) {
        System.out.println("show(int): " + x);
    }

    static void show(String text) {
        System.out.println("show(String): " + text);
    }

    public static void main(String[] args) {
        show(10);
        show("Java");
    }
}
