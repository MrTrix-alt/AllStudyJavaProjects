package ru.learning.basepatterns.behavioral.strategy;

public class Trainee implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training!");
    }
}
