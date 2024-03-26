package assign22_03_2024.assignment2.librarymanagement;

public class Librarian {
    String name;
    int id;
    String password;
    String searchString;

    public Librarian(String name, int id, String password, String searchString) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
    }

    public void verifyLibrarian(){

    }
    public void search(){

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
