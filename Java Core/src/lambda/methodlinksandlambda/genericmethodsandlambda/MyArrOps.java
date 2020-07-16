package lambda.methodlinksandlambda.genericmethodsandlambda;

/*
    В классе определяем метод countMatching(),
    возвращающий количество элементов в массиве,
    равных указанному значению
 */
public class MyArrOps {

    // Обобщенный метод в необобщенном классе
    <T> int countMatching(T[] vals, T v) {
        int count = 0;

        for (int i = 0; i < vals.length ; i++) {
            if (vals[i] == v) {
                count++;
            }
        }
        return count;
    }
}
