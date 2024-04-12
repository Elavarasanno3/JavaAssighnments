package assign11_04_2024arraylist;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    // Constructor
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // toString() method to represent the book
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Create ArrayList of Book
        ArrayList<Book> books = new ArrayList<>();

        // Adding books to the ArrayList
        addBook(books, new Book("Java", "James", 2000));
        addBook(books, new Book("Python", "thomas", 2010));
        addBook(books, new Book("Mysql", "Mike", 2020));

        // Printing all books
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Updating a book
        updateBook(books, "Java", new Book("Java Advanced", "James", 2022));
        System.out.println("\nAfter updating:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Deleting a book
        deleteBook(books, "Python");
        System.out.println("\nAfter deleting:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Method to add a book to the ArrayList
    public static void addBook(ArrayList<Book> books, Book book) {
        books.add(book);
    }

    // Method to update a particular book in the ArrayList
    public static void updateBook(ArrayList<Book> books, String title, Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.set(i, newBook);
                break;
            }
        }
    }

    // Method to delete a particular book from the ArrayList
    public static void deleteBook(ArrayList<Book> books, String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                books.remove(i);
                break;
            }
        }
    }
}
