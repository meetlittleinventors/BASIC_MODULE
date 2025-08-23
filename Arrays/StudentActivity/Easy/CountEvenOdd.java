public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 10, 13};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
