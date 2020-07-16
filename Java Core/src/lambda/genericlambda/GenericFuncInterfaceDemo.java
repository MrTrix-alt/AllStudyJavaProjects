package lambda.genericlambda;


public class GenericFuncInterfaceDemo {
    public static void main(String[] args) {

        /* В данном примере мы использовали обобщения для того,
           чтобы можно было передавать и возвращать разные типы данных,
           не создавая для этого отдельные интерфейсы для работы над отдельным
           типом данных
         */

        // Реализация примеров из пакета block.exampleOne & block.exampleTwo
        // Нахождение факториала
        Function<Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            // оператор return необходим для возврата значения из блочного лямбда-выражения
            return result;
        };
        System.out.println("Factorial of number 3: " + factorial.func(3));

        // Обратный порядок символом в строке
        Function<String> reverse = str -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Example one: " + reverse.func("Java"));




    }
}
