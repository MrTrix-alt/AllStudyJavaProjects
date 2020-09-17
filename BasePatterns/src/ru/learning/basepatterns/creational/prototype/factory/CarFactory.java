package ru.learning.basepatterns.creational.prototype.factory;

import ru.learning.basepatterns.creational.prototype.entity.Car;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        setPrototype(car);
    }

    public void setPrototype(Car car) {
        this.car = car;
    }

    public Car makeCopy() {
        return (Car) car.copy();
    }
}
