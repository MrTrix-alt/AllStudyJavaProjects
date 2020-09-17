package ru.learning.basepatterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new SelectCommand(database),
                new InsertCommand(database),
                new UpdatingCommand(database),
                new DeleteCommand(database)
        );

        developer.select();
        developer.insertRecord();
        developer.update();
        developer.delete();
    }
}
