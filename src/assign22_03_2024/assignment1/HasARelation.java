package assign22_03_2024.assignment1;

class Team{
    private String name;
    private String city;
    private Player player;

    public Team(String name, String city, Player player) {
        this.name = name;
        this.city = city;
        this.player = player;
    }

    @Override
    public java.lang.String toString() {
        return "Team{" +
                "name=" + name +
                ", city=" + city +
                ", player=" + player +
                '}';
    }
}
class Player{

    private String name;
    private String position;
    private int jerseyNumber ;

    public Player(String name, String position, int jerseyNumber) {
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public java.lang.String toString() {
        return "Player{" +
                "name=" + name +
                ", position=" + position +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}

public class HasARelation{
    public static void main(String[] args) {
        Player player = new Player("prince","setter",7);
        Team team = new Team("thunder","chennai",player);
        System.out.println(team.toString());

    }
}
