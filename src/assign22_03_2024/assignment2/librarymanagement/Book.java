package assign22_03_2024.assignment2.librarymanagement;

public class Book {
    String title;
    String Author;
    String ISBN;
    String publication;
    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        Author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public void showDueDate(){

    }
    public void reservationStatus(){

    }
    public void feedback(){

    }
    public void bookRequest(){

    }
    public void renewInfo (){

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }


}
