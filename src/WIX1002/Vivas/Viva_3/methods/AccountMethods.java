package WIX1002.Vivas.Viva_3.methods;

import java.util.Scanner;

import WIX1002.Vivas.Viva_3.classes.Classes.BankAccount;
import WIX1002.Vivas.Viva_3.classes.Classes.Customer;

public class AccountMethods {
    static Scanner sc = new Scanner(System.in);

    // Deposit money from account
    public static void depositMoney(BankAccount account) {
        System.out.println("----------------------");
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        } else {
            // Deposit money into the account
            account.deposit(amount);
            double currentBalance = account.getBalance();
            // Print deposit success message and the updated balance
            System.out.printf("Deposited: %.2f on (%s) account %n", amount, account.getAccountNumber());
            System.out.printf("Current balance: %.2f%n", currentBalance);
        }
        System.out.println("----------------------");
    }

    // Withdraw money from account
    public static void withdrawMoney(BankAccount account) {
        System.out.println("----------------------");
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("Withdraw amount must be greater than zero.");
        }
        // Withdraw money into the account
        else {
            boolean withdrawn = account.withdraw(amount);
            if (withdrawn == false) {
                System.out.println("Insufficient balance. Cannot withdraw this amount.");
            } else {
                double currentBalance = account.getBalance();
                // Print deposit success message and the updated balance
                System.out.printf("Withdrawn: %.2f from (%s) account %n", amount, account.getAccountNumber());
                System.out.printf("Current balance: %.2f%n", currentBalance);
            }
        }
        System.out.println("----------------------");
    }

    // Get current balance
    public static void getCurrentBalance(BankAccount account) {
        System.out.println("----------------------");
        System.out.println("Current balance: $" + account.getBalance());
        System.out.println("----------------------");
    }

    // Create a new bank account for specifc customer
    public static void createNewBankAccount(Customer customer) {
        String accountId = customer.generateAccountId();
        BankAccount newBankAccount = new BankAccount(accountId, customer.getName());
        customer.addAccount(newBankAccount);
        System.out.printf(
                "Opend a savings account for (%s) with account number (%s) and an initial deposit of $500. %n",
                customer.getName(), newBankAccount.getAccountNumber());
    }

    // Print account details
    public static void accountDetails(BankAccount account) {
        account.accountDetails();
    }

}
