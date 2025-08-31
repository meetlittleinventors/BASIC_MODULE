class Circle {
    double getArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class StudentDemo5 {
    public static void main(String[] args) {
        Circle c = new Circle();

        double a1 = c.getArea(5.0);
        double a2 = c.getArea(7.2);

        System.out.println("Area of Circle 1 = " + a1);
        System.out.println("Area of Circle 2 = " + a2);
    }
}
