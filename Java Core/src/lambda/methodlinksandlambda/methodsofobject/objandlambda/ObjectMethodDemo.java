package lambda.methodlinksandlambda.methodsofobject.objandlambda;

public class ObjectMethodDemo {

    int[] sort(SortArray sortArray, int[] arr) {
        return sortArray.sort(arr);
    }

    public static void main(String[] args) {

        int[] array = { 34, 22, 13, 81, 32, 53, 16, 3, 64, 42, 74, 45, 91 };
        int[] sortArray;

        ObjectMethodDemo obj = new ObjectMethodDemo();
        BubbleSort sort = new BubbleSort();


        System.out.println("Неотсортированный массив: " + obj.arrayToString(array));
        sortArray = obj.sort(sort::bubbleSort, array);
        System.out.println("Отсортированный (пузырьком) массив: " + obj.arrayToString(sortArray));

    }

    private  String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
