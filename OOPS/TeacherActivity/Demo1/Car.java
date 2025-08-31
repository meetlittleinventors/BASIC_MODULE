class Car {
    String color;
    String model;

    void drive() {
        System.out.println(color + " " + model + " is driving.");
    }

    void brake() {
        System.out.println(color + " " + model + " has stopped.");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Red";
        car1.model = "Honda";

        Car car2 = new Car();
        car2.color = "Blue";
        car2.model = "Tesla";

        car1.drive();
        car2.drive();
        car1.brake();
    }
}
