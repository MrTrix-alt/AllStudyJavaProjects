package learning.java.streamapi.upperbase.operations.reduce;

import learning.java.streamapi.upperbase.operations.mainoperations.Phone;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo
{

    public static void main(String[] args)
    {
        // 1ая форма метода reduce():
        System.out.println("1ая форма метода Optional<T> reduce(BinaryOperator<T> accumulator):");
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
        result.ifPresent(System.out::println);

        // 2ая форма метода reduce():
        System.out.println("2ая форма метода T reduce(T identity, BinaryOperator<T> accumulator):");
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String> sentence = wordsStream.reduce((x,y)->x + " " + y);
        System.out.println(sentence.get());

        Stream<String> wordsStream1 = Stream.of("мама", "мыла", "раму");
        String sentence1 = wordsStream1.reduce("Результат:", (x,y) -> x + " " + y);
        System.out.println(sentence1); // Результат: мама мыла раму

        // 3ая форма метода reduce():
        System.out.println("3ая форма метода " +
                "U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner):");

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000),
                new Phone("LG G 4", 32000));

        int sum = phoneStream.reduce(0,
                (x, y) -> {
                    if (y.getPrice() < 50000)
                    {
                        return x + y.getPrice();
                    }
                    else
                    {
                        return x + 0;
                    }
                },
                (x, y) -> x + y);

        System.out.println("Стоимость всех телефонов в потоке: " + sum); // 117000

    }
}
