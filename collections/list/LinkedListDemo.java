package collections.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {


        // Создание связного списка
        LinkedList<String> linkedList = new LinkedList<>();

        // Вводим элементы в связной список
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Fourth");
        linkedList.add("Fifth");
        linkedList.add("First");

        // Используем метод addFirst() для введения элемента в начало списка
        linkedList.addFirst("Zero");
        // Добавление элемента по индексу
        linkedList.add(1, "New Element");
        System.out.println("Содержимое связного списка linkedList: " + linkedList);

        // Удаление первого и последнего элементов в списке
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Содержимое связного списка linkedList после удаления элементов: " + linkedList);

        linkedList.set(2, linkedList.get(2) + " edited");
        System.out.println("Содержимое связного списка после изменения 2-ого элемента: " +  linkedList);


    }
}

