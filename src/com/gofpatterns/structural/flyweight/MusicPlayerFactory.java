package com.gofpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicPlayerFactory {
    private static final Map<String, MusicPlayer> players = new HashMap<>();

    public MusicPlayer getPlayerByName(String name) {
        MusicPlayer player = players.get(name);

        if (player == null) {
            switch (name) {
                case "ipod":
                    System.out.println("Creating iPod nano player.");
                    player = new IpodNano();
                    break;
                case "walkman":
                    System.out.println("Creating sony walkMan player.");
                    player = new WalkMan();
            }
            players.put(name, player);
        }
        return player;
    }
}
