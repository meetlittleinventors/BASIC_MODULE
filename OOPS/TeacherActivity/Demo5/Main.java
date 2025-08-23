class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s3 = new Student();  // no values assigned
        s3.display();                // default values
    }
}
