package ru.learning.basepatterns.creational.factory.developer;

public class JavaDeveloper  implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes back-end");
    }
}
