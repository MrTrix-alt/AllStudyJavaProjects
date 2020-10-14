package learning.java.streamapi.upperbase.operations.minmax;

import java.util.*;
import java.util.stream.Stream;

public class MaxMinStreamAPIDemo
{
    public static void main(String[] args)
    {
        List<Car> phones = new ArrayList<>(Arrays.asList(
                new Car("iPhone 8", 52000),
                new Car("Nokia 9", 35000),
                new Car("Samsung Galaxy S9", 48000),
                new Car("HTC U12", 36000))
        );

        Car carWithMinPrice = phones.stream().min(new Car.CarComparator()).get();
        Car carWithMaxPrice = phones.stream().max(new Car.CarComparator()).get();
        System.out.println("Car with min price: " + carWithMinPrice);
        System.out.println("Car with max price: " + carWithMaxPrice);

    }
}
