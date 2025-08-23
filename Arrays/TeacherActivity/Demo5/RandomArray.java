public class RandomArray {
    public static void main(String[] args) {
        int[] r = new int[3];
        for (int i = 0; i < r.length; i++) {
            r[i] = (int)(Math.random() * 10); // 0–9
            System.out.print(r[i] + " ");
        }
    }
}
