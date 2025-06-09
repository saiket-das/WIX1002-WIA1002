package WIA1002.Labs.Lab_6_Queue.Priority_Queue;

import java.util.*;

/* -- Write the code for ComparableBook class using Comparable. -- */
public class Q3 {

    public static void main(String[] agrs) {
        Queue<ComparableBook> BookQueue = new PriorityQueue<>();
        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));

        // System.out.println(BookQueue);

        while (BookQueue.peek() != null) {
            System.out.println("Head Element: " + BookQueue.peek().publicationYear);
            BookQueue.remove();
            System.out.println("Priority queue: " + BookQueue);
            System.out.println();
        }
    }

    static class Book {
        int publicationYear;
        String title;

        Book(int publicationYear, String bookName) {
            this.publicationYear = publicationYear;
            this.title = bookName;
        }

        @Override
        public String toString() {
            return title + " (" + publicationYear + ")";
        }
    }

    static class ComparableBook extends Book implements Comparable<Book> {

        public ComparableBook(int publicationYear, String title) {
            super(publicationYear, title);
        }

        @Override
        public int compareTo(Book book2) {
            return Integer.compare(this.publicationYear, book2.publicationYear);
        }

    }

}
