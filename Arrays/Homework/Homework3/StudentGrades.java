public class StudentGrades {
    public static void main(String[] args) {
        int[] marks = {50, 70, 80, 90, 40};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double avg = sum / (double) marks.length;
        int above = 0, below = 0;

        for (int mark : marks) {
            if (mark > avg) above++;
            else if (mark < avg) below++;
        }

        System.out.println("Average = " + avg);
        System.out.println("Above Average = " + above);
        System.out.println("Below Average = " + below);
    }
}
