package com.gofpatterns.behavioral.memento;

public class GameSaver {

    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
