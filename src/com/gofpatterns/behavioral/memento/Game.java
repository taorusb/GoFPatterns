package com.gofpatterns.behavioral.memento;

public class Game {

    private int level;
    private String username;

    void startGame(String username) {
        this.username = username;
        level = 0;
    }

    Save saveGame() {
        return new Save(level, username);
    }

    void levelUp() {
        level++;
    }

    void loadGame(Save save) {
        level = save.getLevel();
        username = save.getUsername();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", username='" + username + '\'' +
                '}';
    }
}
