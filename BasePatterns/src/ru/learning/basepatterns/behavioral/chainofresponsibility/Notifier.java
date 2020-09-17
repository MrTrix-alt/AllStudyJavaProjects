package ru.learning.basepatterns.behavioral.chainofresponsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyDeveloper(String msg, int level) {

        if (level >= priority) {
            write(msg);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyDeveloper(msg, level);
        }
    }

    public abstract void write(String msg);


}
