package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    private static <T> String arrayToString(T[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        /*
            Преобразование ArrayList в Array необходимо в следующих случаях:
                1) Ускорение выполнения некоторых операций;
                2) Передача массива в качестве параметра методам, которые
                   не перегружаются, чтобы принимать коллекци непосредственно;
                3) Интеграция нового кода, основанного на коллекциях, с унаследованным
                   кодом, который не распознает коллекции.
         */
        List<String> arrListStr = new ArrayList<>();

        arrListStr.add("Mark");
        arrListStr.add("German");
        arrListStr.add("Max");
        arrListStr.add("Adam");
        // Коллекции можно перебирать с помощью цикла for в стиле "for each"
        for(String str : arrListStr) {
            System.out.print(str + "\n");
        }

        // Создание статического массива с размером ArrayList
        String[] simpleArr = new String[arrListStr.size()];
        simpleArr =  arrListStr.toArray(simpleArr);
        System.out.print("Преобразование динамического массива в статический: " + arrayToString(simpleArr));


    }
}
