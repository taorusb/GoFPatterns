package com.gofpatterns.behavioral.memento;

public class Save {

    private final int level;
    private final String username;

    public Save(int level, String username) {
        this.level = level;
        this.username = username;
    }

    public int getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }
}