package ru.learning.basepatterns.creational.singleton.foronethread;

public class Main {
    public static void main(String[] args) {

        final int SIZE = 20;
        Singleton[] singletons = new Singleton[SIZE];
        for(int i = 0; i < singletons.length; i++) {
            singletons[i] = Singleton.getInstance();
        }
        System.out.println(Singleton.counter);
    }
}
