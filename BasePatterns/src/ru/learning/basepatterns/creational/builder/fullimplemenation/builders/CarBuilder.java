package ru.learning.basepatterns.creational.builder.fullimplemenation.builders;

import ru.learning.basepatterns.creational.builder.fullimplemenation.cars.Car;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Engine;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Transmission;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Type;

/*
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }


    public Car getResult() {
        return new Car(type, seats, engine, transmission);
    }
}
