public class MiddleWord {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ", firstSpace + 1);
        
        String middleWord = sentence.substring(firstSpace + 1, secondSpace);
        System.out.println("Middle word: " + middleWord);
    }
}
