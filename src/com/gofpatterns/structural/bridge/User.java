package com.gofpatterns.structural.bridge;

public class User extends MusicListener {

    public User(MusicPlayer musicPlayer) {
        super(musicPlayer);
    }

    @Override
    public void listenMusic() {
        musicPlayer.playMusic();
    }
}
