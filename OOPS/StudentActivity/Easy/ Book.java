class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}

public class StudentDemo2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");

        b1.display();
        b2.display();
    }
}
