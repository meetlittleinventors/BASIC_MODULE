public class StudentDetails {
    public static void main(String[] args) {
        String name = "Aarav";
        int rollNo = 21;
        double mark1 = 78, mark2 = 85, mark3 = 90;

        double total = mark1 + mark2 + mark3;
        double percentage = (total / 300) * 100;

        System.out.println("----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
