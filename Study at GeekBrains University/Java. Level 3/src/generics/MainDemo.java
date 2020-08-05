package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class MainDemo {

    // Написать метод, который меняет два элемента массива местами
    // Массив может быть любого ссылочного типа
    static <T> T[] changeOver(T[] arr, int indexOne, int indexTwo) {
        // буффер
        T buffer = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = buffer;
        return arr;
    }

    // Написать метод, который преобразует массив в ArrayList
    static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void main(String[] args) {

        // Задание №1.
        Character[] chArr = {'1', '2', '3'};
        chArr = changeOver(chArr, 0, 2);
        System.out.println(toArrayList(chArr));


        Apple ap1 = new Apple();
        Apple ap2 = new Apple();
        Apple ap3 = new Apple();
        Apple ap4 = new Apple();

        Orange or1 = new Orange();
        Orange or2 = new Orange();

        Box<Apple> appleBox = new Box<>(ap1, ap2, ap3);
        Box<Orange> orangeBox = new Box<>(or1, or2);
        // Сравниваем коробки с фруктами, когда их вес одинаков
        appleBox.compare(orangeBox);

        // Добавляем одно яблоко в коробку
        appleBox.addFruit(ap4);

        // Сравниваем вес коробок с яблоками и апельсинами после добавления
        appleBox.compare(orangeBox);

        // Создаем новую коробку, чтобы переложить в нее из апельсины из первой,
        // при этом первая коробка остается пустой, используя метод clear() в классе Box
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.shift(orangeBox1);
        System.out.println("Вес коробки, в которую переложили фрукты: " + orangeBox1.getWeightBox());

        // Чистим коробку от элементов
        appleBox.clear();

    }
}
