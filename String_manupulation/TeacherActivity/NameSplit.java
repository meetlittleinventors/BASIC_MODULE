public class NameSplit {
    public static void main(String[] args) {
        String fullName = "John Smith";
        String firstName = fullName.substring(0, 4);
        String lastName = fullName.substring(5);

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
