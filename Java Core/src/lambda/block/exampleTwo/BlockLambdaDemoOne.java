package lambda.block.exampleTwo;

public class BlockLambdaDemoOne {
    public static void main(String[] args) {

        // Следующее блочное лямбда-выржение изменяет на обратный
        // порядок следования символов в строке
        StringFunc reverse = str -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Example one: " + reverse.func("Java"));
        System.out.println("Example two: " + reverse.func("Spring"));
    }
}
