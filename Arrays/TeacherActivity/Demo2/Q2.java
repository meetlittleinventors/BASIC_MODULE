public class Q2 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45};
        arr[1] = 100; // Update 2nd element

        System.out.println("Updated Array:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
