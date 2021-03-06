package com.gofpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MusicPlayer> playersList = new ArrayList<>();
        MusicPlayerFactory factory = new MusicPlayerFactory();

        playersList.add(factory.getPlayerByName("ipod"));
        playersList.add(factory.getPlayerByName("ipod"));
        playersList.add(factory.getPlayerByName("ipod"));
        playersList.add(factory.getPlayerByName("walkman"));
        playersList.add(factory.getPlayerByName("walkman"));
        playersList.add(factory.getPlayerByName("walkman"));

        playersList.forEach(System.out::println);
    }
}
