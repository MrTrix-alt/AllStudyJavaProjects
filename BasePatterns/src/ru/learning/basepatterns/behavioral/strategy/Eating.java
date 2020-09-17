package ru.learning.basepatterns.behavioral.strategy;

public class Eating implements Activity {

    @Override
    public void justDoIt() {
        System.out.println("Eating!");
    }
}
