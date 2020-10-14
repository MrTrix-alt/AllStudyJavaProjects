package learning.java.lambdas.base;

public class LambdaApp
{

    static int a = 10;
    static int b = 20;

    public static void main(String[] args)
    {

        Operationable operation1 = (x, y) -> x + y;

        Operationable operation2 = (x, y) -> x * y;

        int result1 = operation1.calculate(10, 20);
        int result2 = operation2.calculate(10, 20);

        System.out.println("Result calculating of operation1 {Lambda-expression1}: " +  result1);
        System.out.println("Result calculating of operation2 {Lambda-expression2}: " +  result2 + "\n");

        Printable printer = (str) -> System.out.println(str); // Терминальные лямбда-выражения
        printer.print("Result calculating of printer:" + "Hello!"  + "\n");


        System.out.println("LambdaApp.x before lambda: " + LambdaApp.a);
        MathOperationable mathOperation = () ->
        {

            LambdaApp.a = 25;

            return a + b;
        };

        System.out.println("Result calculating of mathOperation: " + mathOperation.calculate());
        // изменение "глобальной" переменной
        System.out.println("LambdaApp.x after lambda: " + LambdaApp.a  + "\n");


        int n = 10;
        int m = 20;
        MathOperationable mathOperation1 = () -> m + n;

        // n = 100; - также нельзя изменить локальную переменную после лябмды!
        // т.к. она неявно объявляется final
        System.out.println("Result calculating of mathOperation1: " + mathOperation1.calculate()  + "\n");

        // code block in lambda-expressions:
        Operationable operation3 = (x, y) ->
        {
            if (x >= 0)
            {
                return x + y;
            }
            else
            {
               return x / y;
            }
        };
        System.out.println("Result calculating of operation3: " + operation3.calculate(-5, 2) + "\n");

        // Generic Functional Interface:

        // Использование обобщений в лямбдах не допускается
        // В этом случае надо типизировать объект интерфейса определенным типом,
        // который потом будет применяться в лямбда-выражении.

        // Типизированные объекты обобщенного интерфейса:
        GenericFunctionalInterface<Integer> intObjOfGenFuncInterface = (x, y) -> x + y;
        GenericFunctionalInterface<String> stringObjOfGenFuncInterface = (x, y) -> x + y;

        System.out.println("Result calculating of intObjOfGenFuncInterface: " +
                intObjOfGenFuncInterface.calculate(5, 10));

        System.out.println("Result calculating of stringObjOfGenFuncInterface: " +
                stringObjOfGenFuncInterface.calculate("Hello, ", "this is Lambda!"));




    }
}
