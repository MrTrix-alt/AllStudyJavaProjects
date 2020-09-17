package ru.learning.basepatterns.behavioral.templatemethod;

public abstract class WebsiteTemplate {

    protected void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    protected abstract void showPageContent();
}
