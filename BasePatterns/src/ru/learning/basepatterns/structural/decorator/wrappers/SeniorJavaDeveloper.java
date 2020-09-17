package ru.learning.basepatterns.structural.decorator.wrappers;

import ru.learning.basepatterns.structural.decorator.Developer;
import ru.learning.basepatterns.structural.decorator.DeveloperDecorator;

public class SeniorJavaDeveloper  extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
