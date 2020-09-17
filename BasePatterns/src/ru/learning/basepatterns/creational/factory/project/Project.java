package ru.learning.basepatterns.creational.factory.project;

import ru.learning.basepatterns.creational.factory.developer.Developer;
import ru.learning.basepatterns.creational.factory.developerfactory.DeveloperFactory;
import ru.learning.basepatterns.creational.factory.developerfactory.JavaDeveloperFactory;
import ru.learning.basepatterns.creational.factory.developerfactory.KotlinDeveloperFactory;


public class Project {
    public static void main(String[] args) {

        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();
        developer.writeCode();

        factory = createDeveloperBySpecialty("Kotlin");
        developer = factory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {

        if (specialty.equalsIgnoreCase("Java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("Kotlin")) {
            return new KotlinDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is not need for our project");
        }
    }
}
