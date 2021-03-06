package com.gofpatterns.structural.bridge;

public abstract class MusicListener {
    protected MusicPlayer musicPlayer;

    protected MusicListener(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public abstract void listenMusic();
}
