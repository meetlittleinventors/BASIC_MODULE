class SumArray {
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        int result = sumArray(nums);
        System.out.println("Sum of array elements = " + result);
    }
}
