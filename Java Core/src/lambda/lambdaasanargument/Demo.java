package lambda.lambdaasanargument;

public class Demo {
    public static void main(String[] args) {

        LambdaAsArgumentDemo lambda = new LambdaAsArgumentDemo();

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        System.out.println("Исходная строка inStr: " + inStr);

        outStr = lambda.stringOp(str -> str.toUpperCase(), inStr);
        System.out.println("Строка outStr в верхнем регистре: " + outStr);

        Function<String> lowerCase = str -> str.toLowerCase();

        // Передача ссылки lowerCase в качестве первого параметра
        // stringOp(), определенного в классе LambdaAsArgumentDemo
        System.out.println("Исходная строка в нижнем регистре: " + lambda.stringOp(lowerCase, inStr));


        outStr = lambda.stringOp(str -> {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ');
                    result += str.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println("Строка outStr без пробелов: " + outStr);

        









    }
}
