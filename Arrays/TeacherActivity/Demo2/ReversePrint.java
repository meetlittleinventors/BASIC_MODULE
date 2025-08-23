public class ReversePrint {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
