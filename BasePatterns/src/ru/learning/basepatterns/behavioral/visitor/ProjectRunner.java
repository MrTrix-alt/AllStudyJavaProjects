package ru.learning.basepatterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        JuniorDeveloper junior = new JuniorDeveloper();
        SeniorDeveloper senior = new SeniorDeveloper();

        System.out.println("Junior in action:");
        project.beWritten(junior);

        System.out.println("\n------------------------------------\n");

        System.out.println("Senior in action:");
        project.beWritten(senior);
    }
}
