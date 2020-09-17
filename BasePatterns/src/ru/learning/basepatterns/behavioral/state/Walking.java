package ru.learning.basepatterns.behavioral.state;

public class Walking implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Walking...");
    }
}
