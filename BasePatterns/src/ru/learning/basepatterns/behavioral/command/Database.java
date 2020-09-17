package ru.learning.basepatterns.behavioral.command;

public class Database {

    public void insert() {
        System.out.println("Added record");
    }

    public void update() {
        System.out.println("Updated record");
    }

    public void select() {
        System.out.println("Reading record");
    }

    public void delete() {
        System.out.println("Deleted record");
    }



}
