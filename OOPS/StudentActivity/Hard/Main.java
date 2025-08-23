class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 12345;
        acc.holderName = "Rahul";
        acc.balance = 1000;

        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000); // should show insufficient
        acc.displayBalance();
    }
}
