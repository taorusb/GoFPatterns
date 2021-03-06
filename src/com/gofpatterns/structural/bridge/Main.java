package com.gofpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        MusicPlayer nokia = new NokiaExpressMusic();
        MusicListener listener = new User(nokia);
        listener.listenMusic();
    }
}
