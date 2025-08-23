public class StudentMarksAnalysis {
    public static void main(String[] args) {
        int[] marks = {76, 89, 54, 92, 68};
        int sum = 0, min = marks[0], max = marks[0];

        for (int mark : marks) {
            sum += mark;
            if (mark < min) min = mark;
            if (mark > max) max = mark;
        }

        double avg = sum / (double) marks.length;

        System.out.println("Total = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Highest = " + max);
        System.out.println("Lowest = " + min);
    }
}
