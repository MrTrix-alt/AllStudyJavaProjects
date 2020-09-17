package ru.learning.basepatterns.creational.singleton.foronethread;

public class Singleton {
    public static int counter = 0;
    private static Singleton instsance;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instsance == null)
            instsance = new Singleton();
        return instsance;
    }
}
