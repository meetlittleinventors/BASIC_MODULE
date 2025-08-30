public class Q5 {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};

        System.out.println("Jagged Array Elements:");
        for(int i = 0; i < jagged.length; i++) {
            for(int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        // Bonus: sum of each row
        System.out.println("\nSum of each row:");
        for(int i = 0; i < jagged.length; i++) {
            int sum = 0;
            for(int j = 0; j < jagged[i].length; j++) {
                sum += jagged[i][j];
            }
            System.out.println("Row " + (i+1) + " sum: " + sum);
        }
    }
}
