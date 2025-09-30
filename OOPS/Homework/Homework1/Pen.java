class Pen {
    String color;
    String brand;

    void write() {
        System.out.println("Writing with " + brand + " " + color + " pen");
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();      // create object 1
        p1.color = "Blue";
        p1.brand = "Parker";
        p1.write();              // call method

        Pen p2 = new Pen();      // create object 2
        p2.color = "Black";
        p2.brand = "Cello";
        p2.write();              // call method
    }
}
