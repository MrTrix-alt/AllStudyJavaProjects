package ru.learning.basepatterns.behavioral.state;

public class Trainee implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training!");
    }
}
