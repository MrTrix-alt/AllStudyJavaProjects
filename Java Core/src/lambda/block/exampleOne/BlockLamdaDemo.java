package lambda.block.exampleOne;


public class BlockLamdaDemo {
    public static void main(String[] args) {

        /* Блочное лямба-выражение в данном случае
           вычисляет факториал числа
         */

        NumericFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            // оператор return необходим для возврата значения из блочного лямбда-выражения
            return result;
        };
        System.out.println("Factorial of number 3: " + factorial.func(3));
        System.out.println("Factorial of number 12: " + factorial.func(12));

    }
}
