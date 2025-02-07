package past_years.WIX1002_2025;

public class Q3 {
    public static void main(String[] args) {
        LibraryMaterial library = new LibraryMaterial("The Greate Gastby", "F. Scott Fitzgeraid");
        DVD dvd = new DVD("Incepetion", "Chirstopher Nolan", 100);
        Magazine magazine = new Magazine("National Geographic", "Various author");

        library.borrow();
        library.borrow();
        dvd.borrow();
        dvd.borrow();
        magazine.borrow();
    }
}

class LibraryMaterial {
    String itemTitle;
    String author;
    boolean available;
    int dueDate;

    public LibraryMaterial(String itemTitle, String author) {
        this.itemTitle = itemTitle;
        this.author = author;
        this.available = true;
        this.dueDate = 14;
    }

    public void borrow() {
        if (this.available) {
            available = false;
            System.out.printf("Material borrowed successfully\n");
            System.out.printf("Due date for return: [Today's Date + %dDays]\n", this.dueDate);
            System.out.printf(
                    "The item %s by %s is successfully borrowed and should be returned by [Today's Date + %dDays]\n",
                    this.itemTitle, this.author, this.dueDate);
        } else {
            System.out.printf(
                    "The item %s by %s is currently unavailable and should be available after [Today's Date + %dDays]\n\n",
                    this.itemTitle, this.author, this.dueDate);
        }
    }
}

class DVD extends LibraryMaterial {
    int duration;

    public DVD(String itemTitle, String author, int duration) {
        super(itemTitle, author);
        super.dueDate = 5;
        this.duration = duration;
    }

    @Override
    public void borrow() {
        if (this.available) {
            super.available = false;
            System.out.printf("DVD borrowed successfully\n");
            System.out.printf("Due date for return: [Today's Date + %d Days]\n", this.dueDate);
            System.out.printf(
                    "The item %s by %s is successfully borrowed and should be returned by [Today's Date + %dDays]\n",
                    this.itemTitle, this.author, this.dueDate);
        } else {
            System.out.printf(
                    "The item %s by %s is currently unavailable and should be available after [Today's Date + %dDays]\n\n",
                    this.itemTitle, this.author, this.dueDate);
        }
    }
}

class Magazine extends LibraryMaterial {

    public Magazine(String itemTitle, String author) {
        super(itemTitle, author);
        super.dueDate = -1;
        super.available = false;
    }

    @Override
    public void borrow() {
        System.out.printf("Magazine cannot be borrowed\n");
    }
}
