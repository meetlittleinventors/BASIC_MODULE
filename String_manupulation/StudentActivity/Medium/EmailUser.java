public class EmailUser {
    public static void main(String[] args) {
        String email = "rahul123@yahoo.com";
        String user = email.substring(0, email.indexOf("@"));
        System.out.println("Username: " + user);
    }
}
