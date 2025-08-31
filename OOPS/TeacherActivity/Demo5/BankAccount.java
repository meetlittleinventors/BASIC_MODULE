class BankAccount {
    int balance;

    BankAccount(int initial) {
        balance = initial;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }

    int getBalance() {
        return balance;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
