class Pen {
    String color;
    double price;

    void display() {
        System.out.println("Pen Color: " + color + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.price = 10.5;
        p1.display();
    }
}
