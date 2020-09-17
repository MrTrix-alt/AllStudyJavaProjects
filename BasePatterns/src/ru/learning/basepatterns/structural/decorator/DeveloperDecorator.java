package ru.learning.basepatterns.structural.decorator;

// класс, содержащий ссылку на интерфейс Developer
// и имеющий конструктор с инъекцией на тип Developer
// От этого класса будут наследоваться классы-декораторы (обертки)
public class DeveloperDecorator implements Developer {
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
