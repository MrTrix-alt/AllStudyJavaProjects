package ru.learning.basepatterns.behavioral.visitor;

public class Project implements ProjectElement {
    private ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElement element : projectElements) {
            element.beWritten(developer);
        }
    }
}
