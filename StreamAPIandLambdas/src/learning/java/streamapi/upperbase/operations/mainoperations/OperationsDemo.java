package learning.java.streamapi.upperbase.operations.mainoperations;


import java.util.stream.Stream;

public class OperationsDemo
{
    public static void main(String[] args)
    {
        // Используем фильтр в stream api:
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 6 S", 54000),
                new Phone("Nokia Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000)
        );

        System.out.println("Телефоны с ценой ниже (filter) 50000р: ");
        phoneStream.filter(p -> p.getPrice() < 50000)
                .forEach(System.out::println);

        Stream<Phone> phoneStream1 = Stream.of(
                new Phone("iPhone 6 S", 23000),
                new Phone("Nokia Lumia 950", 20000),
                new Phone("Samsung Galaxy S 6", 22000),
                new Phone("iPhone 7 S", 28000),
                new Phone("Samsung Galaxy S 8", 35000)
                );

        System.out.println("\nНовый поток с отображением только названий телефонов " +
                "с помощью метода map()");
        phoneStream1
                .map(Phone::getName) // помещаем в поток только названия телефонов
                .filter(s -> s.contains("iP") || s.contains("Galaxy"))
                .sorted()
                .forEach(System.out::println);

        Stream<Phone> phoneStream2 = Stream.of(
                new Phone("iPhone 6 S", 23000),
                new Phone("Nokia Lumia 950", 20000),
                new Phone("Samsung Galaxy S 6", 22000),
                new Phone("iPhone 7 S", 28000),
                new Phone("Samsung Galaxy S 8", 35000)
        );

        System.out.println("\nНовый поток с плоским отображением flatMap():");
        float sale = 0.1f; // можно использовать в потоках!
        phoneStream2
                .flatMap(p -> Stream.of(
                        String.format("название: %s цена без скидки: %d",
                                p.getName(), p.getPrice()),
                        String.format("название: %s цена со скидкой : %d",
                                p.getName(), p.getPrice() - (int) (p.getPrice() * sale))
                ))
                .sorted()
                .filter(p -> p.contains("iPhone"))
                .forEach(System.out::println);
    }
}

