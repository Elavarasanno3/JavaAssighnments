package assign29_03_2024packagesinterfaces.two;

public class MusicPlayer {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        MXPlayer mxPlayer = new MXPlayer();
        mxPlayer.play();
        mxPlayer.pause();
        mxPlayer.stop();
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
        UxPlayer uxPlayer = new UxPlayer();
        uxPlayer.play();
        uxPlayer.pause();
        uxPlayer.stop();

    }
}
class MP3Player implements Playable{

    @Override
    public void play() {
        System.out.println("Mp3 Player playing");
    }

    @Override
    public void pause() {
        System.out.println("Mp3 player Pausing");
    }

    @Override
    public void stop() {
        System.out.println("Mp3 player Stopping");
    }
}
class MXPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("MX Player playing");
    }

    @Override
    public void pause() {
        System.out.println("MX player Pausing");
    }

    @Override
    public void stop() {
        System.out.println("MX player Stopping");
    }
}
class CDPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("CD Player playing");
    }

    @Override
    public void pause() {
        System.out.println("CD player Pausing");
    }

    @Override
    public void stop() {
        System.out.println("CD player Stopping");
    }
}
class UxPlayer implements Playable{

    @Override
    public void play() {
        System.out.println("Ux Player playing");
    }

    @Override
    public void pause() {
        System.out.println("Ux player Pausing");
    }

    @Override
    public void stop() {
        System.out.println("Ux player Stopping");
    }
}
