package learning.java.generics.base;

public class GenDemo
{
    public static void main(String[] args)
    {
        // Обобщенный класс
        Account<String> acc1 = new Account<>("2345");
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<>(2345);
        int acc2Id = acc2.getId();
        System.out.println(acc2Id);

        // Обобщеный интерфейс
        Accountable<String> accountable = new Acc("5431");
        String id = accountable.getId();
        ((Acc)accountable).print();
        System.out.println(id);

        // Использование обобщенного метода
        Account acc = new Account(234);
        System.out.println(acc.getId());
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        acc.<Integer>print(numbers);

        // Использование обобщенного конструктора
        Car car = new Car(123, 320);
        System.out.println("car Id: " + car.getId());
    }
}

