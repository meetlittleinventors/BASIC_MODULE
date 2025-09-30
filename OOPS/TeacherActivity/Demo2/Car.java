class Car {
    String color;
    String model;

    Car(String c, String m) {
        color = c;
        model = m;
    }

    void display() {
        System.out.println("Car: " + color + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Honda");
        Car car2 = new Car("Blue", "Toyota");

        car1.display();
        car2.display();
    }
}
