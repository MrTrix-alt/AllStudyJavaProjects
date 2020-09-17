package ru.learning.basepatterns.creational.prototype.entity;

public class Car implements Copyable {
    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public Object copy() {
       Car copyCar = new Car(model, price);
       return copyCar;
    }

    @Override
    public String toString() {
        return "Car [model - " + model + ", price - " + price +  "]";
    }
}
