class Demo5 {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap(): a = " + a + ", b = " + b);
    }

    static void swapArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("Inside swapArray(): arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
    }

    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println("Before swap(): x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap(): x = " + x + ", y = " + y);

        int[] nums = {5, 10};
        System.out.println("\nBefore swapArray(): arr[0] = " + nums[0] + ", arr[1] = " + nums[1]);
        swapArray(nums);
        System.out.println("After swapArray(): arr[0] = " + nums[0] + ", arr[1] = " + nums[1]);
    }
}
