public class StudentReportCard {
    
    static int totalMarks(int[] marks) {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }

    static double average(int[] marks) {
        return (double) totalMarks(marks) / marks.length;
    }

    static String grade(double avg) {
        if (avg >= 80) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "Fail";
    }

    static void displayResult(String name, int[] marks) {
        System.out.println("Student: " + name);
        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println();
        int total = totalMarks(marks);
        double avg = average(marks);
        String g = grade(avg);
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + g);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        int[] marks1 = {60, 70, 80};
        int[] marks2 = {30, 40, 35};
        displayResult("Alice", marks1);
        displayResult("Bob", marks2);
    }
}
