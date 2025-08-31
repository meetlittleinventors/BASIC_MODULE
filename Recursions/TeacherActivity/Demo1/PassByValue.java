class PassByValue {
    static void increment(int x) {
        x = x + 10;
        System.out.println("Inside method: x = " + x);
    }

    public static void main(String[] args) {
        int num = 20;
        System.out.println("Before method: num = " + num);
        increment(num);
        System.out.println("After method: num = " + num);
    }
}
