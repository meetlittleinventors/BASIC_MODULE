class Rectangle {
    int length, width;

    int area() {
        return length * width;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.width = 5;
        System.out.println("Area = " + r1.area());
    }
}
