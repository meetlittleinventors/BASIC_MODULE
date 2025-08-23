public class ATMSimulator {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 2000; // try different values

        if (withdrawal <= 0) {
            System.out.println("Invalid Amount");
        } else if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
