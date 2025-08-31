class Demo2 {
    static void updateArray(int[] arr) {
        arr[0] = 99;
        System.out.println("Inside updateArray(): arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println("Before updateArray(): arr[0] = " + nums[0]);
        updateArray(nums);
        System.out.println("After updateArray(): arr[0] = " + nums[0]);
    }
}
