public class EmailDomain {
    public static void main(String[] args) {
        String email = "student123@gmail.com";
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Domain: " + domain);
    }
}
