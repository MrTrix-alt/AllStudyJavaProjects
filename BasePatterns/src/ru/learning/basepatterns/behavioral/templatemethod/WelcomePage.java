package ru.learning.basepatterns.behavioral.templatemethod;

public class WelcomePage extends WebsiteTemplate{


    @Override
    public void showPageContent() {
        System.out.println("Welcome information");
    }
}
