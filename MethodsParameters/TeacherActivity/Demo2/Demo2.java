public class Demo2 {
    static void addBonus(int[] marks) {
        for (int i = 0; i < marks.length; i++) marks[i] += 5;
    }
    public static void main(String[] args) {
        int[] m = {70, 80, 90};
        addBonus(m);
        for (int x : m) System.out.print(x + " ");
    }
}
