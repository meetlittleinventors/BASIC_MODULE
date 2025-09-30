class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Book: " + title + " | Author: " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Easy", "Guido");

        b1.display();
        b2.display();
    }
}
