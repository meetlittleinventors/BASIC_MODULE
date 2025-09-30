class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;

        Student s3 = new Student();
        s3.name = "Charlie";
        s3.age = 19;

        s1.display();
        s2.display();
        s3.display();
    }
}
