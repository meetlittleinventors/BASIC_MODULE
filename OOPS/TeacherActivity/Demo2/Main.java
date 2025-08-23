class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  // object created
        s1.name = "Rahul";  
        s1.age = 20;
        s1.display();  // calling method
    }
}
