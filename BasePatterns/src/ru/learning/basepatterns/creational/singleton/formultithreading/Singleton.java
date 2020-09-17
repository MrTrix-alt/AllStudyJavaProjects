package ru.learning.basepatterns.creational.singleton.formultithreading;

public class Singleton {
    public static int counter = 0;
    // volatile необходим для распределения ресурсов
    private static volatile Singleton instance;

    private Singleton() {
        counter++;
    }

    // "ленивая" инициализация
    // Первые 2 потока боряться за создание объекта,
    // все последущие потоки, попадая видят условие, что instance != null
    // и возвращают объект instance;
    public static Singleton getInstance() {
        // double check lock
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}
