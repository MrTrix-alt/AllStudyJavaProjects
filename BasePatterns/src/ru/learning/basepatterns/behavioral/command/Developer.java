package ru.learning.basepatterns.behavioral.command;

public class Developer {
    private Command select;
    private Command insert;
    private Command update;
    private Command delete;

    public Developer(Command select, Command insert, Command update, Command delete) {
        this.select = select;
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
    }

    public void select() {
        select.execute();
    }

    public void update() {
        update.execute();
    }

    public void delete() {
        delete.execute();
    }



}
