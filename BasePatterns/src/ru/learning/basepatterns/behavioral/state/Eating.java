package ru.learning.basepatterns.behavioral.state;

public class Eating implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Eating!");
    }
}
