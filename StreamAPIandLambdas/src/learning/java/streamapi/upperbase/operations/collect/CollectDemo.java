package learning.java.streamapi.upperbase.operations.collect;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo
{

    public static void main(String[] args) {
        // 1) collect(Collectors.toList())
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
                .filter(s -> s.length() > 10)
                .collect(Collectors.toList());
        System.out.println("List filteredPhones: " + filteredPhones);

        // 2) collect(Collectors.toSet())
        Set<String> filteredPhones1 = phones.stream()
                .filter(s -> s.length() > 10)
                .collect(Collectors.toSet());
        System.out.println("Set filteredPhones1: " + filteredPhones1);

        // 2.1) collect(Collectors.toCollection(HashSet::new)) - получаем HashSet
        Stream<String> phones1 = Stream.of("iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");
        HashSet<String> filteredPhones2 = phones1.filter(s -> s.length() < 12).
                collect(Collectors.toCollection(HashSet::new));
        filteredPhones2.forEach(System.out::println);

        // 3) collect(Collectors.toMap())
        Stream<Car> carStream = Stream.of(
                new Car("Toyota Land Cruiser", 5400000),
                new Car("BMW X5", 5000000),
                new Car("Mazda 6", 4000000),
                new Car("Lada Vesta", 750000));
        Map<String, Integer> carMap = carStream
                .collect(Collectors.toMap(Car::getName, Car::getPrice));
        carMap.forEach((k, v) -> System.out.println(k + " " + v));




    }
}
