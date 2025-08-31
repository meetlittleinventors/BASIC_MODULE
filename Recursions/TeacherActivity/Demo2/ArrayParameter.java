class ArrayParameter {
    static void updateArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside method: arr[0] = " + arr[0]);
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println("Before method: arr[0] = " + nums[0]);
        updateArray(nums);
        System.out.println("After method: arr[0] = " + nums[0]);
    }
}
