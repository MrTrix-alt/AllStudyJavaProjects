package ru.learning.basepatterns.creational.builder.fullimplemenation;

import ru.learning.basepatterns.creational.builder.fullimplemenation.builders.CarBuilder;
import ru.learning.basepatterns.creational.builder.fullimplemenation.builders.CarManualBuilder;
import ru.learning.basepatterns.creational.builder.fullimplemenation.cars.Car;
import ru.learning.basepatterns.creational.builder.fullimplemenation.cars.Manual;
import ru.learning.basepatterns.creational.builder.fullimplemenation.director.Director;

public class Main {
    public static void main(String[] args) {
            Director director = new Director();

            // Директор получает объект конкретного строителя от клиента
            // (приложения). Приложение само знает какой строитель использовать,
            // чтобы получить нужный продукт.
            CarBuilder builder = new CarBuilder();
            director.constructCityCar(builder);

            // Готовый продукт возвращает строитель, так как Директор чаще всего не
            // знает и не зависит от конкретных классов строителей и продуктов.
            Car car = builder.getResult();
            System.out.println("Car built:\n" + car.print());

            CarManualBuilder manualBuilder = new CarManualBuilder();

            // Директор может знать больше одного рецепта строительства.
            director.constructSportsCar(manualBuilder);
            Manual carManual = manualBuilder.getResult();
            System.out.println("Car manual built:\n" + carManual.print());
    }

}

