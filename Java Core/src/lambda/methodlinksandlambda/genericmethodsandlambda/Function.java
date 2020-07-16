package lambda.methodlinksandlambda.genericmethodsandlambda;


// Функциональный интерфейс для обработки массива значений
// объявленный в необобщенном классе
public interface Function<T> {
    int func(T[] vals, T v);
}
