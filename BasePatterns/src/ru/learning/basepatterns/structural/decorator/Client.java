package ru.learning.basepatterns.structural.decorator;

import ru.learning.basepatterns.structural.decorator.wrappers.JavaJuniorDeveloper;
import ru.learning.basepatterns.structural.decorator.wrappers.MiddleJavaDeveloper;
import ru.learning.basepatterns.structural.decorator.wrappers.SeniorJavaDeveloper;

public class Client {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new MiddleJavaDeveloper(new JavaJuniorDeveloper(new JavaDeveloper())));
        System.out.println(developer.makeJob());
    }
}
