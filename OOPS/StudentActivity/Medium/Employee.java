class Employee {
    int id;
    String name;
    double salary;

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "John";
        e1.salary = 50000;

        Employee e2 = new Employee();
        e2.id = 102;
        e2.name = "Sara";
        e2.salary = 60000;

        e1.displayDetails();
        e2.displayDetails();
    }
}
