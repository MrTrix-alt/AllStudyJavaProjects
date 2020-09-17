package ru.learning.basepatterns.behavioral.strategy;

public class Walking implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Walking...");
    }
}
