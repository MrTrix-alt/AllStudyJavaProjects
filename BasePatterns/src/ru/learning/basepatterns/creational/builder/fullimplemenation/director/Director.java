package ru.learning.basepatterns.creational.builder.fullimplemenation.director;

import ru.learning.basepatterns.creational.builder.fullimplemenation.builders.Builder;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Engine;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Transmission;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Type;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.MANUAL);
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
    }
}
