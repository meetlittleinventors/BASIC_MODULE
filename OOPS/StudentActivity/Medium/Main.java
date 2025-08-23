class Book {
    String title, author;
    double price;

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Basics";
        b1.author = "James Gosling";
        b1.price = 499.99;

        Book b2 = new Book();
        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";
        b2.price = 899.99;

        b1.displayDetails();
        b2.displayDetails();
    }
}
