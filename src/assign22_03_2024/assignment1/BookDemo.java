package assign22_03_2024.assignment1;

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
    public static void main(String[] args) {
        Book book = new Book("History of India","1234567890123","Elavarasan",230,430.00);
        System.out.println(book.toString());
    }

}
