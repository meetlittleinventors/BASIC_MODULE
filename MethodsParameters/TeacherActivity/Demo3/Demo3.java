public class Demo3 {
    static void printSum(int a, int b){ System.out.println("int: " + (a+b)); }
    static void printSum(double a, double b){ System.out.println("double: " + (a+b)); }

    public static void main(String[] args) {
        printSum(2, 3);
        printSum(2.0, 3.0);
        printSum(2, 3.5);
    }
}
