package lambda.simple.ExampleTwo;

class LambdaDemoOne {
    public static void main(String[] args) {
        // Проверка четности, используя лямбда-выражение
        LambdaWithParameter isEven = (n) -> (n % 2) == 0;
        int[] arr = {1, 2, 10, 32, 45, 36, 43};
        for (int i = 0; i < arr.length; i++) {
            if (!isEven.test(i)) {
                System.out.println("Элемент массива " + arr[i] + " является четным");
            }
        }
    }
}
