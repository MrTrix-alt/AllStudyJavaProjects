package lambda.methodlinksandlambda.constructorlinkandlambda;

public class DemoClass<T> {
    private T val;

    // Конструткор по умолчанию
    DemoClass() {
        val = null;
    }

    DemoClass(T val) {
         this.val = val;
    }

    T getVal() {
        return this.val;
    }

}
