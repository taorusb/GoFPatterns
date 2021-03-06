package com.gofpatterns.behavioral.memento;

public class GameSimulator {
    public static void main(String[] args) {

        Game game = new Game();
        GameSaver saver = new GameSaver();

        game.startGame("Poppy");

        System.out.println("Starting game...\n" + game);
        for (int i = 0; i < 3; i++) {
            game.levelUp();
        }

        System.out.println("\n===========\nSaving game...\n" + game);
        saver.setSave(game.saveGame());
        for (int i = 0; i < 5; i++) {
            game.levelUp();
        }

        System.out.println("===========\nGame over on\n" + game
                + "\nDo you want load last saved game?\n===========\nLoading last save...");
        game.loadGame(saver.getSave());
        System.out.println("Game loaded\n" + game);
    }
}
