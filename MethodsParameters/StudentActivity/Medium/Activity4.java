class Activity4 {
    static void updateAll(int[] arr, int add) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += add;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Before update:");
        for (int n : nums) System.out.print(n + " ");

        updateAll(nums, 5);

        System.out.println("\nAfter update:");
        for (int n : nums) System.out.print(n + " ");
    }
}
