class BankAccount {
    double balance;

    // deposit method
    double deposit(double amount) {
        balance += amount;
        return balance;
    }

    // withdraw method
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
        // Creating an object of BankAccount
        BankAccount acc1 = new BankAccount();

        // Calling methods using the object
        System.out.println("Initial Balance: " + acc1.balance);
        System.out.println("After Deposit: " + acc1.deposit(5000));
        System.out.println("After Withdraw: " + acc1.withdraw(2000));
        System.out.println("After Withdraw: " + acc1.withdraw(4000));
    }
}
