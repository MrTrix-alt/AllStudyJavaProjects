package collections.set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        // хэш-множество - элементы в множестве являются уникальными
        HashSet<String> hashSet = new HashSet<>();
        // Добавленные элементы в множестве не сохраняются в отсортированном порядке
        // порядок их вывода может варьироваться
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("7");
        hashSet.add("8");
        // Добавление элемента, соответствующего элементу в хэш-множестве,
        // не произойдет, как и к перезаписи
        hashSet.add("5");
        System.out.println(hashSet);

        Object b = new Object();




    }
}
