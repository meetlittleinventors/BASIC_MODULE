public class TeacherActivity {
    public static void main(String[] args) {
        // Primitive data types
        int age = 20;
        double marks = 85.6;
        char grade = 'A';
        boolean isPass = true;

        // Print variables
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed? " + isPass);

        // Implicit casting (int → double)
        double newMarks = age;  
        System.out.println("Implicit casting (int to double): " + newMarks);

        // Explicit casting (double → int)
        int intMarks = (int) marks;  
        System.out.println("Explicit casting (double to int): " + intMarks);
    }
}
