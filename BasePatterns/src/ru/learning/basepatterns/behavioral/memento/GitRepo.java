package ru.learning.basepatterns.behavioral.memento;

public class GitRepo {
    private SaverStateOfObject save;

    public SaverStateOfObject getSave() {
        return save;
    }

    public void setSave(SaverStateOfObject save) {
        this.save = save;
    }
}
