package Interfaces;

public interface MusicPlayer {

//    public final static String music ="Parabéns pra você"; Todo atributo na interface é um public final static, então declarar aqui é redundante
    String music = "Parabéns pra você";


    void playMusic();
    void pauseMuisc();
    void stopMusic();
}
