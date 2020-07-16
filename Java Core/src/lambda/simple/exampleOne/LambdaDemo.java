package lambda.simple.exampleOne;

class LambdaDemo {
    public static void main(String[] args) {

        // Объявление ссылки на функциональный интерефейс LambdaNumberTest
        LambdaNumberTest value;
        /* При присваивании лямбда-выражении ссылочной переменной value
           создается экземпляр класса, в котором лямбда реализует
           метод getValue() из функционального интерфейса LambdaNumberTest
        */

        value = () -> 150.34;
        double num = 143.34;
        while (!(num == value.getValue())) {
            num++;
            if (num == value.getValue())
                System.out.println(value.getValue() + " == " + num);
        }

        value = () -> Math.random() * 100;
        System.out.println(value.getValue());

        /* Лябмда-выражение должно быть совместимым с абстрактным методом,
           определяемым в функциональной интерфейе.
           Следующая строка кода ошибочна:
         */
        // value = () -> "132.32";

    }
}
