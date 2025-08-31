class UpdateLastElement {
    static void updateLast(int[] arr) {
        arr[arr.length - 1] = -1;
        System.out.println("Inside method: last element = " + arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};
        System.out.println("Before method: last element = " + nums[nums.length - 1]);
        updateLast(nums);
        System.out.println("After method: last element = " + nums[nums.length - 1]);
    }
}
