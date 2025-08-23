public class Q3_ArraySumAverage {
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        System.out.println("Sum = " + sumArray(numbers));
        System.out.println("Average = " + averageArray(numbers));
    }
}
