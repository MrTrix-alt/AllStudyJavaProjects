package ru.learning.basepatterns.behavioral.command;

public class UpdatingCommand implements Command {
    private Database database;

    public UpdatingCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
