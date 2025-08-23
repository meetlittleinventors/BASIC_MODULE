public class Demo5A {
    static void swap(int a, int b){
        int t = a; a = b; b = t;
    }
    public static void main(String[] args) {
        int p = 10, q = 20;
        swap(p, q);
        System.out.println("p=" + p + ", q=" + q);
    }
}
