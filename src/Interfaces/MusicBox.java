package Interfaces;

public class MusicBox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A caixa de musica tocando musica");
    }

    @Override
    public void pauseMuisc() {
        System.out.println("A caixa de musica Musica pausada");
    }

    @Override
    public void stopMusic() {
        System.out.println("A caixa de musica Musica stopada");
    }

}
