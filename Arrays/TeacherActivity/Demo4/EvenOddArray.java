public class EvenOddArray {
    public static void main(String[] args) {
        int[] data = {5, 8, 13, 6, 2};
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0)
                System.out.print(data[i] + "E ");
            else
                System.out.print(data[i] + "O ");
        }
    }
}
