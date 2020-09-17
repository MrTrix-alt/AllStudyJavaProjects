package ru.learning.basepatterns.creational.builder.fullimplemenation.builders;

import ru.learning.basepatterns.creational.builder.fullimplemenation.cars.Manual;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Engine;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Transmission;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Type;

/*
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим руководство пользователя автомобиля с помощью
 * тех же шагов, что и сами автомобили. Это устройство позволит создавать
 * руководства под конкретные модели автомобилей, содержащие те или иные фичи.
 */

public class CarManualBuilder implements Builder {
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


    public Manual getResult() {
        return new Manual(type, seats, engine, transmission);
    }
}

