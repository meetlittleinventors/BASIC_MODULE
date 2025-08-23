public class PalindromeDemo {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true;                 // base case
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1);    // recursive step
    }

    public static void main(String[] args) {
        System.out.println("madam → " + isPalindrome("madam", 0, 4));
        System.out.println("hello → " + isPalindrome("hello", 0, 4));
    }
}
