public class EasyQ2 {
    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 45};
        arr[1] = 100; // update 2nd element

        System.out.print("Updated Array: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
