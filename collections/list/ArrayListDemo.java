package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Создание динамического массива с разными типами данных
        List<Integer> list = new ArrayList();
        System.out.println("Изначальный размер массива: " + list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("Порядок элементов в массиве: " + list);
        System.out.println("Размер массива после ввода элементов: " + list.size());
        list.add(0, 0);
        System.out.println("Порядок элементов в массиве и размер массива " +
                "после добавления по индексу: " + list + " " + list.size());
        ArrayList<Integer> extendingList = new ArrayList<>();
        extendingList.add(-4);
        extendingList.add(-3);
        extendingList.add(-2);
        extendingList.add(-1);
        extendingList.addAll(4, list);
        System.out.println("Наследующий массив extendingList " +
                "после добавление массива list: " + extendingList);




    }
}
