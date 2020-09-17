package ru.learning.basepatterns.behavioral.state;

public class SportsmanDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Sportsman sportsman = new Sportsman();
        sportsman.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            sportsman.justDoIt();
            sportsman.changeActivity();
        }
    }
}
