public class HardQ5 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 40};
        int target = 50;
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
