package lambda.methodlinksandlambda.staticmethod;

public class MyStringOps {
    // в этом методе определяется статический метод
    // strReverse()

    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
