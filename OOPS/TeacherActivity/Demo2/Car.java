class Car {
    String color;
    String model;

    // Constructor
    Car(String c, String m) {
        color = c;
        model = m;
    }

    void showDetails() {
        System.out.println("Car: " + color + " " + model);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Honda");
        Car car2 = new Car("Blue", "Tesla");

        car1.showDetails();
        car2.showDetails();
    }
}
