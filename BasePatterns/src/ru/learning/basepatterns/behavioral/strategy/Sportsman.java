package ru.learning.basepatterns.behavioral.strategy;

public class Sportsman {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }

}
