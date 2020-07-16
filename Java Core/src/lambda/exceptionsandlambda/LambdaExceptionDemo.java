package lambda.exceptionsandlambda;

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] arr = { 1.0, 2.0, 23.0, 135.0 };
        // Вычисляем среднее значение массива с типом double

        // локальная переменная, которая может быть захвачена лямбда-выражением
        int r = 10;

        // Тип параметра лямбды выводится из целевого контекста
        // В данном случае n - является массивом, который мы передаем в методе,
        // определенном в функциональном интерфейсе DoubleNumericArrayFunc
        // Необязательно указывать double[] n
        DoubleNumericArrayFunc average = n -> {
            double sum = 0;

            // n - является массивом, который мы передаем в методе,
            // определенном в функциональном интерфейсе DoubleNumericArrayFunc
            if (n.length == 0) {
                throw new EmptyArrayException();
            }

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            // с локальной переменной в лямбда-выражении можно работать только таким образом
            int v = (int) (sum + r);
            System.out.println("Закастили операцию int v = sum + r: " + v);
            // Нельзя видоизменить захваченную локальную переменную,
            // т.к. захваченная локальная переменная является действительно завершенной
            // r++ || r = 134


            // Можно изменять переменные экземпляра класса внутри лямбда-выражений
            // если только они не являются завершенными
            EmptyArrayException obj = new EmptyArrayException();
            obj.setNumber(14);
            int objExcp = obj.getNumber();
            System.out.println(++objExcp);

            return sum / n.length;
        };
            System.out.println("Average value of array is: " + average.func(arr));

            // Выполнение этой строки кода приводит к генерации исключения
            System.out.println(average.func(new double[0]));


    }
}
