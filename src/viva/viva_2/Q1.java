package viva.viva_2;

import java.util.*;

public class Q1 {
    private static double balance = 0;
    private static double depositTransactions = 0;
    private static double withdrawTransactions = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double amountDeposit, amountWithdraw;
        System.out.print("Welcome to the Bank!");
        while (true) {
            System.out.println();
            System.out.print("""
                    1. Check Balance
                    2. Deposit Money
                    3. Withdraw Money
                    4. View Transaction History
                    5. Exit
                    """);

            System.out.print("Choose an option: ");
            int bankOperation = keyboard.nextInt();
            if (bankOperation == 1) {
                checkBalance();
            } else if (bankOperation == 2) {
                System.out.print("Enter amount to deposit: RM");
                amountDeposit = keyboard.nextDouble();
                deposit(amountDeposit);
            } else if (bankOperation == 3) {
                System.out.print("Enter amount to withdraw: RM");
                amountWithdraw = keyboard.nextDouble();
                withdraw(amountWithdraw);
            } else if (bankOperation == 4) {
                printTransactions();
            } else if (bankOperation == 5) {
                System.out.println("Thank you for using our banking system!");
                System.out.printf("Your final balance is: RM%.2f", balance);
                break;
            } else {
                System.out.println("Invalid option. Please reenter your option.");
            }
        }

        keyboard.close();
    }

    // Function to check balance
    public static void checkBalance() {
        System.out.printf("Current balance: RM%.2f\n", balance);
    }

    // Function to deposit amount
    public static double deposit(double amount) {
        balance += amount;
        depositTransactions += amount;
        System.out.printf("Your balance is now: RM%.2f\n", balance);
        return depositTransactions;
    }

    // Function to withdraw money
    public static double withdraw(double amount) {
        balance -= amount;
        withdrawTransactions += amount;
        System.out.printf("Your balance is now: RM%.2f\n", balance);
        return withdrawTransactions;
    }

    // Function to check transactions
    public static void printTransactions() {
        System.out.println("Transaction History:");
        System.out.printf("Deposited: RM%.2f\n", depositTransactions);
        System.out.printf("Withdrawn: RM%.2f\n", withdrawTransactions);
    }
}
