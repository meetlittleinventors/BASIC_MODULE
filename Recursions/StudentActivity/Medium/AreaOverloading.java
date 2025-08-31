class AreaOverloading {
    static int area(int side) {
        return side * side;
    }

    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Area of square (side=5): " + area(5));
        System.out.println("Area of rectangle (4x6): " + area(4, 6));
    }
}
