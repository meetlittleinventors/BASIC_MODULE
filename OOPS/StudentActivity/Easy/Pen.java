class Pen {
    String color;
    String brand;

    void write() {
        System.out.println(color + " " + brand + " pen is writing.");
    }
}

public class StudentDemo1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.brand = "Parker";

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.brand = "Reynolds";

        p1.write();
        p2.write();
    }
}
