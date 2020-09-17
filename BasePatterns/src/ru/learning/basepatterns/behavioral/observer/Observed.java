package ru.learning.basepatterns.behavioral.observer;

public interface Observed { // интерфейс, которые будет наблюдать за сущностью

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
