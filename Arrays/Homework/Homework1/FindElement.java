public class FindElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int num = 30;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
