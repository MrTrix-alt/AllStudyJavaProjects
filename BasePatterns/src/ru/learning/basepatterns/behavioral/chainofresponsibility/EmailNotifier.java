package ru.learning.basepatterns.behavioral.chainofresponsibility;

public class EmailNotifier extends Notifier {

    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Sending email: " + msg);
    }
}
