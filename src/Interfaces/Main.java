package Interfaces;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Computer();
        runMusic(new Computer());
        runVideo(new Computer());
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playvideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
