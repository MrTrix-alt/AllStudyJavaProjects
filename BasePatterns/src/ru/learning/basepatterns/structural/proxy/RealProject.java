package ru.learning.basepatterns.structural.proxy;

public class RealProject implements Project {
    private String url; // ссылка, по которой можно скачать проект


    public RealProject(String url) {
        this.url = url;
        load(); // при создании объекта мы вызываем метод load()
    }

    public void load() {
        System.out.println("Loading project from " + url);
    }

    @Override
    public void make() {
        System.out.println("Developing of project " + url);
    }
}
