class Employee {
    String name;
    int salary;

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

public class StudentDemo4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan", 30000);
        Employee e2 = new Employee("Meera", 40000);
        Employee e3 = new Employee("Kunal", 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}
