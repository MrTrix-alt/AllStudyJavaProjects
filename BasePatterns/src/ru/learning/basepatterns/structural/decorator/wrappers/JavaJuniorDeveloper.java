package ru.learning.basepatterns.structural.decorator.wrappers;

import ru.learning.basepatterns.structural.decorator.Developer;
import ru.learning.basepatterns.structural.decorator.DeveloperDecorator;

public class JavaJuniorDeveloper extends DeveloperDecorator {

    public JavaJuniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeSimpleTask() {
        return "Java Junior developer makes simple task.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeSimpleTask();
    }
}
