package ru.learning.basepatterns.behavioral.observer;

public class JobSearch { // клиентский класс

    public static void main(String[] args) {
        DeveloperJobSite jobSite = new DeveloperJobSite();

        jobSite.addVacancy("Junior Java Developer [1]");
        jobSite.addVacancy("Junior Java Developer [2]");
        jobSite.addVacancy("Junior Python Developer [1]");
        jobSite.addVacancy("Junior Python Developer [2]");
        jobSite.addVacancy("Junior PHP Developer [1]");
        jobSite.addVacancy("Junior PHP Developer [2]");

        Observer subscriber1 = new Subscriber("Timur Abubakirov");
        Observer subscriber2 = new Subscriber("Ivan Ivankov");

        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        jobSite.addVacancy("Middle Java Developer");

        jobSite.removeVacancy("Junior Java Developer [2]");

    }
}
