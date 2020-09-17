package ru.learning.basepatterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.github.com/username/realProject");

        // Если закомментировать 10ую строку,
        // то создание основного объекта не произойдет.
        project.make();
    }
}
