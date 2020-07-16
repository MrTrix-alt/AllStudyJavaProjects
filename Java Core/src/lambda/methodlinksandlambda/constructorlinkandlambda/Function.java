package lambda.methodlinksandlambda.constructorlinkandlambda;

// Определяем метод, возвращающий ссылку
// на класс DemoClass
interface Function<T>{
    DemoClass<T> func(T val);
}
