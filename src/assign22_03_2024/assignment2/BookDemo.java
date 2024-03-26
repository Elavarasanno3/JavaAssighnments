package assign22_03_2024.assignment2;

import java.util.ArrayList;

class Book{
    private String BookName;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    private String ISBN;
    private String author;
    private int pageCount;
    private double price;

    private static int bookCount = 0;

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                ", price=" + price +
                '}';
    }

    public Book(String bookName, String ISBN, String author, int pageCount, double price) {
        BookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }
}
public class BookDemo {
    static ArrayList<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        Book book = new Book("History of Tamil","1234567890121","kumar",400,1000.00);
        Book book1 = new Book("History of English","1234567890122","prince",330,330.00);
        Book book2 = new Book("History of Maths","1234567890123","Muthu",430,230.00);
        Book book3 = new Book("History of Science","1234567890124","Ram",530,530.00);
        Book book4 = new Book("History of Social","1234567890125","sri",260,460.00);


        addBook(book);
        addBook(book1);
        addBook(book2);
        addBook(book3);
        addBook(book4);
        printBook();
    }

    private static void printBook() {
        for(Book book : bookList){
            System.out.println(book.toString());
        }
    }

    public static void addBook(Book book){
        bookList.add(book);
    }
}
