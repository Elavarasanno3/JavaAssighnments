package assign22_03_2024.assignment2.librarymanagement;

import java.util.ArrayList;

public class LibraryDatabase {
    ArrayList<Book> listOfBooks;
    public LibraryDatabase(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }


}
