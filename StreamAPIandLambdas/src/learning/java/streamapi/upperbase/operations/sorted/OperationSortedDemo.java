package learning.java.streamapi.upperbase.operations.sorted;

import java.util.stream.Stream;

public class OperationSortedDemo
{

    public static void main(String[] args)
    {
        Phone[] phones = {
                new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300)
        };

        Phone.PhoneComparator phoneComparator = new Phone.PhoneComparator();
        Stream<Phone> phoneStream = Stream.of(phones);
        phoneStream
                .sorted(phoneComparator)
                .forEach(p -> System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));
    }
}
