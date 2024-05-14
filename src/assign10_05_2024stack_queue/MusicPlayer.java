package assign10_05_2024stack_queue;
class Song {
    private String title;

    public Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class Node {
    Song song;
    Node next;

    public Node(Song song) {
        this.song = song;
        this.next = null;
    }
}

class Playlist {
    private Node head;
    private Node tail;
    private Node current;

    public Playlist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(Song song) {
        Node newNode = new Node(song);
        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void removeSong(String title) {
        Node prev = null;
        Node current = head;

        // Traverse the list to find the song with the given title
        while (current != null && !current.song.getTitle().equals(title)) {
            prev = current;
            current = current.next;
        }

        // If the song is found, remove it from the playlist
        if (current != null) {
            if (prev != null) {
                prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current == tail) {
                tail = prev;
            }
            if (current == this.current) {
                this.current = current.next;
            }
        }
    }

    public void displayPlaylist() {
        Node current = head;
        while (current != null) {
            System.out.println(current.song);
            current = current.next;
        }
    }

    public void playCurrentSong() {
        if (current != null) {
            System.out.println("Playing: " + current.song);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next;
            playCurrentSong();
        } else {
            System.out.println("No more songs in the playlist.");
        }
    }
}

public class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSong(new Song("Oxygen Thanthale..."));
        playlist.addSong(new Song("Un perai sollum pothu..."));
        playlist.addSong(new Song("Nee kavithakala kanavukala..."));
        playlist.addSong(new Song("Why this kolaveri....."));

        // Displaying the playlist
        System.out.println("Current Playlist:");
        playlist.displayPlaylist();

        // Playing the current song
        System.out.println("\nPlaying Current Song:");
        playlist.playCurrentSong();

        // Removing a song from the playlist
        playlist.removeSong("Un perai sollum pothu...");
        System.out.println("\nUpdated Playlist after removing Song 2:");
        playlist.displayPlaylist();

        // Advancing to the next song
        System.out.println("\nPlaying Next Song:");
        playlist.nextSong();
    }
}
