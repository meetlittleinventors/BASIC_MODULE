class Circle {
    double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("Area of Circle 1: " + c1.getArea(5));
        System.out.println("Area of Circle 2: " + c2.getArea(7));
    }
}
