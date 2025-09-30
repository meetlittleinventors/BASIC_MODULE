class BankAccount {
    double balance;

    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println("After Deposit: " + acc.deposit(5000));
        System.out.println("After Withdraw: " + acc.withdraw(2000));
        System.out.println("After Withdraw: " + acc.withdraw(4000));
    }
}
