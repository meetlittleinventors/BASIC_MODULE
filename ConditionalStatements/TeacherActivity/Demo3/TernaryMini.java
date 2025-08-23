public class TernaryMini {
    public static void main(String[] args) {
        int age = 17; // try 18
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status); // 17 → Minor, 18 → Adult
    }
}
