public class Q4_UpdateArray {
    static void addBonus(int[] marks, int bonus) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] marks = {70, 80, 90};
        System.out.println("Before bonus:");
        for (int m : marks) System.out.print(m + " ");

        addBonus(marks, 5);

        System.out.println("\nAfter bonus:");
        for (int m : marks) System.out.print(m + " ");
    }
}
