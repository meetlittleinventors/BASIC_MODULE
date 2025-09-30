class Rectangle {
    int area(int length, int width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Area of Rectangle 1: " + r1.area(10, 5));
        System.out.println("Area of Rectangle 2: " + r2.area(7, 4));
    }
}
