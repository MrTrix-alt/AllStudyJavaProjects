package collections.usingcollectionswithownobjects;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        /*
            На уровне синтаксиса языка Java ArrayList и LinkedList работают идентично.
            Использовать ArrayList выгодно (с большой скоростью для доступа к элементу по индексу)
            для записи, чтения, вывода элементов в список,
            но при удалении элемента списка происходит копирование элементов для того, чтобы их перезаписать
            на [index - 1] в списке, и из-за этого происходит дорогое использование памяти.
            Использование LinkedList имеет медленный доступ по индексу, но т.к. он является связным списком,
            то его можно использовать для быстрого удаления или добавления элементов - в отличии от ArrayList не приходится
            копировать элементы, чтобы сдвинуть их на индекс назад, мы просто перепривязываем ссылку одно элемента
            к другому элемента при удалении или добавлении.
         */

        System.out.println("Пример работы с  ArrayList:");
        arrayListExample();
        System.out.println("Пример работы с  LinkedList:");
        linkedListExample();

        /*
            Отличие списка от множества заключается в том, что список является пронумерованным (индексированным),
            а множество построено на хэше и уникальности значений.
            В списке могут повторяться значения - в множестве они будут записаны Jav-ой.
            С помощью хэш-кода мы можем очень быстро находить элементы в множестве - со скоростью О1.

            LinkedHashSet отличается от HashSet сортированным списком в порядке добавления их в множество

         */

        System.out.println("Пример работы с HashSet:");
        hashSetExample();
        System.out.println("Пример работы с  LinkedHashSet:");
        linkedHashSetExample();
        System.out.println("Пример работы с  TreeSet:");
        treeSetExample();

    }

    private static void arrayListExample() {
        User user1 = new User(1,"Phil", 22, "8-917-324-32-13", "philbox@mail.com");
        User user2 = new User(2,"Timur", 25,"8-917-654-43-23", "timbox@mail.com");
        User user3 = new User(3,"Alex", 21, "8-917-123-52-46", "alexbox@mail.com");
        User user4 = new User(4,"Max", 42, "8-917-344-68-98", "maxbox@mail.com");
        User user5 = new User(1, "Max", 42, "8-917-344-68-98", "maxbox@mail.com");

        ArrayList<User> userDB = new ArrayList<>();
        userDB.add(user1);
        userDB.add(user2);
        userDB.add(user3);
        userDB.add(user4);
        // Вывод данных объектов класса User, используя переопределенный метод toString
        System.out.println(userDB);
        // Используя метод, определенный в списке ArrayList, и переопределенный метод equals() в классе User
        // можно узнать - содержится ли такой объект в списке userDB
        System.out.println(userDB.contains(user5));

        // Используя переопределенный метод hashCode() в классе User, настроили хэш в качестве пользовательского
        System.out.println(Integer.toHexString(user1.hashCode()));
        System.out.println(Integer.toHexString(user5.hashCode()));
    }

    private static void linkedListExample() {
        User user1 = new User(1,"Phil", 22, "8-917-324-32-13", "philbox@mail.com");
        User user2 = new User(2,"Timur", 25,"8-917-654-43-23", "timbox@mail.com");
        User user3 = new User(3,"Alex", 21, "8-917-123-52-46", "alexbox@mail.com");
        User user4 = new User(4,"Max", 42, "8-917-344-68-98", "maxbox@mail.com");
        User user5 = new User(1, "Max", 42, "8-917-344-68-98", "maxbox@mail.com");

        LinkedList<User> userDB = new LinkedList<>();
        userDB.add(user1);
        userDB.add(user2);
        userDB.add(user3);
        userDB.add(user4);
        // Вывод данных объектов класса User, используя переопределенный метод toString
        System.out.println(userDB);
        // Используя метод, определенный в списке LinkedList, и переопределенный метод equals() в классе User
        // можно узнать - содержится ли такой объект в списке userDB
        System.out.println(userDB.contains(user5));

        // Используя переопределенный метод hashCode() в классе User, настроили хэш в качестве пользовательского
        System.out.println(Integer.toHexString(user1.hashCode()));
        System.out.println(Integer.toHexString(user5.hashCode()));
    }


    private static void hashSetExample() {
        Set<String> set = new HashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("April");
        set.add("May");
        // При добавлении элементов у каждого высчитывается хэш-код
        // и по этому хэш-коду складываюстя (беспорядочно) в множество
        // Мы также по хэш-коду ищем элементы
        System.out.println(set);
    }

    private static void linkedHashSetExample() {
        Set<String> set = new LinkedHashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");
        set.add("April");
        set.add("May");
        // Вывод элементов происходит в порядке их добавления в множество
        System.out.println(set);
    }

    private static void treeSetExample() {
        User user1 = new User(1,"Phil", 22, "8-917-324-32-13", "philbox@mail.com");
        User user2 = new User(2,"Timur", 25,"8-917-654-43-23", "timbox@mail.com");
        User user3 = new User(3,"Alex", 21, "8-917-123-52-46", "alexbox@mail.com");
        User user4 = new User(4,"Max", 42, "8-917-344-68-98", "maxbox@mail.com");

        Set<User> userDB = new TreeSet<>(Arrays.asList(user4, user3, user1, user2));

        /*
            Сортировка происходит c помощью обобщенного интерфейса Comparable<T> и его единственного
            метода compareTo.
            Чтобы сортировать создаваемые нами объекты необходимо имплементировать интерфейс Comparable<T>
            и переопределить метод compareTo(), т.к. Java не знает, как сортировать элементы, например,
            класса User
        */

        System.out.println(userDB);

    }



}
