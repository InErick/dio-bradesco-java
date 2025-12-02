package Interfaces;

public class SmartPhone implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pauseMuisc() {
        System.out.println("Musica pausada");
    }

    @Override
    public void stopMusic() {
        System.out.println("Musica stopada");
    }

    @Override
    public void playvideo() {
        System.out.println("Video rodando");
    }

    @Override
    public void pausevideo() {
        System.out.println("Video pausado");
    }

    @Override
    public void stopvideo() {
        System.out.println("Video stopado");
    }
}
