package com.gofpatterns.structural.bridge;

public class NokiaExpressMusic implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Nokia Express Music is playing music.");
    }
}
