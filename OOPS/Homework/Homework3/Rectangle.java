class Rectangle {
    int area(int l, int w) {
        return l * w;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Area of Rectangle 1: " + r1.area(5, 3));
        System.out.println("Area of Rectangle 2: " + r2.area(10, 4));
    }
}
