package lambda.methodlinksandlambda.genericmethodsandlambda;

public class GenericMethodDemo {

    <T> int myOp(Function<T> function, T[] vals, T v) {
        return function.func(vals, v);
    }

    public static void main(String[] args) {

        GenericMethodDemo obj = new GenericMethodDemo();
        MyArrOps arrOps = new MyArrOps();

        // Создаем массив, используя оболочку Integer
        Integer[] vals = { 1, 2, 23, 44, 88, 32, 88, 67 };

        // Строковый массив
        String[] strs = { "One", "Two", "Three", "One", "Four", "One"};
        int count;

        count = obj.myOp(arrOps::countMatching, vals, 88);
        System.out.println("Массив vals содержит " + count + " числа(-ел) 88");

        count = obj.myOp(arrOps::countMatching, strs, "One");
        System.out.println("Массив vals содержит " + count + " элемента(-ов) - 'One'");





    }
}
