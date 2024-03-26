package assign22_03_2024.assignment1;

class Movie{
    private String title;
    private String director;
    private int releaseYear;
    private double rating;
    private String genre;

    // Static variables
    private static int totalMovies = 0;

    public Movie(String title, String director, int releaseYear, double rating, String genre) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public static int getTotalMovies() {
        return totalMovies;
    }

    public static void setTotalMovies(int totalMovies) {
        Movie.totalMovies = totalMovies;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
}
public class MovieDemo {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception","nolan",2009,9.5,"Science fiction");
        System.out.println(movie.toString());
    }

}
