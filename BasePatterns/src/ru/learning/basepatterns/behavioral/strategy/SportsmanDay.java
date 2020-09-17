package ru.learning.basepatterns.behavioral.strategy;

public class SportsmanDay {
    public static void main(String[] args) {
        Sportsman sportsman = new Sportsman();

        sportsman.setActivity(new Sleeping());
        sportsman.executeActivity();

        sportsman.setActivity(new Trainee());
        sportsman.executeActivity();

        sportsman.setActivity(new Eating());
        sportsman.executeActivity();

        sportsman.setActivity(new Walking());
        sportsman.executeActivity();

        System.out.println("Sportsman will go to sleep after hard day...");
        sportsman.setActivity(new Sleeping());
        sportsman.executeActivity();
    }
}
