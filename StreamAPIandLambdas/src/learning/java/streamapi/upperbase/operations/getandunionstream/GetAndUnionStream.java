package learning.java.streamapi.upperbase.operations.getandunionstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class GetAndUnionStream
{

    public static void main(String[] args)
    {
        // метод takeWhile()
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, -3, -2, -1, 0, 1, 2, 3, -4, -5);
        Stream<Integer> integerStream = numbers.stream();
        System.out.println("Using takeWhile():");
        integerStream
             // .sorted() чтобы захватить все элементы удовлетворяющих условию в takeWhile
                .takeWhile(i -> i < 0)
                .forEach(System.out::println);
        // метод dropWhile()
        System.out.println("\nUsing dropWhile():");
        Stream<Integer> integerStream1 = numbers.stream();
        integerStream1
             // .sorted() чтобы захватить все элементы удовлетворяющих условию в dropWhile
                .dropWhile(i -> i < 0)
                .forEach(System.out::println);

        // метод concat()
        System.out.println("\nUsing method concat():");
        Stream<String> names1 = Stream.of("Timur Male", "Phil Male", "Alex Male");
        Stream<String> names2 = Stream.of("Albina Female", "Minsulu Female", "Lena Female");

        Stream<String> unionStream = Stream.concat(names1, names2).sorted();
        unionStream.forEach(System.out::println);

        // метод distinct()
        System.out.println("\nUsing method distinct():");
        Stream<String> names = Stream.of("Timur", "Phil", "Alex", "Timur", "Alex", "Ravil");
        names.distinct().sorted().forEach(System.out::println);





        
    }
}
