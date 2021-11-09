package com.company;

public class AdapterPattern {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "god's plan.mp3");
        audioPlayer.play("mp4", "beggin'.mp4");
        audioPlayer.play("vlc", "sweet dreams.vlc");
        audioPlayer.play("avi", "my universe.avi");

    }

}
