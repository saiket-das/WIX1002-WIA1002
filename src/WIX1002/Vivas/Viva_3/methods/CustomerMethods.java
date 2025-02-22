package WIX1002.Vivas.Viva_3.methods;

import java.util.Scanner;

import WIX1002.Vivas.Viva_3.classes.Classes.Bank;
import WIX1002.Vivas.Viva_3.classes.Classes.BankAccount;
import WIX1002.Vivas.Viva_3.classes.Classes.Customer;

public class CustomerMethods {
    static Scanner sc = new Scanner(System.in);

    // Customer function
    // Add new customer function
    public static void addNewCustomer(Bank bank) {
        // Generate customer ID
        System.out.println("----------------------");
        System.out.println("Ada a new customer");
        System.out.print("Enter the customer's name: ");

        // Create a new customer
        String customerName = sc.nextLine();
        String customerId = bank.generateCustomerId();
        Customer newCustomer = new Customer(customerId, customerName);
        bank.AddCustomer(newCustomer);

        // Create a new account for that new customer
        String accountId = newCustomer.generateAccountId();
        BankAccount newBankAccount = new BankAccount(accountId, customerName);
        newCustomer.addAccount(newBankAccount);

        System.out.printf(
                "Opend a savings account for (%s - %s) with account number (%s) and an initial deposit of $500. %n",
                newCustomer.getName(), newCustomer.getCustomerId(), newBankAccount.getAccountNumber());
        System.out.println("----------------------");

    }

    // Get a customer by customer ID fucntion
    public static void findCustomerByID(Bank bank) {
        System.out.println("----------------------");
        System.out.println("Find a customer by ID");
        System.out.print("Enter the customer's ID: ");
        String customerIdToFind = sc.nextLine();
        Customer customer = bank.getCustomer(customerIdToFind);

        if (customer != null) {
            System.out.println("Customer found: " + customer.getName());
        } else {
            System.out.printf("Customer with ID (%s) not found. %n", customerIdToFind);
        }
        System.out.println("----------------------");

    }

    // Print all customer details
    public static void printAllCustomers(Bank bank) {
        System.out.println("----------------------");
        bank.displayAllCustomers();
        System.out.println("----------------------");

    }

}
