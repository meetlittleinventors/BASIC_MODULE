public class BreakContinueDemo {
    public static void main(String[] args) {
        // break: stop when i == 4 → prints 0,1,2,3
        for (int i = 0; i < 10; i++) {
            if (i == 4) break;
            System.out.print(i + " ");
        }
        System.out.println();

        // continue: skip i == 4 → prints 0 1 2 3 5 6 7 8 9
        for (int i = 0; i < 10; i++) {
            if (i == 4) continue;
            System.out.print(i + " ");
        }
    }
}
