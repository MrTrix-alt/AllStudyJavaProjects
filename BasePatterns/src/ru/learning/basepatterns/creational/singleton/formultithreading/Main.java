package ru.learning.basepatterns.creational.singleton.formultithreading;

public class Main {
    public static void main(String[] args) {

        final int SIZE = 20;
        Thread[] threads = new Thread[SIZE];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ThreadsForSingleton());
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try  {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Singleton.counter);
    }
}
