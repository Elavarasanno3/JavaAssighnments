package assign01_04_2024abstractclassesandabstractmethods;

import java.util.Scanner;

class Book{
    Scanner sc = new Scanner(System.in);
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
    public void updateBook(){
        while(true){
            System.out.println("Enter your UserName : ");
            if(!sc.next().equals("admin")){
                return;
            }
            System.out.print("\n 1 --> Change name \n 2 --> Change Author \n 3 --> Change ISBN \n 4 --> Change price \n 5 --> Exit \n");
            System.out.println("Enter the choice : ");
            sc.nextLine();
            String choice = sc.nextLine();

            switch (choice){
                case "1":
                    System.out.println("Enter new Book name : ");
                    setBookName(sc.nextLine());
                    return;
                case "2":
                    System.out.println("Enter new Author name : ");
                    setAuthor(sc.nextLine());
                    return;
                case "3":
                    System.out.println("Enter new ISBN number : ");
                    setISBN(sc.nextLine());
                    break;
                case "4":
                    System.out.println("Enter new price : ");
                    setPrice(sc.nextDouble());
                    return;
                case "5":
                    System.out.println("thank you");
                    return;
                default:
                    updateBook();
            }
        }

    }
}
public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("History of India","1234567890123","Elavarasan",230,430.00);
        System.out.println(book.toString());
        System.out.println("Enter yes to update book : ");
        Scanner sc = new Scanner(System.in);
        if(sc.next().equals("yes")){
            book.updateBook();
        }
        System.out.println(book.toString());

    }

}
