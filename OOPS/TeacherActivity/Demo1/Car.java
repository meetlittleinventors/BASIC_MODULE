class Car {
    String color;
    String model;

    void drive() {
        System.out.println(color + " " + model + " is driving...");
    }

    void brake() {
        System.out.println(color + " " + model + " is braking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Honda";
        car1.drive();
        car1.brake();

        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "Toyota";
        car2.drive();
        car2.brake();
    }
}
