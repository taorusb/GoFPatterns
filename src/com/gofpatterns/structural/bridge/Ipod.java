package com.gofpatterns.structural.bridge;

public class Ipod implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("iPod is playing music.");
    }
}
