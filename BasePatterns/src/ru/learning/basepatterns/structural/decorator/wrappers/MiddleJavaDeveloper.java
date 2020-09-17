package ru.learning.basepatterns.structural.decorator.wrappers;

import ru.learning.basepatterns.structural.decorator.Developer;
import ru.learning.basepatterns.structural.decorator.DeveloperDecorator;

public class MiddleJavaDeveloper extends DeveloperDecorator {

    public MiddleJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String checkJobOfJuniorDeveloper() {
        return "Middle Java Developer checks job of Junior Java Developer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + checkJobOfJuniorDeveloper();
    }
}
