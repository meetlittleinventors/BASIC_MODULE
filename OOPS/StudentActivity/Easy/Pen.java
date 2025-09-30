class Pen {
    String color;
    String brand;

    void write() {
        System.out.println(brand + " pen of " + color + " color is writing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.brand = "Reynolds";

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.brand = "Parker";

        p1.write();
        p2.write();
    }
}
