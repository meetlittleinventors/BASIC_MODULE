class PassByValueDouble {
    static void square(double x) {
        x = x * x;
        System.out.println("Inside method: x = " + x);
    }

    public static void main(String[] args) {
        double num = 4.0;
        System.out.println("Before method: num = " + num);
        square(num);
        System.out.println("After method: num = " + num);
    }
}
