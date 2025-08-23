class LibraryBook {
    String title;
    String author;
    boolean isAvailable = true;

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook();
        b1.title = "Java Basics";
        b1.author = "James Gosling";

        LibraryBook b2 = new LibraryBook();
        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";

        // Initial status
        b1.displayInfo();
        b2.displayInfo();

        // Borrow & return actions
        b1.borrowBook();
        b1.displayInfo();

        b1.returnBook();
        b1.displayInfo();

        b2.borrowBook();
        b2.borrowBook();  // trying twice
        b2.displayInfo();
    }
}
