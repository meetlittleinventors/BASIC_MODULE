class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Student: " + name + ", Age: " + age);
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student("Priya", 22);
        Student s3 = new Student("Amit", 19);

        s1.display();
        s2.display();
        s3.display();
    }
}
