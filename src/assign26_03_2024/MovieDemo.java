package assign26_03_2024;
abstract class Movie{
    private String title;
    private String director;
    private String journer;
    private String actor;
    private String actress;
    private int releasedYear;

    public Movie(String title, String director, String actor, String actress, int releasedYear) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        this.actress = actress;
        this.releasedYear = releasedYear;
    }
    abstract public void  play();

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                ", releasedYear=" + releasedYear +
                '}';
    }
}
class RomCom extends Movie {

    public RomCom(String title, String director, String actor, String actress, int releasedYear) {
        super(title, director, actor, actress, releasedYear);
    }

    @Override
    public void play() {
        System.out.println("RomCom playing.....");
    }

}
class Thriller extends Movie{

    public Thriller(String title, String director, String actor, String actress, int releasedYear) {
        super(title, director, actor, actress, releasedYear);
    }

    @Override
    public void play() {
        System.out.println("Thriller Playing.....");
    }

}

class ScienceFiction extends Movie{

    public ScienceFiction(String title, String director, String actor, String actress, int releasedYear) {
        super(title, director, actor, actress, releasedYear);
    }

    @Override
    public void play() {
        System.out.println("Science Fiction Playing.....");
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        Movie romCom = new RomCom("Love Today","Pradeep","Pradeep","Ivana",2022);
        romCom.play();
        System.out.println(romCom.toString());
        Movie thriller = new Thriller("Ratsasan","Ramkumar","Vishnu vishal","AmalaPaul",2018);
        thriller.play();
        System.out.println(thriller.toString());
        Movie scienceFiction = new ScienceFiction("24","Vikram Kumar","Surya","Samantha",2016);
        scienceFiction.play();
        System.out.println(scienceFiction.toString());

    }
}
