package ru.learning.basepatterns.behavioral.chainofresponsibility;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String msg) {
        System.out.println("Notifying using simple report: " + msg);
    }
}
