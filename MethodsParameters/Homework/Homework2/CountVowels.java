public class CountVowels {
    static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();   // to handle both uppercase & lowercase
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("hello → " + countVowels("hello"));
        System.out.println("JAVA → " + countVowels("JAVA"));
        System.out.println("Programming → " + countVowels("Programming"));
    }
}
