package lambda.methodlinksandlambda.staticmethod;

public class StatMethodDemo {
    /*  В это методе функциональный интерфейс указывается
        в качестве типа первого его параметра.
        Следовательно, ему может быть передан
        любой экземпляр класса этого интерфейса,
        включая и ссылку на метод
     */

    static String stringOp(StringFunc sf, String str) {
        return sf.func(str);
    }

    public static void main(String[] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        // Ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);

    }
}
