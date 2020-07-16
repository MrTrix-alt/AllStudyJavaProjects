package lambda.methodlinksandlambda.methodsofobject.objandlambda;

public class BubbleSort {

    int[] bubbleSort(int [] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int buffer = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buffer;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}
