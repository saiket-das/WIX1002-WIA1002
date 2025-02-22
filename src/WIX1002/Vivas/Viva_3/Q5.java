package WIX1002.Vivas.Viva_3;

import java.util.Scanner;

import WIX1002.Vivas.Viva_3.classes.Classes.*;
import WIX1002.Vivas.Viva_3.methods.AccountMethods;
import WIX1002.Vivas.Viva_3.methods.CustomerMethods;

public class Q5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Create a bank
        Bank bank = new Bank("My bank");
        System.out.printf("Welcome to %s %n", bank.getBankName());

        bankOptions: while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Customer");
            System.out.println("2. Account");
            System.out.println("0. Exit\n");

            System.out.print("Choose: ");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                // Customer options
                case 1:
                    customerOptions: while (true) {
                        System.out.println("\n----------------------");
                        System.out.println("Bank");
                        System.out.println("Choose an option:");
                        System.out.println("1. Add a new customer");
                        System.out.println("2. Find a customer");
                        System.out.println("3. Print all customers");
                        System.out.println("4. Back to bank option\n");

                        System.out.print("Choose: ");
                        int customerChoose = sc.nextInt();
                        sc.nextLine();
                        switch (customerChoose) {
                            case 1:
                                CustomerMethods.addNewCustomer(bank);
                                continue customerOptions;
                            case 2:
                                CustomerMethods.findCustomerByID(bank);
                                continue customerOptions;
                            case 3:
                                CustomerMethods.printAllCustomers(bank);
                                continue customerOptions;
                            case 4:
                                continue bankOptions;

                            default:
                                break;
                        }
                        continue customerOptions;
                    }

                case 2:
                    account: while (true) {
                        // Customer ID input
                        System.out.print("Enter your customer ID: ");
                        String customerID = sc.nextLine();
                        Customer customer = bank.getCustomer(customerID); // Verify customer
                        if (customer != null) {
                            // Account number input
                            accountReinput: while (true) {
                                System.out.print("Enter your account number: ");
                                String accountNumber = sc.nextLine();
                                BankAccount bankAccount = customer.getBankAccountDetails(accountNumber); // Verify
                                // account
                                if (bankAccount == null) {
                                    System.out.println("Account number is invalid. Please try again.");
                                    continue accountReinput;
                                } else {
                                    accountOptions: while (true) {
                                        System.out.println("\n----------------------");
                                        System.out.println("Customer");
                                        System.out.println("Choose an option:");
                                        System.out.println("1. Deposit money");
                                        System.out.println("2. Withdraw money");
                                        System.out.println("3. Get current balance");
                                        System.out.println("4. Create new bank account");
                                        System.out.println("5. Account details");
                                        System.out.println("6. Back to bank option\n");

                                        System.out.print("Choose: ");
                                        int customerChoose = sc.nextInt();
                                        sc.nextLine();
                                        switch (customerChoose) {
                                            case 1:
                                                AccountMethods.depositMoney(bankAccount);
                                                continue accountOptions;
                                            case 2:
                                                AccountMethods.withdrawMoney(bankAccount);
                                                continue accountOptions;
                                            case 3:
                                                AccountMethods.getCurrentBalance(bankAccount);

                                                continue accountOptions;
                                            case 4:
                                                AccountMethods.createNewBankAccount(customer);
                                                continue accountOptions;
                                            case 5:
                                                AccountMethods.accountDetails(bankAccount);
                                                continue accountOptions;

                                            case 6:
                                                continue bankOptions;
                                            default:
                                                break;
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.printf("Customer with ID (%s) not found. %n", customerID);
                            continue account;
                        }
                    }
                case 0:
                    break;
                default:
                    break;
            }
            break;
        }

    }

}
