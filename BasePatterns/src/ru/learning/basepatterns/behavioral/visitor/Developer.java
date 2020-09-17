package ru.learning.basepatterns.behavioral.visitor;

// посетитель, его реализации будут по разному выполнять операции над некоторой структурой
public interface Developer {

    void create(ProjectClass projectClass);
    void create(Database database);
    void create(Test test);

}
