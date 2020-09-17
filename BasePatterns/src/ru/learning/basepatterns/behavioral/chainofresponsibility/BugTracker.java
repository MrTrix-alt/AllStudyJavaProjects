package ru.learning.basepatterns.behavioral.chainofresponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier callNotifier = new CallNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(callNotifier);

        reportNotifier.notifyDeveloper("Everything is OK", Priority.ROUTINE);
        reportNotifier.notifyDeveloper("Something went wrong", Priority.IMPORTANT);
        reportNotifier.notifyDeveloper("We have had problems!!!", Priority.ASAP);
    }
}
