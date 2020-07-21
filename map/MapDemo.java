package map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // Map не расширяет интерфейс Collections

        System.out.println("Пример работы с HashMap");
        hashMapExample();

        System.out.println("Пример работы с  LinkedHashMap");
        LinkedHashMapExample(); 
    }
    private static void hashMapExample() {
        // Key - String, Value - Integer
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);

        // Сохранение в HashMap происходит по ключу
        System.out.println(map);
        // Доступ к элементам получается по ключу
        System.out.println("Февраль по счету в календаре: " + map.get("February"));
        // Несуществующие элементы имеют значение null
        System.out.println("Декабрь по счету в календаре: " + map.get("December"));

        System.out.println("Пробег (не используя цикл for в стиле foreach) по Map " +
                "с помощью интерфейсов Entry<K, V> и Iterator<E>:");
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Пробег по Map используя цилк for в стиле foreach:");
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("Пробег по Map используя ключи:");
        Set<String> key = map.keySet();
        for(String k : key) {
            System.out.println(k + "=" + map.get(k));
        }



    }

    private static void LinkedHashMapExample() {
        // Key - String, Value - Integer
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);

        // Сохранение элементов в LinkedHashMap происходит в порядке добавления
        // из-за этого падает скорость поиска элементов
        System.out.println(map);
    }
}
