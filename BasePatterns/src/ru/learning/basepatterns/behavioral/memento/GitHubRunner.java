package ru.learning.basepatterns.behavioral.memento;

public class GitHubRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitRepo github = new GitRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");
        github.setSave(project.save());

        System.out.println("Updating project to version 1.1");

        System.out.println("Writing poor code...");

        project.setVersionAndDate("Version 1.1.");

        System.out.println(project);

        System.out.println("Something went wrong...");

        System.out.println("We need to roll back to Version 1.0");
        project.load(github.getSave());
        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
