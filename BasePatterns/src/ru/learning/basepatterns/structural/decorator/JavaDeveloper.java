package ru.learning.basepatterns.structural.decorator;


// основная сущность, которая будет оборачиваться оболочками
public class JavaDeveloper implements Developer {

    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
