package WIX1002_2024;

public class Q2 {
    public static void main(String[] args) {

        // Question (a)
        Q2_a();

        // Question (b)
        Q2_b();

        // Question (c)
        Q2_c();
    }

    // Question 2 - a
    public static void Q2_a() {
        Book myBook = new Book("Book title", "Me", "2024");
        System.out.println("Book's title: " + myBook.getTitle());
        System.out.println("Book's author: " + myBook.getAuthor());
        System.out.println("Book's published year: " + myBook.getYearPublished());
    }

    public static class Book {
        private String title;
        private String author;
        private String yearPublished;

        public Book(String title, String author, String yearPublished) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        // Getter method
        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getYearPublished() {
            return this.yearPublished;
        }
    }

    // Question 2 - b
    public static void Q2_b() {
        System.out.println();
        try {
            checkAge(18);
        } catch (InvalidAgeException error) {
            System.out.println(error.getMessage());
        }
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String errorMessage) {
            super(errorMessage);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are below 18");
        } else {
            System.out.println("You are welcome to vote.");
        }
    }

    // Question 2 - c
    public static void Q2_c() {
        Playable[] playables = {
                new Guitar(),
                new Piano(),
        };
        System.out.println();
        for (Playable playable : playables) {
            playable.play();
        }
    }

    interface Playable {
        void play();
    }

    public static class Guitar implements Playable {
        @Override
        public void play() {
            System.out.println("Guitar is playing...");
        }
    }

    public static class Piano implements Playable {
        @Override
        public void play() {
            System.out.println("Piano is playing...");
        }
    }

}
