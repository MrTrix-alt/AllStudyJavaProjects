package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Класс TreeSet расширает класс Abstract
        // и реализует интерфейс NavigableSet
        TreeSet<Integer> tree = new TreeSet<>();
        // Вызывая конструктор с компаратором, элементы будут
        // отсортированы в порядке заданном компаратором
        // Также можно вызвать конструктор, которому передается
        // SortedSet и порядок будет задан отсортированным списком
        tree.add(2);
        tree.add(3);
        tree.add(5);
        tree.add(4);
        System.out.println(tree);
        // Т.к. TreeSet реализует интерфейс NavigableSet
        // можно вывести множество от элемента 2 (включительно) и до 4 (исключительно)
        System.out.println(tree.subSet(2, 4));



    }


}
