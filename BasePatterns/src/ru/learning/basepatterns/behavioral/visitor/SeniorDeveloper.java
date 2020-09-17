package ru.learning.basepatterns.behavioral.visitor;

public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("ReWriting class after Junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("ReWriting test after Junior...");
    }
}
