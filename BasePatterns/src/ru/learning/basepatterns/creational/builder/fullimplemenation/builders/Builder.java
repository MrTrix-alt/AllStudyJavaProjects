package ru.learning.basepatterns.creational.builder.fullimplemenation.builders;

import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Type;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Engine;
import ru.learning.basepatterns.creational.builder.fullimplemenation.details.Transmission;

/*
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);

}
