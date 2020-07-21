package collections.set;

import java.util.LinkedHashSet;
import java.util.SortedSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // класс LinkedHashSet расширяет класс HashSet,
        // не имея собственных методов

        LinkedHashSet<String> stringSet = new LinkedHashSet<>();
        // Добавленные элементы в хэш-множество выводятся из него
        // в том порядке, в котором были введены
        stringSet.add("1");
        stringSet.add("3");
        stringSet.add("2");
        System.out.println(stringSet);


    }
}
