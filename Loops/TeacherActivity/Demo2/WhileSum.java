public class WhileSum {
    public static void main(String[] args) {
        int n = 5, i = 1, sum = 0;
        while (i <= n) {
            sum += i;          // sum = sum + i
            i++;               // update
        }
        System.out.println("Sum = " + sum);
    }
}
