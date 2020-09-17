package ru.learning.basepatterns.creational.prototype;

import ru.learning.basepatterns.creational.prototype.entity.Car;
import ru.learning.basepatterns.creational.prototype.factory.CarFactory;

public class Main {
    public static void main(String[] args) {
        Car original = new Car("Toyota", 1500000);
        System.out.println(original);
        Car copy = (Car) original.copy();
        System.out.println(copy);

        // адреса в памяти разные
        System.out.println(original.hashCode());
        System.out.println(copy.hashCode());

        // Создание объекта через фабрику
        CarFactory factory = new CarFactory(original);
        Car car1 = factory.makeCopy();
        System.out.println(car1);

        factory.setPrototype(new Car("BMW", 100000));
        Car car2 = factory.makeCopy();
        System.out.println(car2);
        Car car2Copy = factory.makeCopy();
        System.out.println(car2Copy);

        // адреса в памяти разные
        System.out.println(car2.hashCode());
        System.out.println(car2Copy.hashCode());



    }
}
