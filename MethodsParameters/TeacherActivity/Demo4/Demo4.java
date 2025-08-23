public class Demo4 {
    static int square(int n){ return n*n; }  
    static void squareInPlace(int[] a, int i){ a[i] = a[i]*a[i]; }  

    public static void main(String[] args) {
        int x = 4;
        int y = square(x);
        System.out.println("x=" + x + ", y=" + y);

        int[] arr = {2,3,4};
        squareInPlace(arr, 1);
        for (int v : arr) System.out.print(v + " ");
    }
}
