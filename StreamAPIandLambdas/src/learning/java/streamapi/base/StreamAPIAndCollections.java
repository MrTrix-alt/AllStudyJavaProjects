package learning.java.streamapi.base;

import java.util.*;

import java.util.stream.Stream;

public class StreamAPIAndCollections
{
    public static void main(String[] args)
    {
        // Способы создания потоков из коллекций:
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, -3, 4, -124, 10, 123, -21);
        integerList.stream()
                .filter(i -> i > 0)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();
        Stream<Integer> stream = integerList.stream();
        stream.filter(i -> i < 0).sorted().filter(i -> i < -10).forEach(System.out::println);

        Stream<String> citiesStream = Arrays.stream(new String[] {"Moscow", "Berlin", "Poland"});
        citiesStream.sorted().forEach(System.out::println);

        String[] names = {"Timur", "Maxim", "Ruslan"};
        Stream<String> namesStream = Stream.of(names);
        namesStream.sorted().forEach(System.out::println);

    }
}
