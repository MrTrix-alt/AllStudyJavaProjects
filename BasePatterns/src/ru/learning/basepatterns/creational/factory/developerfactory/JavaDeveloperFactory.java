package ru.learning.basepatterns.creational.factory.developerfactory;

import ru.learning.basepatterns.creational.factory.developer.Developer;
import ru.learning.basepatterns.creational.factory.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory  {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
