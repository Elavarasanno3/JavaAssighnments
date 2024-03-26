package assign22_03_2024.assignment2.librarymanagement;

public class Account {
    int noOfBorrowedBooks;
    int noOfReservedBooks;
    int noOfReturnedBooks;
    int noOfLostBooksFineAmount;

    public Account(int noOfBorrowedBooks, int noOfReservedBooks, int noOfReturnedBooks, int noOfLostBooksFineAmount) {
        this.noOfBorrowedBooks = noOfBorrowedBooks;
        this.noOfReservedBooks = noOfReservedBooks;
        this.noOfReturnedBooks = noOfReturnedBooks;
        this.noOfLostBooksFineAmount = noOfLostBooksFineAmount;
    }
    public void calculateFine(){

    }

    public int getNoOfBorrowedBooks() {
        return noOfBorrowedBooks;
    }

    public void setNoOfBorrowedBooks(int noOfBorrowedBooks) {
        this.noOfBorrowedBooks = noOfBorrowedBooks;
    }

    public int getNoOfReservedBooks() {
        return noOfReservedBooks;
    }

    public void setNoOfReservedBooks(int noOfReservedBooks) {
        this.noOfReservedBooks = noOfReservedBooks;
    }

    public int getNoOfReturnedBooks() {
        return noOfReturnedBooks;
    }

    public void setNoOfReturnedBooks(int noOfReturnedBooks) {
        this.noOfReturnedBooks = noOfReturnedBooks;
    }

    public int getNoOfLostBooksFineAmount() {
        return noOfLostBooksFineAmount;
    }

    public void setNoOfLostBooksFineAmount(int noOfLostBooksFineAmount) {
        this.noOfLostBooksFineAmount = noOfLostBooksFineAmount;
    }
}
