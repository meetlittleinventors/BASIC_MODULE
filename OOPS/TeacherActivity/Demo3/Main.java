class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";  
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Anita";
        s2.age = 19;

        s1.display();
        s2.display();
    }
}
