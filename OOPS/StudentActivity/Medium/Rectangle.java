class Rectangle {
    int area(int length, int width) {
        return length * width;
    }
}

public class StudentDemo3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        int a1 = rect.area(10, 5);
        int a2 = rect.area(7, 3);

        System.out.println("Area 1 = " + a1);
        System.out.println("Area 2 = " + a2);
    }
}
