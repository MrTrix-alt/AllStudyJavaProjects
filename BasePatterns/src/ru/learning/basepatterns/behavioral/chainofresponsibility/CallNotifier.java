package ru.learning.basepatterns.behavioral.chainofresponsibility;

public class CallNotifier extends Notifier {

    public CallNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Calling to developer: " + msg);
    }
}
