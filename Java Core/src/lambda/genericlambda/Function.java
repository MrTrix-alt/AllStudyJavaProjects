package lambda.genericlambda;

// Применяем обобщеный функциональный интерфейс
// для разнотипных лямба-выражений

public interface Function<T> {
    T func(T t);
}
