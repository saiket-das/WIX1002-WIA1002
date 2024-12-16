package viva.viva_2;

import java.util.Scanner;
import java.util.ArrayList;

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display details
    void display() {
        System.out.println("Book Details: " + title + " by " + author);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add a Book");
            System.out.println("2. View Book Details");
            System.out.println("3. View All Books");
            System.out.println("4. Exit");
            System.out.print("Choice of action: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    books.add(new Book(title, author));
                    System.out.println("Book added!\n");
                    break;
                case 2:
                    System.out.print("Enter Book Title: ");
                    String searchTitle = scanner.nextLine();
                    boolean found = false;
                    for (Book book : books) {
                        if (book.title.equalsIgnoreCase(searchTitle)) {
                            book.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found)
                        System.out.println("Book not found.");
                    break;
                case 3:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("All Books:");
                        for (Book book : books) {
                            book.display();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Program Ending...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
