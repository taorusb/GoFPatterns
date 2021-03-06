package com.gofpatterns.structural.flyweight;

public class IpodNano implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("iPod nano is playing music.");
    }
}
