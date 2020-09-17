package ru.learning.basepatterns.creational.factory.developerfactory;

import ru.learning.basepatterns.creational.factory.developer.Developer;
import ru.learning.basepatterns.creational.factory.developer.KotlinDeveloper;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
