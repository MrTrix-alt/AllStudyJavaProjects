package ru.learning.basepatterns.behavioral.observer;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
