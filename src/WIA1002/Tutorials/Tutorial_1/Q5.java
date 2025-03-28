package WIA1002.Tutorials.Tutorial_1;

public class Q5 {
    public static void main(String[] agrs) {
        BankAccount myAccount = new BankAccount(100);

        myAccount.deposit(100);
        myAccount.withdraw(300);
    }

    // Account interface
    interface Account {
        int deposit(int amount);

        boolean withdraw(int amount);
    }

    // Bank Account class
    static class BankAccount implements Account {
        private int balance;

        BankAccount(int initialBalance) {
            if (initialBalance < 100) {
                throw new IllegalArgumentException("Error: Initial balance must be at least 100");
            }
            this.balance = initialBalance;
        }

        // Accessor
        int getBalance() {
            return this.balance;
        }

        @Override
        public int deposit(int amount) {
            if (amount > 0) {
                this.balance += amount;

            }
            return balance;
        }

        @Override
        public boolean withdraw(int amount) {
            if (amount > balance) {
                System.err.println("Current balance: " + this.getBalance());
                System.err.println("Error: Insufficient Balance");
                return false;
            }
            balance -= amount;
            return true;
        }
    }
}
