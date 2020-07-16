package lambda.lambdaasanargument;

public class LambdaAsArgumentDemo {

    String stringOp(Function<String> sf, String s) {
        return sf.func(s);
    }
}
