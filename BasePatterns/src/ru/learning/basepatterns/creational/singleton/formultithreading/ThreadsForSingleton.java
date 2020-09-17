package ru.learning.basepatterns.creational.singleton.formultithreading;

public class ThreadsForSingleton implements Runnable {

    @Override
    public void run() {
        Singleton.getInstance();
    }
}
