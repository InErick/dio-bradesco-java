package Interfaces;

public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("O computador ta Tocando musica");
    }

    @Override
    public void pauseMuisc() {
        System.out.println("O computador ta Musica pausada");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador ta Musica stopada");
    }

    @Override
    public void playvideo() {
        System.out.println("O computador ta Video rodando");
    }

    @Override
    public void pausevideo() {
        System.out.println("O computador ta Video pausado");
    }

    @Override
    public void stopvideo() {
        System.out.println("O computador ta Video stopado");
    }
}
