public class HollowSquare {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == 1 || r == n || c == 1 || c == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // two spaces to keep alignment
                }
            }
            System.out.println();
        }
    }
}
