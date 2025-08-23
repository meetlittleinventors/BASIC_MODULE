public class ReportCard {
    public static void main(String[] args) {
        String name = "Riya";
        int rollNo = 12;
        double mark1 = 78.5, mark2 = 82.0, mark3 = 90.5;

        double average = (mark1 + mark2 + mark3) / 3;
        boolean passed = (average >= 40);

        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Passed? " + passed);
    }
}
