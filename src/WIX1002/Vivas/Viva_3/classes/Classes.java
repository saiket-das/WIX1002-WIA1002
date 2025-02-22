package WIX1002.Vivas.Viva_3.classes;

import java.util.*;

public class Classes {

    // Bank
    public static class Bank {
        String bankName;
        ArrayList<Customer> customers;

        public Bank(String bankName) {
            this.bankName = bankName;
            this.customers = new ArrayList<>();
        }

        public String getBankName() {
            return bankName;
        }

        // Add new Customer
        public void AddCustomer(Customer customer) {
            customers.add(customer);
        }

        // Get customer info by customer ID
        public Customer getCustomer(String customerId) {
            for (Customer customer : customers) {
                if (customer.getCustomerId().equals(customerId)) {
                    return customer;
                }
            }
            return null; // Return null if not found
        }

        // Get customer by customer ID
        public void displayAllCustomers() {
            if (this.customers.size() < 1) {
                System.out.println("No customer found");
            } else {
                System.out.println("Customer ID     Name");
                for (Customer customer : this.customers) {
                    System.out.printf("%-15s %-20s\n", customer.getCustomerId(), customer.getName());
                }
            }
        }

        // Generate a customer id (C001 -> C002 (next customer))
        public String generateCustomerId() {
            int totalCustomer = customers.size() + 1;
            return String.format("C%03d", totalCustomer); // Format as "C001", "C002", etc.
        }
    }

    // Customer
    public static class Customer {
        String customerId;
        String name;
        ArrayList<BankAccount> accounts;

        public Customer(String customerId, String name) {
            this.customerId = customerId;
            this.name = name;
            this.accounts = new ArrayList<>();
        }

        // Getters
        public String getCustomerId() {
            return this.customerId;
        }

        public String getName() {
            return this.name;
        }

        public void addAccount(BankAccount account) {
            accounts.add(account);
        }

        public BankAccount getBankAccountDetails(String accountNumber) {
            for (BankAccount account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    return account;
                }
            }
            return null; // Return null if not found

        }

        // Generate a account ID for new customer(C001) (A1001)
        // Generate a account ID for same customer(C002) (A2001 -> A2002 (another new
        // account))
        public String generateAccountId() {
            int accountNumber = accounts.size() + 1;
            String customerNumber = customerId.substring(1); // Get "001" from "C001"
            int customerNumberInt = Integer.parseInt(customerNumber); // Convert to integer, so "001" becomes 1
            String customerNumberStr = Integer.toString(customerNumberInt);
            return "A" + customerNumberStr + String.format("%03d", accountNumber);
        }
    }

    // Bank Account
    public static class BankAccount {
        String accountNumber;
        String accountHolderName;
        private double balance = 0.0;

        public BankAccount(String accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = 500;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAccountHolderName() {
            return this.accountHolderName;
        }

        public double getBalance() {
            return this.balance;
        }

        public void deposit(double amount) {
            this.balance += amount;
        }

        public boolean withdraw(double amount) {
            if (this.balance > amount) {
                this.balance -= amount;
                return true;
            } else {
                return false;
            }
        }

        public void accountDetails() {
            System.out.println("----------------------");
            System.out.println("Account ID      Current Balance");
            System.out.printf("%-15s %-20s %n", this.accountNumber, this.getBalance());
            System.out.println("----------------------");
        }
    }

}
